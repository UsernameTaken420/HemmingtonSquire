import java.awt.TextArea;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
	
	public static boolean changeIVA (String code, int newPerc) {
		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();

			cmd.executeUpdate("UPDATE item set VAR = " + newPerc + " WHERE Code = " + code + ";");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;
		
		
	}
	public static boolean buyMerch (String code, int amount) {
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
	
	public static boolean sellMerch (String code, int amount) {
		boolean x = false;
		try {

			Connection con = conection();

			if (con != null) {

			}

			Statement cmd = null;

			cmd = con.createStatement();

			cmd.executeUpdate("update item set Stock = (Stock - " + amount + ") where code = " + code + ");");

			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}

		return x;
		
		
	}
	
	public static boolean Find_Description(int code,JTextArea sell_search_des) {

		ArrayList<String> Find_des = new ArrayList<String>();
		
		boolean x = false;

		try {

			Connection con = conection();

			if (con != null) {
			}

			ResultSet rs = null;
			Statement cmd = null;

			cmd = con.createStatement();

			rs = cmd.executeQuery("SELECT * FROM item WHERE code='" + code + "';");


			while (rs.next()) {
				
				String cod = rs.getString("code");
				Find_des.add(cod);
				
				String name = rs.getString("name");
				Find_des.add(name);
				
				String manufacturer = rs.getString("manufacturer");
				Find_des.add(manufacturer);
				
				String stock = rs.getString("stock");
				Find_des.add(stock);
				
				String vat = rs.getString("vat");
				Find_des.add(vat);
				
				String uprice = rs.getString("uprice");
				Find_des.add(uprice);
				
				String sprice = rs.getString("sprice");
				Find_des.add(sprice);
				
				String des = rs.getString("description");
				Find_des.add(des);
				
				}

				
				String text="Codigo del producto: " + Find_des.get(0) + "\n" + "Nombre del producto: "
						+ Find_des.get(1) + "\n" + "Fabricante: " + Find_des.get(2) + "\n" + "Stock: "
						+ Find_des.get(3)+ "\n" + "IVA: " + Find_des.get(4) + 
						"\n" + "Precio Unitario: "+ Find_des.get(5)+"\n" + "Precio de venta: "+ Find_des.get(6)+
						"\n" + "Descripcion: "+ Find_des.get(7);
				
				sell_search_des.setText(text);
			
			con.close();
		} catch (SQLException ex) {

			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x = false;
		}
		return x;
	}

}