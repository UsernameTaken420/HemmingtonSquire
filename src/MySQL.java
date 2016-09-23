import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
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
	
	
	public static boolean AddUser(JPasswordField p,JTextField u){
		
		boolean x = false;
		
		String user="root";
		String pw="RootLindo"; 
		String db="hemmingtonsquire";
		
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

			
			String uS= u.getText();
			String pS= p.getText();

			rs = cmd.executeUpdate("INSERT INTO User VALUES ('" + uS + "', '" + pS + "')");

			
			con.close();
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x=false;
		}
			
		return x;
		
		
		
	}
	
public static boolean RemoveUser(JTextField u){
		
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

			String uS= u.getText();

			rs = cmd.executeUpdate("DELETE FROM User WHERE UserName='"+ u +"'; ");

			
			con.close();
		}catch(SQLException ex){
			
			JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
			x=false;
		}
			
		return x;
		
		
		
	}

public static boolean AddMerchandise(JTextField add_code,JTextField add_name,
		JTextField add_manufacturer,JTextField add_initial, JTextField add_VAT,
		JTextField add_unitaryPrice,JTextField add_sellPrice,JTextArea add_description){
	
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


		rs = cmd.executeUpdate("INSERT INTO item values ('" + add_code.getText() +"', " + add_name.getText()  +"', "
				+ add_manufacturer.getText()  +"', "+ add_initial.getText()  +"', "+ add_VAT.getText()  +"', "
				+ add_unitaryPrice.getText()  +"', "
				+ add_sellPrice.getText()  +"', "+ add_description.getText()  +"'); ");

		
		con.close();
	}catch(SQLException ex){
		
		JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
		x=false;
	}
		
	return x;
	
	
	
}

}