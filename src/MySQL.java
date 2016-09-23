import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MySQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static boolean register(){
		
		boolean x;
	try {
				
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				JOptionPane.showMessageDialog(null, "Registro exitoso");
				
				x=true;
				
				
			}catch(Exception e){
				
				JOptionPane.showMessageDialog(null, e.toString());
				
				x=false;
				
			}
			
	return x;
		
	}
	
	
	public static boolean AddUser(String p,String u){
		
		boolean x = false;
		
		String user="root";
		String pw="RootLindo"; 
		String db="hemmingtonsquire";
		
		String parche="?autoReconnect=true&useSSL=false";
				
		
		String url="jdbc:mysql://Sec-Lab23-Doc:3306/"+db+parche;
		
		
		Connection con=null;
		
		try{
			
			con=DriverManager.getConnection(url,user,pw);
			
			int rs = 0;
			Statement cmd = null;
			
			cmd = con.createStatement();

			rs = cmd.executeUpdate("INSERT INTO User VALUES ('" + u + "', '" + p + "')");

			
			con.close();
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x=false;
		}
			
		return x;
		
		
		
	}

public static boolean RemoveUser(String u){
		
		boolean x = false;
		
		String user="root";
		String pw="RootLindo"; 
		String db="DataBase";
		
		String parche="?autoReconnect=true&useSSL=false";
				
		
		String url="jdbc:mysql://Sec-Lab23-Doc:3306/"+db+parche;
		
		
		Connection con=null;
		
		try{
			
			con=DriverManager.getConnection(url,user,pw);
			
			if(con!=null){
				
				JOptionPane.showMessageDialog(null, "Se conecto a la base de datos");
			}
			
			int rs = 0;
			Statement cmd = null;
			
			cmd = con.createStatement();

			rs = cmd.executeUpdate("DELETE FROM User WHERE UserName='"+ u +"'; ");

			
			con.close();
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x=false;
		}
			
		return x;
		
		
		
	}

public static boolean AddMerchandise(String add_code, String add_name,
		String add_manufacturer,String add_initial, String add_VAT,
		String add_unitaryPrice,String add_sellPrice, String add_description){
	
	boolean x = false;
	
	String user="root";
	String pw="RootLindo"; 
	String db="DataBase";
	
	String parche="?autoReconnect=true&useSSL=false";
			
	
	String url="jdbc:mysql://Sec-Lab23-Doc:3306/"+db+parche;
	
	
	Connection con=null;
	
	try{
		
		con=DriverManager.getConnection(url,user,pw);
		
		if(con!=null){
			
			JOptionPane.showMessageDialog(null, "Se conecto a la base de datos");
		}
		
		int rs = 0;
		Statement cmd = null;
		
		cmd = con.createStatement();


		rs = cmd.executeUpdate("INSERT INTO item values ('" + add_code +"', " + add_name  +"', "
				+ add_manufacturer  +"', "+ add_initial  +"', "+ add_VAT  +"', "
				+ add_unitaryPrice  +"', "
				+ add_sellPrice  +"', "+ add_description +"'); ");

		
		con.close();
	}catch(SQLException ex){
		
		JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
		x=false;
	}
		
	return x;
	
	
	
}

}