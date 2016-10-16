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
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class User_Frame extends JFrame {

	private JPanel contentPane;
	public int i, errorTotal = 0;
	private JTextField search_textArea;
	private JButton search_button;
	private JMenu file_menu;
	private JMenuItem exit;
	private JTable table;
	private JTextField textField;

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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 80, 592, 267);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Confirmar venta");
		button.setBounds(624, 324, 139, 23);
		contentPane.add(button);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(624, 195, 139, 115);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("Precio Final");
		label.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label.setBounds(651, 155, 89, 18);
		contentPane.add(label);
		
		JButton button_1 = new JButton("Visualizar");
		button_1.setBounds(649, 112, 91, 23);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(702, 50, 61, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Cantidad");
		label_1.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_1.setBounds(624, 50, 68, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Venta");
		label_2.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_2.setBounds(667, 21, 61, 18);
		contentPane.add(label_2);
	}
}