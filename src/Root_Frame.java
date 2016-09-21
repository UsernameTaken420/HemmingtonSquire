import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Root_Frame extends JFrame {


	private JPanel contentPane;
	private static ArrayList<String> user = new ArrayList<String>();
	private static ArrayList<String> pass = new ArrayList<String>();
	public int i, errorTotal = 0;
	private JTextField search_textArea;
	private JTextArea description;
	private JButton search_button;
	private JMenu file_menu;
	private JMenuItem confirm;
	private JMenuItem confirm_exit;
	private JMenuItem exit;
	private JMenu user_menu;
	private JMenuItem add_user;
	private JMenuItem remove_user;
	private JMenu mnMercaderia;
	private JMenuItem remove_merchandise;
	private JMenuItem add_merchandise;
	private JTextField sell_cuantity;
	public static Root_Frame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Root_Frame();
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
	public Root_Frame() {
<<<<<<< HEAD
<<<<<<< HEAD
		setTitle("Root");
=======
>>>>>>> refs/remotes/origin/master
=======
>>>>>>> refs/remotes/UsernameTaken420/master
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 10, 781, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		file_menu = new JMenu("Archivo");
		menuBar.add(file_menu);
		
		confirm = new JMenuItem("Confirmar cambios");
		file_menu.add(confirm);
		
		confirm_exit = new JMenuItem("Confirmar cambios y salir");
		file_menu.add(confirm_exit);
		
		exit = new JMenuItem("Salir");
		file_menu.add(exit);
		
		user_menu = new JMenu("Usuarios");
		menuBar.add(user_menu);
		
		add_user = new JMenuItem("Agregar");
		add_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				User_Add v1 = new User_Add();
				v1.setVisible(true);
				frame.setEnabled(false);
				v1.setAlwaysOnTop(true);

				
			}
		});
		user_menu.add(add_user);
		
		remove_user = new JMenuItem("Eliminar");
		remove_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User_Remove v1 = new User_Remove();
				v1.setVisible(true);
				frame.setEnabled(false);
				v1.setAlwaysOnTop(true);

			}
		});
		user_menu.add(remove_user);
		
		mnMercaderia = new JMenu("Mercaderia");
		menuBar.add(mnMercaderia);
		
		add_merchandise = new JMenuItem("Agregar");
		mnMercaderia.add(add_merchandise);
		
		remove_merchandise = new JMenuItem("Eliminar");
		mnMercaderia.add(remove_merchandise);
		
		JMenuItem modify_merchandise = new JMenuItem("Modificar IVA");
		mnMercaderia.add(modify_merchandise);
		
		JMenuItem update_merchandise = new JMenuItem("Actualizar mercaderia");
		mnMercaderia.add(update_merchandise);
		
		JMenu mnLogs = new JMenu("Logs");
		menuBar.add(mnLogs);
		
		JMenuItem movments = new JMenuItem("Movimientos");
		mnLogs.add(movments);
		
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
		
		search_textArea = new JTextField();
		search_textArea.setBounds(10, 41, 108, 20);
		contentPane.add(search_textArea);
		search_textArea.setColumns(10);
		
		JLabel lblCodigoDeProducto = new JLabel("Codigo de producto");
		lblCodigoDeProducto.setBounds(10, 11, 139, 26);
		
		lblCodigoDeProducto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblCodigoDeProducto);
		
		search_button = new JButton("Buscar");
		search_button.setBounds(128, 40, 89, 23);
		contentPane.add(search_button);
		
		JLabel Image = new JLabel("Imagen");
		Image.setBounds(366, 56, 139, 119);
		contentPane.add(Image);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(366, 11, 139, 26);
		
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblDescripcion);

		description = new JTextArea();
		description.setBounds(366, 186, 203, 82);
		contentPane.add(description);
		
		JTextArea display_serarch = new JTextArea();
		display_serarch.setBounds(10, 87, 319, 188);
		contentPane.add(display_serarch);
		
		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblVenta.setBounds(605, 11, 139, 26);
		contentPane.add(lblVenta);
		
		JTextArea sell_textArea = new JTextArea();
		sell_textArea.setBounds(605, 119, 139, 125);
		contentPane.add(sell_textArea);
		
		sell_cuantity = new JTextField();
		sell_cuantity.setBounds(605, 60, 86, 20);
		contentPane.add(sell_cuantity);
		sell_cuantity.setColumns(10);
		
		JButton sell_button = new JButton("Confirmar venta");
		sell_button.setBounds(605, 278, 139, 23);
		contentPane.add(sell_button);
	}
	/*
	public static boolean vacio() {
		if (u.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
		if (p.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contraseña... ingrese nuevamente");
			return false;
		}
		if (id1.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contraseña... ingrese nuevamente");
			return false;
		}
		return true;
	}
*/
}
