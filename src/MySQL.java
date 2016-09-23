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

}
