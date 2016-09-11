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
	private JTextField NombreT;
	private JPasswordField ContraseñaT;
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
		
		NombreT = new JTextField();
		NombreT.setBounds(281, 76, 107, 20);
		Contenedor.add(NombreT);
		NombreT.setColumns(10);
		
		ContraseñaT = new JPasswordField();
		ContraseñaT.setBounds(281, 102, 107, 20);
		Contenedor.add(ContraseñaT);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(171, 45, 0, 127);
		Contenedor.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 45, 131, 127);
		Contenedor.add(lblNewLabel);
		
		JLabel lblInicioDelSistema = new JLabel("Inicio del sistema");
		lblInicioDelSistema.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblInicioDelSistema.setBounds(281, 45, 120, 20);
		Contenedor.add(lblInicioDelSistema);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				/*Login*/
				String Usuario = NombreT.getText();
				String Contraseña = ContraseñaT.getText();
				user.add("Root");
				pass.add("Rootlindo");
				boolean c = true;
				do {
					if ((user.contains(Usuario)) && (pass.contains(Contraseña))) {
						Root_Frame kys = new Root_Frame();
						Login_Frame frame = new Login_Frame();
					    kys.setVisible(true);
					    frame.setEnabled(false);
					    frame.setAlwaysOnTop(false);
					    kys.setAlwaysOnTop(true);
						c=false;
					} else {
						
						if(user.contains(Usuario)){
							JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "ERROR",JOptionPane.ERROR_MESSAGE);
						}else{
						JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto", "ERROR",JOptionPane.ERROR_MESSAGE);
						}
						c=false;
					}
				}while(c);
			}
		});
		btnNewButton.setBounds(287, 149, 89, 23);
		Contenedor.add(btnNewButton);
	}

}
