import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
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

public class Login_Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		setTitle("Login Ferreteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 232);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Nombre:");
		lblLogin.setFont(new Font("Mangal", Font.BOLD, 16));
		lblLogin.setBounds(171, 68, 72, 31);
		contentPane.add(lblLogin);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Mangal", Font.BOLD, 16));
		lblContrasea.setBounds(171, 94, 100, 31);
		contentPane.add(lblContrasea);
		
		textField = new JTextField();
		textField.setBounds(281, 76, 107, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(281, 102, 107, 20);
		contentPane.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(171, 45, 0, 127);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 45, 131, 127);
		contentPane.add(lblNewLabel);
		
		JLabel lblInicioDelSistema = new JLabel("Inicio del sistema");
		lblInicioDelSistema.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblInicioDelSistema.setBounds(281, 45, 120, 20);
		contentPane.add(lblInicioDelSistema);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(287, 149, 89, 23);
		contentPane.add(btnNewButton);
	}
}
