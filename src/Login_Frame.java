import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login_Frame extends JFrame {

	private JPanel Contenedor;
	private JTextField user_textField;
	private JPasswordField pass_textField;
	private static ArrayList <String> user=new ArrayList <String>();
	private static ArrayList <String> pass=new ArrayList <String>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Frame frame = new Login_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_Frame() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\GitHub\\HemmingtonSquire\\Imagenes\\Ferreteria.png"));

		user.add("Root");
		pass.add("Rootlindo");
		user.add("Usuario");
		pass.add("Usuariolindo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login_Frame.class.getResource("/Imagenes/Ferreteria.png")));

		setTitle("Login Ferreteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 232);
		Contenedor = new JPanel();
		Contenedor.setBackground(SystemColor.inactiveCaption);
		Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Contenedor);
		Contenedor.setLayout(null);
		
		JLabel lblLogin = new JLabel("Nombre:");
		lblLogin.setFont(new Font("Mangal", Font.BOLD, 16));
		lblLogin.setBounds(171, 68, 72, 31);
		Contenedor.add(lblLogin);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setFont(new Font("Mangal", Font.BOLD, 16));
		lblContraseña.setBounds(171, 94, 100, 31);
		Contenedor.add(lblContraseña);
		
		user_textField = new JTextField();
		user_textField.setBounds(281, 76, 107, 20);
		Contenedor.add(user_textField);
		user_textField.setColumns(10);
		
		pass_textField = new JPasswordField();
		pass_textField.setBounds(281, 102, 107, 20);
		Contenedor.add(pass_textField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(171, 45, 0, 127);
		Contenedor.add(separator);
		
		JLabel imagen = new JLabel("");
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setBounds(40, 45, 131, 127);
		Contenedor.add(imagen);
		
		JLabel lblInicioDelSistema = new JLabel("Inicio del sistema");
		lblInicioDelSistema.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblInicioDelSistema.setBounds(281, 45, 120, 20);
		Contenedor.add(lblInicioDelSistema);
		
		JButton Login_Button = new JButton("Login");
		Login_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				/*Login*/
				String Usuario = user_textField.getText();
				String Contraseña = pass_textField.getText();

				if(user.indexOf(Usuario)!=-1){

						if ((pass.get(user.indexOf(Usuario)).equals(Contraseña))) {
							if(Usuario.equals("Root")){
								Root_Frame kys = new Root_Frame();
								Login_Frame frame = new Login_Frame();
								kys.setVisible(true);
								frame.setEnabled(false);
								frame.setAlwaysOnTop(false);
								kys.setAlwaysOnTop(true);

							}else{
								User_Frame kys = new User_Frame();
								Login_Frame frame = new Login_Frame();
								kys.setVisible(true);
								frame.setEnabled(false);
								frame.setAlwaysOnTop(false);
								kys.setAlwaysOnTop(true);

							}
						
						} else {
								JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR",JOptionPane.ERROR_MESSAGE);

						}

				
				}else{
					JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		Login_Button.setBounds(287, 149, 89, 23);
		Contenedor.add(Login_Button);
	}

}
