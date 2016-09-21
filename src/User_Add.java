import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class User_Add extends JFrame {

	private JPanel contentPane;
	private static JTextField u;
	private static JPasswordField p;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Add frame = new User_Add();
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
	public User_Add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblManejoDeUsuarios = new JLabel("Manejo de usuarios");
		lblManejoDeUsuarios.setBounds(140, 11, 98, 26);
		contentPane.add(lblManejoDeUsuarios);
		
		u = new JTextField();
		u.setBounds(140, 71, 98, 20);
		contentPane.add(u);
		u.setColumns(10);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setBounds(10, 74, 105, 14);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(10, 115, 105, 14);
		contentPane.add(lblContrasea);
		
		JButton add = new JButton("Agregar");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (vacio()) {
					
					boolean x=MySQL.register();
					
					if(x){
						
						System.out.println("Conecto");
						MySQL.AddUser(p, u);
		
						
					}else{
						
						System.out.println("Hubo error");
					}
					
					
					
				
			}
		}});
		add.setBounds(140, 166, 98, 23);
		contentPane.add(add);
		
		p = new JPasswordField();
		p.setBounds(140, 112, 98, 17);
		contentPane.add(p);
	}
	
	public static boolean vacio() {
		if (u.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
		if (p.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contraseña... ingrese nuevamente");
			return false;
		}
		
		return true;
	}
}
