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
	private static ArrayList<String> user = new ArrayList<String>();
	private static ArrayList<String> pass = new ArrayList<String>();
	public int i, errorTotal = 0;
	private JTextField textField;
	private JTextArea textArea_1;
	private JButton btnNewButton;
	private JMenu mnArchivo;
	private JMenuItem mntmConfirmarCambios;
	private JMenuItem mntmConfirmarCambiosY;
	private JMenuItem mntmNewMenuItem;
	private JMenu mnUsuarios;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmEliminar;
	private JMenu mnMercaderia;
	private JMenuItem mntmEliminar_1;
	private JMenuItem mntmAgregar_1;

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
		setBounds(50, 10, 620, 380);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmConfirmarCambios = new JMenuItem("Confirmar cambios");
		mnArchivo.add(mntmConfirmarCambios);
		
		mntmConfirmarCambiosY = new JMenuItem("Confirmar cambios y salir");
		mnArchivo.add(mntmConfirmarCambiosY);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mnArchivo.add(mntmNewMenuItem);
		
		mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);
		
		mntmAgregar = new JMenuItem("Agregar");
		mnUsuarios.add(mntmAgregar);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mnUsuarios.add(mntmEliminar);
		
		mnMercaderia = new JMenu("Mercaderia");
		menuBar.add(mnMercaderia);
		
		mntmAgregar_1 = new JMenuItem("Agregar");
		mnMercaderia.add(mntmAgregar_1);
		
		mntmEliminar_1 = new JMenuItem("Eliminar");
		mnMercaderia.add(mntmEliminar_1);
		
		JMenuItem mntmModificarIva = new JMenuItem("Modificar IVA");
		mnMercaderia.add(mntmModificarIva);
		
		JMenuItem mntmActualizarMercaderia = new JMenuItem("Actualizar mercaderia");
		mnMercaderia.add(mntmActualizarMercaderia);
		
		JMenu mnLogs = new JMenu("Logs");
		menuBar.add(mnLogs);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Movimientos");
		mnLogs.add(mntmNewMenuItem_1);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mnLogs.add(mntmVentas);
		
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
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(128, 40, 67, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(366, 56, 139, 119);
		contentPane.add(lblImagen);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(366, 11, 139, 26);
		
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblDescripcion);

		textArea_1 = new JTextArea();
		textArea_1.setBounds(366, 186, 203, 82);
		contentPane.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 87, 319, 188);
		contentPane.add(textArea);
	}
}
