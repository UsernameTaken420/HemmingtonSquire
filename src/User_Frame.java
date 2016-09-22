import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class User_Frame extends JFrame {

	private JPanel contentPane;
	public int i, errorTotal = 0;
	private JTextField search_textArea;
	private JTextArea description;
	private JButton search_button;
	private JMenu file_menu;
	private JMenuItem exit;
	private JTextField sell_cuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Frame frame = new User_Frame();
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
	public User_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 10, 781, 406);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		file_menu = new JMenu("Archivo");
		menuBar.add(file_menu);
		
		exit = new JMenuItem("Salir");
		file_menu.add(exit);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
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
}