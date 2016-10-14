import java.awt.TextArea;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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

	public static boolean AddUser(String p, String u) {

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}

			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeUpdate("INSERT INTO User VALUES ('" + u + "', '" + p + "')");

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

			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeUpdate("DELETE FROM User WHERE UserName='" + u + "'; ");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean AddMerchandise(String add_code, String add_name, String add_manufacturer, String add_initial,
			String add_VAT, String add_unitaryPrice, String add_sellPrice, String add_description) {

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}

			int rs = 0;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeUpdate("INSERT INTO item values ('" + add_code + "', '" + add_name + "', '"
					+ add_manufacturer + "', '" + add_initial + "', '" + add_VAT + "', '" + add_unitaryPrice + "', '"
					+ add_sellPrice + "', '" + add_description + "'); ");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static ArrayList Find(int cod) {

		ArrayList<Integer> find = new ArrayList<Integer>();

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {

			}

			ResultSet rs = null;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeQuery("SELECT * FROM Item WHERE Code like'" + cod + "%'; ");

			while (rs.next()) {

				int cod_array = rs.getInt("code");
				find.add(cod_array);

			}

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return find;

	}

	public static void login(String user, String pass) {

		ArrayList<Integer> find = new ArrayList<Integer>();

		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {
			}

			ResultSet rs = null;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeQuery("SELECT * FROM User WHERE username='" + user + "';");

			while (rs.next()) {
				if (rs.getString(0) == "root") {

					Root_Frame v1 = new Root_Frame();
					v1.setVisible(true);

					Login_Frame v2 = new Login_Frame();
					v1.setVisible(false);

				} else {

					Login_Frame v1 = new Login_Frame();
					v1.setVisible(true);

					Login_Frame v2 = new Login_Frame();
					v1.setVisible(false);

				}

			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

	}

	public static boolean changeIVA(String code, int newPerc) {
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

	public static boolean Logs(String code, int newPerc, int by) {

		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			ResultSet rs = null;
			Statement cmd = null;

			cmd = con.createStatement();
			if (by == 1) {
				rs = cmd.executeQuery("SELECT * FROM log WHERE code='" + code + "' and ;");
			} else {

				if (by == 2) {

				} else {

				}
			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean buyMerch(String code, int amount) {
		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();

			cmd.executeUpdate("update item set Stock = (Stock + " + amount + ") where code = " + code + ");");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean sellMerch(String code, int amount) {
		boolean x = false;
		try {
			int stock = 0;
			Connection con = conection();
			ResultSet rs = null;
			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();
			rs = cmd.executeQuery("select stock from item where code =" + code + ";");
			while (rs.next()) {
				stock = rs.getInt(1);
			}
			if (amount > stock) {
				JOptionPane.showMessageDialog(null, "ERROR: no se puede vender más de lo que se tiene en stock");
			} else {
				if (stock == amount) {
					JOptionPane.showMessageDialog(null, "ALERTA: el stock quedará en 0");
				}
				cmd.executeUpdate("update item set Stock = (Stock - " + amount + ") where code = " + code + ");");
			}
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;

	}

	public static boolean Find_Description(int code, JTable table, DefaultTableModel model) {

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

			rs1 = cmd.executeQuery("SELECT count(*) FROM item WHERE code like '" + code + "%';");
			while (rs1.next()) {

				count = rs1.getInt("count(*)");

			}
			cmd = con.createStatement();

			rs = cmd.executeQuery("SELECT * FROM item WHERE code like '" + code + "%';");
			int i = 0;
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

			Object[] columnsName = new Object[8];

			columnsName[0] = "Codigo";
			columnsName[1] = "Nombre";
			columnsName[2] = "Fabricante";
			columnsName[3] = "Stock";
			columnsName[4] = "Iva";
			columnsName[5] = "Precio de venta";
			columnsName[6] = "Precio unitario";
			columnsName[7] = "Descripcion";

			model.setColumnIdentifiers(columnsName);

			for (int i2 = 0; i2 < count; i2++) {

				rowData[0] = cod.get(i2);
				rowData[1] = name.get(i2);
				rowData[6] = stock.get(i2);
				rowData[2] = manu.get(i2);
				rowData[3] = vat.get(i2);
				rowData[4] = uprice.get(i2);
				rowData[5] = sprice.get(i2);
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

}