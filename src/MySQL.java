import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static String userS = "pruebas";

	private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	private static Date date = new Date();

	public static boolean register() {

		boolean x;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			x = true;

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, e.toString());

			x = false;

		}

		return x;

	}

	public static Connection conection() {
		register();

		String user = "root";
		String pw = "rootlindo";
		String db = "hemmingtonsquire";

		String parche = "?autoReconnect=true&useSSL=false";

		String url = "jdbc:mysql://localhost:3306/" + db + parche;

		Connection con = null;

		try {

			con = DriverManager.getConnection(url, user, pw);

		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			return con = null;
		}

		return con;

	}

	public static boolean AddUser(String p, String u, Boolean t) {

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}

			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();

			if (t == true) {
				rs = cmd.executeUpdate("INSERT INTO User VALUES ('" + u + "', '" + p + "','Admin')");
			} else {
				rs = cmd.executeUpdate("INSERT INTO User VALUES ('" + u + "', '" + p + "','Seller')");

			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean RemoveUser(String u) {

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}
			String user2 = "";
			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();

			ResultSet rs1 = cmd.executeQuery("SELECT * FROM user WHERE username= '" + u + "';");

			while (rs1.next()) {

				user2 = rs1.getString("username");

			}

			if (user2.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No se encuentra el usuario");

			} else {

				cmd = con.createStatement();
				rs = cmd.executeUpdate("DELETE FROM User WHERE UserName='" + u + "'; ");
				JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
			}

			con.close();

		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean AddMerchandise(String code, String add_name, String add_manufacturer, String add_initial,
			int vat, String add_unitaryPrice, String add_sellPrice, String add_description) {

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}

			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();
			rs = cmd.executeUpdate("INSERT INTO item values (" + code + ", '" + add_name + "', '" + add_manufacturer
					+ "', '" + add_initial + "', " + vat + ", '" + add_unitaryPrice + "', '" + add_sellPrice + "', '"
					+ add_description + "',1); ");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static void login(String user, String pass) {

		String type = "";
		String pass2 = null;
		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {
			}

			ResultSet rs = null;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeQuery("SELECT * FROM User WHERE username = '" + user + "';");

			while (rs.next()) {

				pass2 = rs.getString("password");
				type = rs.getString("type");

			}
			if (type.equals("")) {
				JOptionPane.showMessageDialog(null, "Error al ingresar el usuario");
			} else {
				if (pass.equals(pass2)) {
					if (type.equals("Admin")) {
						Root_Frame kys = new Root_Frame();
						Login_Frame.frame.setVisible(false);
						kys.setVisible(true);

					} else {
						User_Frame kys = new User_Frame();
						Login_Frame.frame.setVisible(false);
						kys.setVisible(true);

					}
					userS = user;
				} else {
					JOptionPane.showMessageDialog(null, "Error al ingresar la contraseña");
				}
			}

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

	}

	public static boolean changeVAT(String code, int newPerc) {
		boolean x = false;
		try {
			Connection con = conection();
			Statement cmd = null;

			if (con != null) {

			}

			if (newPerc < 0) {
				JOptionPane.showMessageDialog(null, "ERROR: el porcentaje ingresado no puede ser menor a 0");
				con.close();
			} else {
				cmd = con.createStatement();

				cmd.executeUpdate("UPDATE item set VAT = " + newPerc + " WHERE Code = " + code + ";");

			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean changeSellPrice(String code, int newPrice) {
		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;
			if (newPrice < 0) {
				JOptionPane.showMessageDialog(null, "ERROR: el precio no puede ser menor a 0");
			} else {
				cmd = con.createStatement();

				cmd.executeUpdate("UPDATE item set Sprice = " + newPrice + " WHERE Code = " + code + ";");
			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean changeUnitPrice(String code, int newPrice) {
		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;
			if (newPrice < 0) {
				JOptionPane.showMessageDialog(null, "ERROR: el precio no puede ser menor a 0");
			} else {
				cmd = con.createStatement();

				cmd.executeUpdate("UPDATE item set Uprice = " + newPrice + " WHERE Code = " + code + ";");
			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean buyMerch(String code, int amount, String price) {
		boolean x = true;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();

			cmd.executeUpdate("update item set Stock = (Stock + " + amount + ") where code = '" + code + "';");

			if (price.length() > 10) {
				
				JOptionPane.showMessageDialog(null, "No se puede guardar un precio mayor a 10 cifras");

				cmd = con.createStatement();

				cmd.executeUpdate("insert into log values(0,'" + userS + "','" + dateFormat.format(date) + "', "
						+ amount + ", " + code + ", -" + price + ")");
			}

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean sellMerch(String code, int amount, String price) {
		boolean x = true;

		try {
			int stock = 0;
			Connection con = conection();
			ResultSet rs = null;
			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();
			rs = cmd.executeQuery("select stock from item where code = '" + code + "';");
			while (rs.next()) {
				stock = rs.getInt("stock");

			}
			if (amount > stock) {
				JOptionPane.showMessageDialog(null, "ERROR: no se puede vender más de lo que se tiene en stock");
				x = false;
			} else {
				if (stock == amount) {
					JOptionPane.showMessageDialog(null, "ALERTA: el stock quedará en 0");
				}
				cmd = con.createStatement();

				cmd.executeUpdate("update item set Stock = ( Stock - " + amount + " ) where code = '" + code + "';");
			}

			if (price.length() > 10) {

				cmd = con.createStatement();

				JOptionPane.showMessageDialog(null, "No se puede guardar un precio mayor a 10 cifras");

				cmd.executeUpdate("insert into log values(0,'" + userS + "','" + dateFormat.format(date) + "', "
						+ -amount + ", " + code + ", " + price + ")");
			}

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean Find_Description(int code, JTable table, DefaultTableModel model, boolean up) {

		model.getDataVector().removeAllElements();
		model.fireTableRowsInserted(0, model.getRowCount());

		ArrayList<String> cod = new ArrayList<String>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> manu = new ArrayList<String>();
		ArrayList<String> vat = new ArrayList<String>();
		ArrayList<String> uprice = new ArrayList<String>();
		ArrayList<String> sprice = new ArrayList<String>();
		ArrayList<String> stock = new ArrayList<String>();
		ArrayList<String> des = new ArrayList<String>();

		int count = 0;
		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {
			}

			ResultSet rs = null, rs1 = null;
			Statement cmd = null;
			cmd = con.createStatement();
			if (up == false) {
				rs1 = cmd.executeQuery("SELECT count(*) FROM item WHERE code like '" + code + "%' and status=1;");
			} else {
				rs1 = cmd.executeQuery("SELECT count(*) FROM item WHERE code like '" + code + "%' and status=0;");
			}
			while (rs1.next()) {

				count = rs1.getInt("count(*)");

			}

			if (count == 0) {

				JOptionPane.showMessageDialog(null, "No se ha encontrado similitudes");
			} else {
				JOptionPane.showMessageDialog(null, "Busqueda finalizada");
			}
			cmd = con.createStatement();
			if (up == false) {
				rs = cmd.executeQuery("SELECT * FROM item WHERE code like '" + code + "%' and status=1;");
			} else {
				rs = cmd.executeQuery("SELECT * FROM item WHERE code like '" + code + "%' and status=0;");

			}

			while (rs.next()) {

				cod.add(rs.getString("code"));
				name.add(rs.getString("name"));
				manu.add(rs.getString("manufacturer"));
				vat.add(rs.getString("vat"));
				uprice.add(rs.getString("uprice"));
				sprice.add(rs.getString("sprice"));
				des.add(rs.getString("description"));
				stock.add(rs.getString("stock"));

			}

			Object[] rowData = new Object[8];

			for (int i2 = 0; i2 < count; i2++) {

				rowData[0] = cod.get(i2);
				rowData[1] = name.get(i2);
				rowData[2] = manu.get(i2);
				rowData[3] = stock.get(i2);
				rowData[4] = vat.get(i2);
				rowData[5] = uprice.get(i2);
				rowData[6] = sprice.get(i2);
				rowData[7] = des.get(i2);
				model.addRow(rowData);

			}

			table.setModel(model);

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}
		return x;
	}

	public static void Merch(String tableS, boolean up) {
		try {
			Connection con = conection();
			if (con != null) {

			}

			Statement cmd = null;
			cmd = con.createStatement();

			if (up == false) {
				cmd.executeUpdate("update item set status = 0 where code = '" + tableS + "';");
			} else {
				cmd.executeUpdate("update item set status = 1 where code = '" + tableS + "';");
			}
			con.close();
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
		}

	}

	public static boolean SN(String S) {

		try {
			Integer.parseInt(S);
			if (S.equals("")) {
				return false;
			} else {
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static boolean SN2(String S) {

		try {
			Integer.parseInt(S);
			return true;

		} catch (NumberFormatException e) {

			return false;
		}

	}

	public static void Find_Logs(String year, String month, String day, JTable table, DefaultTableModel model,
			JTextArea text) {

		model.getDataVector().removeAllElements();
		model.fireTableRowsInserted(0, model.getRowCount());

		ArrayList<String> code = new ArrayList<String>();
		ArrayList<String> user = new ArrayList<String>();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<String> movement = new ArrayList<String>();
		ArrayList<String> item = new ArrayList<String>();
		ArrayList<String> price = new ArrayList<String>();

		int count = 0;

		try {

			Connection con = conection();

			if (con != null) {
			}

			ResultSet rs = null, rs1 = null, rs2 = null;
			Statement cmd = null;

			if (month.equals("01")) {
				cmd = con.createStatement();

				rs1 = cmd.executeQuery("SELECT count(*) FROM log WHERE date >= '" + year + "/01/01' and date  <='"
						+ year + "/12/31';");

				cmd = con.createStatement();

				rs = cmd.executeQuery(
						"SELECT * FROM log WHERE date >= '" + year + "/01/01' and date  <='" + year + "/12/31';");

				cmd = con.createStatement();

				rs2 = cmd.executeQuery("SELECT SUM(price) FROM log WHERE date >= '" + year + "/01/01' and date  <='"
						+ year + "/12/31';");

			} else {

				if (day.equals("01")) {
					cmd = con.createStatement();

					rs1 = cmd.executeQuery("SELECT count(*) FROM log WHERE date >= '" + year + "/" + month
							+ "/01' and date  <= '" + year + "/" + month + "/31' ;");

					cmd = con.createStatement();

					rs = cmd.executeQuery("SELECT * FROM log WHERE date >= '" + year + "/" + month
							+ "/01' and date  <= '" + year + "/" + month + "/31';");

					cmd = con.createStatement();

					rs2 = cmd.executeQuery("SELECT sum(price) FROM log WHERE date >= '" + year + "/" + month
							+ "/01' and date  <= '" + year + "/" + month + "/31';");
				} else {
					cmd = con.createStatement();

					rs1 = cmd.executeQuery(
							"SELECT count(*) FROM log WHERE date = '" + year + "/" + month + "/" + day + "';");

					cmd = con.createStatement();

					rs = cmd.executeQuery("SELECT * FROM log WHERE date = '" + year + "/" + month + "/" + day + "';");

					cmd = con.createStatement();

					rs2 = cmd.executeQuery(
							"SELECT sum(price) FROM log WHERE date = '" + year + "/" + month + "/" + day + "';");
				}

			}
			while (rs1.next()) {

				count = rs1.getInt("count(*)");

			}

			if (count == 0) {
				JOptionPane.showMessageDialog(null, "No se ha encontrado movimientos realizados en ese periodo");
			} else {
				JOptionPane.showMessageDialog(null, "Busqueda finalizada");

			}

			while (rs.next()) {

				code.add(rs.getString("code"));
				user.add(rs.getString("user"));
				date.add(rs.getString("date"));
				movement.add(rs.getString("movement"));
				item.add(rs.getString("item"));
				price.add(rs.getString("price"));

			}

			while (rs2.next()) {
				text.setText(rs2.getString("sum(price)"));
			}

			Object[] rowData = new Object[6];

			for (int i2 = 0; i2 < count; i2++) {

				rowData[0] = code.get(i2);
				rowData[1] = user.get(i2);
				rowData[2] = date.get(i2);
				rowData[3] = movement.get(i2);
				rowData[4] = item.get(i2);
				rowData[5] = price.get(i2);

				model.addRow(rowData);

			}

			table.setModel(model);

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
		}
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// System.out.println("isCellEditable: " + rowIndex + " " +
		// columnIndex);
		return false;
	}

}