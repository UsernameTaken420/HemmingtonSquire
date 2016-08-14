import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private static ArrayList <String> user=new ArrayList <String>();
	private static ArrayList <String> pass=new ArrayList <String>();
	public int i, errorTotal = 0;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 10, 1275, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		user.add("Admin");
		pass.add("rootlindo");

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Usuario = String.valueOf(JOptionPane.showInputDialog("Ingrese nombre de usuario"));
				String Contrase�a = String.valueOf(JOptionPane.showInputDialog("Ingrese la contrase�a"));
				for (i = 0; i < 2; i++) {
					if ((user.contains(Usuario)) && (pass.contains(Contrase�a))) {
						JOptionPane.showMessageDialog(null, "Congratu-fucking-lations");
						break;
					} else {
						errorTotal++;
					}
					if (errorTotal == 2) {
						JOptionPane.showMessageDialog(null, "Nombre de usuario o contrase�a incorrecta", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					}
				}

			}

		});
		btnLogin.setBounds(103, 575, 89, 23);
		contentPane.add(btnLogin);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(338, 575, 89, 23);
		contentPane.add(btnExit);
	}
}
