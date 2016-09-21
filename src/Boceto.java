import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Boceto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_16;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boceto frame = new Boceto();
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
	public Boceto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1143, 493);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem exit = new JMenuItem("Salir");
		mnNewMenu.add(exit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblControlDeMercaderia = new JLabel("Control de mercaderia");
		lblControlDeMercaderia.setBounds(155, 11, 119, 14);
		contentPane.add(lblControlDeMercaderia);
		
		JLabel lblControlDeUsuarios = new JLabel("Control de usuarios");
		lblControlDeUsuarios.setBounds(961, 11, 127, 14);
		contentPane.add(lblControlDeUsuarios);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 53, 86, 14);
		contentPane.add(lblCodigo);
		
		JLabel lblIva = new JLabel("IVA");
		lblIva.setBounds(10, 84, 86, 14);
		contentPane.add(lblIva);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 112, 86, 14);
		contentPane.add(lblNombre);
		
		JLabel lblStockInicial = new JLabel("Stock inicial");
		lblStockInicial.setBounds(10, 144, 86, 14);
		contentPane.add(lblStockInicial);
		
		textField = new JTextField();
		textField.setBounds(106, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 81, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 109, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 141, 86, 20);
		contentPane.add(textField_3);
		
		JButton btnAgregarMercaderia = new JButton("Confirmar");
		btnAgregarMercaderia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAgregarMercaderia.setBounds(10, 253, 182, 23);
		contentPane.add(btnAgregarMercaderia);
		
		JLabel lblAgregarMercaderia = new JLabel("Agregar mercaderia");
		lblAgregarMercaderia.setBounds(38, 28, 100, 14);
		contentPane.add(lblAgregarMercaderia);
		
		JLabel lblRemoverMercaderia = new JLabel("Vender mercaderia");
		lblRemoverMercaderia.setBounds(267, 36, 139, 14);
		contentPane.add(lblRemoverMercaderia);
		
		JLabel label_1 = new JLabel("Codigo");
		label_1.setBounds(238, 81, 66, 14);
		contentPane.add(label_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(334, 81, 86, 20);
		contentPane.add(textField_7);
		
		JLabel label_2 = new JLabel("Cantidad");
		label_2.setBounds(238, 112, 46, 14);
		contentPane.add(label_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(334, 109, 86, 20);
		contentPane.add(textField_8);
		
		JButton btnConfirmarVenta = new JButton("Confirmar venta");
		btnConfirmarVenta.setBounds(238, 218, 182, 23);
		contentPane.add(btnConfirmarVenta);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Unitario");
		lblPrecioUnitario.setBounds(10, 180, 86, 14);
		contentPane.add(lblPrecioUnitario);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(106, 177, 86, 20);
		contentPane.add(textField_9);
		
		JLabel lblPrecioDeVenta = new JLabel("Precio de venta");
		lblPrecioDeVenta.setBounds(10, 212, 86, 14);
		contentPane.add(lblPrecioDeVenta);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(106, 209, 86, 20);
		contentPane.add(textField_4);
		
		JLabel label_3 = new JLabel("Dar baja logica");
		label_3.setBounds(53, 297, 139, 14);
		contentPane.add(label_3);
		
		JLabel label = new JLabel("Codigo");
		label.setBounds(10, 329, 66, 14);
		contentPane.add(label);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(106, 326, 86, 20);
		contentPane.add(textField_5);
		
		JButton button = new JButton("Confirmar");
		button.setBounds(10, 389, 182, 23);
		contentPane.add(button);
		
		textField_6 = new JTextField();
		textField_6.setBounds(334, 141, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(238, 144, 46, 14);
		contentPane.add(lblTotal);
		
		JButton btnPrevisualizar = new JButton("Previsualizar");
		btnPrevisualizar.setBounds(238, 176, 182, 23);
		contentPane.add(btnPrevisualizar);
		
		JLabel lblActualizarMercaderia = new JLabel("Actualizar mercaderia");
		lblActualizarMercaderia.setBounds(267, 297, 139, 14);
		contentPane.add(lblActualizarMercaderia);
		
		JLabel label_4 = new JLabel("Codigo");
		label_4.setBounds(238, 329, 66, 14);
		contentPane.add(label_4);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(334, 358, 86, 20);
		contentPane.add(textField_10);
		
		JLabel lblNuevoPreciow = new JLabel("Nuevo Precio");
		lblNuevoPreciow.setBounds(238, 361, 86, 14);
		contentPane.add(lblNuevoPreciow);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(334, 322, 86, 20);
		contentPane.add(textField_11);
		
		JButton button_1 = new JButton("Confirmar");
		button_1.setBounds(238, 389, 182, 23);
		contentPane.add(button_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(334, 699, 86, 20);
		contentPane.add(textField_16);
		
		JLabel label_9 = new JLabel("Consultas de mercaderia");
		label_9.setBounds(526, 36, 139, 14);
		contentPane.add(label_9);
		
		JRadioButton radioButton = new JRadioButton("Por dia");
		radioButton.setBounds(511, 80, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Por mes");
		radioButton_1.setBounds(511, 108, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Por a\u00F1o");
		radioButton_2.setBounds(511, 140, 109, 23);
		contentPane.add(radioButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(487, 176, 178, 202);
		contentPane.add(textArea);
		
		JButton button_3 = new JButton("Confirmar");
		button_3.setBounds(487, 389, 182, 23);
		contentPane.add(button_3);
		
		JLabel label_10 = new JLabel("Actualizar precio de IVA");
		label_10.setBounds(750, 36, 139, 14);
		contentPane.add(label_10);
		
		JLabel label_6 = new JLabel("Codigo");
		label_6.setBounds(720, 84, 66, 14);
		contentPane.add(label_6);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(816, 81, 86, 20);
		contentPane.add(textField_12);
		
		JLabel label_11 = new JLabel("Nuevo Porcentaje");
		label_11.setBounds(720, 112, 86, 14);
		contentPane.add(label_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(816, 109, 86, 20);
		contentPane.add(textField_13);
		
		JButton button_2 = new JButton("Confirmar");
		button_2.setBounds(720, 144, 182, 23);
		contentPane.add(button_2);
		
		JLabel label_12 = new JLabel("Comprar mercaderia");
		label_12.setBounds(750, 196, 139, 14);
		contentPane.add(label_12);
		
		JLabel label_5 = new JLabel("Codigo");
		label_5.setBounds(720, 237, 66, 14);
		contentPane.add(label_5);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(816, 234, 86, 20);
		contentPane.add(textField_14);
		
		JLabel label_8 = new JLabel("Cantidad");
		label_8.setBounds(720, 268, 46, 14);
		contentPane.add(label_8);
		
		JLabel label_7 = new JLabel("Total");
		label_7.setBounds(720, 297, 46, 14);
		contentPane.add(label_7);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(816, 265, 86, 20);
		contentPane.add(textField_15);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(816, 294, 86, 20);
		contentPane.add(textField_17);
		
		JLabel lblAgregarUsuarios = new JLabel("Agregar usuarios");
		lblAgregarUsuarios.setBounds(969, 36, 100, 14);
		contentPane.add(lblAgregarUsuarios);
		
		JLabel lblEliminarUsuarios = new JLabel("Eliminar usuarios");
		lblEliminarUsuarios.setBounds(988, 196, 100, 14);
		contentPane.add(lblEliminarUsuarios);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(942, 84, 66, 14);
		contentPane.add(lblNombre_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(942, 112, 66, 14);
		contentPane.add(lblContrasea);
		
		textField_18 = new JTextField();
		textField_18.setBounds(1038, 81, 86, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(1038, 109, 86, 20);
		contentPane.add(textField_19);
		
		JButton button_4 = new JButton("Confirmar");
		button_4.setBounds(942, 144, 182, 23);
		contentPane.add(button_4);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(756, 325, 91, 23);
		contentPane.add(btnMostrar);
		
		JButton btnNewButton = new JButton("Confirmar venta");
		btnNewButton.setBounds(720, 361, 182, 23);
		contentPane.add(btnNewButton);
		
		JLabel label_13 = new JLabel("Nombre");
		label_13.setBounds(942, 237, 66, 14);
		contentPane.add(label_13);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(1038, 234, 86, 20);
		contentPane.add(textField_20);
		
		JButton button_5 = new JButton("Confirmar");
		button_5.setBounds(942, 264, 182, 23);
		contentPane.add(button_5);
	}
}
