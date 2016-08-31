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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private static ArrayList <String> user=new ArrayList <String>();
	private static ArrayList <String> pass=new ArrayList <String>();
	public int i, errorTotal = 0;
	private JTextField textField;

	
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
		setBounds(50, 10, 492, 493);
		JMenuBar menuBar = new JMenuBar();
		 setJMenuBar(menuBar);
		 JMenu mnArchivo = new JMenu("Archivo");
		 menuBar.add(mnArchivo);
		 JMenuItem mntmConfirmarCambios = new JMenuItem("Confirmar cambios");
		 mnArchivo.add(mntmConfirmarCambios);
		 JMenuItem mntmConfirmarCambiosY = new JMenuItem("Confirmar cambios y salir");
		 mnArchivo.add(mntmConfirmarCambiosY);
		 JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		 mnArchivo.add(mntmNewMenuItem);
		 JMenu mnUsuarios = new JMenu("Usuarios");
		 menuBar.add(mnUsuarios);	
		 JMenuItem mntmAgregar = new JMenuItem("Agregar");
		 mnUsuarios.add(mntmAgregar);
		 JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		 mnUsuarios.add(mntmEliminar);
		 JMenu mnMercaderia = new JMenu("Mercaderia");
		 menuBar.add(mnMercaderia);
		 JMenuItem mntmAgregar_1 = new JMenuItem("Agregar");
		 mnMercaderia.add(mntmAgregar_1);	
		 JMenuItem mntmEliminar_1 = new JMenuItem("Eliminar");
		 mnMercaderia.add(mntmEliminar_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		user.add("Admin");
		pass.add("rootlindo");
		Login_Frame Login = new Login_Frame();
		
		contentPane.setLayout(null);
		 textField = new JTextField();
		 textField.setBounds(10, 41, 108, 20);
		 contentPane.add(textField);
		 textField.setColumns(10);
		 JLabel lblCodigoDeProducto = new JLabel("Codigo de producto");
		 lblCodigoDeProducto.setBounds(10, 11, 139, 26);
		 lblCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 contentPane.add(lblCodigoDeProducto);
		 JButton btnNewButton = new JButton("Buscar");
		 btnNewButton.setBounds(128, 40, 67, 23);
		 contentPane.add(btnNewButton);
		 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setBounds(10, 72, 185, 290);
		 contentPane.add(scrollPane);
		 JTextArea textArea = new JTextArea();
		 scrollPane.setViewportView(textArea);
		 JLabel lblImagen = new JLabel("Imagen");
		 lblImagen.setBounds(205, 139, 203, 201);
		 contentPane.add(lblImagen);
		 JLabel lblDescripcion = new JLabel("Descripcion");
		 lblDescripcion.setBounds(209, 11, 139, 26);
		 lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 contentPane.add(lblDescripcion);
		 
		 JTextArea textArea_1 = new JTextArea();
		 textArea_1.setBounds(205, 48, 203, 82);
		 contentPane.add(textArea_1);
	}
}
