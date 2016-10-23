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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login_Frame extends JFrame {

	private JPanel Contenedor;
	private static JTextField name;
	private JPasswordField Password;

	public static Login_Frame frame;
	private static JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Login_Frame();
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

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\Usuario\\Documents\\GitHub\\HemmingtonSquire\\Imagenes\\Ferreteria.png"));
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

		JLabel lblPassword = new JLabel("Contrase\u00F1a:");
		lblPassword.setFont(new Font("Mangal", Font.BOLD, 16));
		lblPassword.setBounds(171, 94, 100, 31);
		Contenedor.add(lblPassword);

		name = new JTextField();
		name.setBounds(281, 76, 107, 20);
		Contenedor.add(name);
		name.setColumns(10);

		password = new JPasswordField();
		password.setBounds(281, 102, 107, 20);
		Contenedor.add(password);

		JSeparator separator = new JSeparator();
		separator.setBounds(171, 45, 0, 127);
		Contenedor.add(separator);

		JLabel lblInicioDelSistema = new JLabel("Inicio del sistema");
		lblInicioDelSistema.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblInicioDelSistema.setBounds(281, 45, 120, 20);
		Contenedor.add(lblInicioDelSistema);

		JButton LoginBoton = new JButton("Login");
		LoginBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (empty()) {
					MySQL.login(name.getText(), password.getText());

				}

			}
		});
		LoginBoton.setBounds(287, 149, 89, 23);
		Contenedor.add(LoginBoton);
	}

	public static boolean empty() {
		if (name.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Codigo... ingrese nuevamente");
			return false;
		}

		if (password.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Codigo... ingrese nuevamente");
			return false;
		}

		return true;
	}

}
