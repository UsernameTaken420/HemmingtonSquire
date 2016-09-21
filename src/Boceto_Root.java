import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;

public class Boceto_Root extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boceto_Root frame = new Boceto_Root();
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
	public Boceto_Root() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 528);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 639, 458);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Control de mercaderia", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 614, 411);
		panel.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Agregar", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label_5 = new JLabel("Codigo");
		label_5.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_5.setBounds(10, 59, 123, 27);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("IVA");
		label_6.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_6.setBounds(10, 101, 123, 14);
		panel_2.add(label_6);
		
		JLabel label_7 = new JLabel("Nombre");
		label_7.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_7.setBounds(10, 139, 123, 14);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("Stock inicial");
		label_8.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_8.setBounds(10, 180, 123, 14);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("Precio Unitario");
		label_9.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_9.setBounds(10, 220, 123, 14);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Precio de venta");
		label_10.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_10.setBounds(10, 260, 123, 14);
		panel_2.add(label_10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 63, 111, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 99, 111, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 137, 111, 20);
		panel_2.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 178, 111, 20);
		panel_2.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(143, 218, 111, 20);
		panel_2.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(143, 258, 111, 20);
		panel_2.add(textField_8);
		
		JButton button_2 = new JButton("Confirmar");
		button_2.setBounds(349, 257, 182, 23);
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Vender", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblCodigoDelProducto = new JLabel("Codigo del producto");
		lblCodigoDelProducto.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCodigoDelProducto.setBounds(10, 29, 157, 18);
		panel_3.add(lblCodigoDelProducto);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 58, 110, 20);
		panel_3.add(textField_10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 110, 231, 245);
		panel_3.add(textArea);
		
		JButton button_3 = new JButton("Buscar");
		button_3.setBounds(152, 58, 89, 23);
		panel_3.add(button_3);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(260, 203, 174, 152);
		panel_3.add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(261, 58, 174, 123);
		panel_3.add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(538, 58, 61, 20);
		panel_3.add(textField_9);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(460, 203, 139, 115);
		panel_3.add(textArea_2);
		
		JButton button_4 = new JButton("Confirmar venta");
		button_4.setBounds(460, 332, 139, 23);
		panel_3.add(button_4);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblDescripcion.setBounds(260, 32, 157, 18);
		panel_3.add(lblDescripcion);
		
		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblVenta.setBounds(503, 29, 61, 18);
		panel_3.add(lblVenta);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCantidad.setBounds(460, 58, 68, 18);
		panel_3.add(lblCantidad);
		
		JLabel label_14 = new JLabel("Precio Final");
		label_14.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_14.setBounds(487, 163, 89, 18);
		panel_3.add(label_14);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(473, 121, 91, 23);
		panel_3.add(btnVisualizar);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		tabbedPane_1.addTab("Comprar", null, panel_9, null);
		
		JLabel label_11 = new JLabel("Codigo del producto");
		label_11.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_11.setBounds(10, 29, 157, 18);
		panel_9.add(label_11);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 58, 110, 20);
		panel_9.add(textField_11);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(10, 110, 231, 245);
		panel_9.add(textArea_3);
		
		JButton button_5 = new JButton("Buscar");
		button_5.setBounds(152, 58, 89, 23);
		panel_9.add(button_5);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(260, 203, 174, 152);
		panel_9.add(textArea_4);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(261, 58, 174, 123);
		panel_9.add(label_12);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(538, 58, 61, 20);
		panel_9.add(textField_12);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(460, 203, 139, 115);
		panel_9.add(textArea_5);
		
		JButton btnConfirmarCompra = new JButton("Confirmar compra");
		btnConfirmarCompra.setBounds(460, 332, 139, 23);
		panel_9.add(btnConfirmarCompra);
		
		JLabel label_13 = new JLabel("Descripcion");
		label_13.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_13.setBounds(260, 32, 157, 18);
		panel_9.add(label_13);
		
		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCompra.setBounds(503, 29, 61, 18);
		panel_9.add(lblCompra);
		
		JLabel label_15 = new JLabel("Cantidad");
		label_15.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_15.setBounds(460, 58, 68, 18);
		panel_9.add(label_15);
		
		JLabel lblPrecioFnal = new JLabel("Precio Final");
		lblPrecioFnal.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblPrecioFnal.setBounds(487, 163, 89, 18);
		panel_9.add(lblPrecioFnal);
		
		JButton button_7 = new JButton("Visualizar");
		button_7.setBounds(487, 110, 91, 23);
		panel_9.add(button_7);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Baja Logica", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel label_16 = new JLabel("Codigo del producto");
		label_16.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_16.setBounds(10, 33, 157, 18);
		panel_6.add(label_16);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(10, 76, 110, 20);
		panel_6.add(textField_13);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(10, 118, 231, 245);
		panel_6.add(textArea_6);
		
		JButton button_6 = new JButton("Buscar");
		button_6.setBounds(152, 75, 89, 23);
		panel_6.add(button_6);
		
		JLabel label_17 = new JLabel("Descripcion");
		label_17.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_17.setBounds(255, 36, 157, 18);
		panel_6.add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setBounds(255, 79, 174, 123);
		panel_6.add(label_18);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(251, 211, 174, 152);
		panel_6.add(textArea_7);
		
		JButton btnConfirmarBajaLogica = new JButton("Confirmar baja logica");
		btnConfirmarBajaLogica.setBounds(439, 75, 160, 23);
		panel_6.add(btnConfirmarBajaLogica);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Obtener montos", null, panel_4, null);
		
		JLabel lblCodigoDeVenta = new JLabel("Codigo de venta");
		lblCodigoDeVenta.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCodigoDeVenta.setBounds(10, 29, 157, 18);
		panel_4.add(lblCodigoDeVenta);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(10, 58, 110, 20);
		panel_4.add(textField_14);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setBounds(10, 110, 231, 245);
		panel_4.add(textArea_8);
		
		JButton button_8 = new JButton("Buscar");
		button_8.setBounds(152, 58, 89, 23);
		panel_4.add(button_8);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setBounds(260, 203, 174, 152);
		panel_4.add(textArea_9);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setBounds(261, 58, 174, 123);
		panel_4.add(label_20);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(460, 203, 139, 152);
		panel_4.add(textArea_10);
		
		JButton btnConfirmarMontos = new JButton("Confirmar Montos");
		btnConfirmarMontos.setBounds(460, 158, 139, 23);
		panel_4.add(btnConfirmarMontos);
		
		JLabel label_21 = new JLabel("Descripcion");
		label_21.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_21.setBounds(260, 32, 157, 18);
		panel_4.add(label_21);
		
		JLabel lblMontos = new JLabel("Montos");
		lblMontos.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblMontos.setBounds(503, 29, 61, 18);
		panel_4.add(lblMontos);
		
		JRadioButton radioButton = new JRadioButton("Por dia");
		buttonGroup.add(radioButton);
		radioButton.setBounds(479, 58, 109, 23);
		panel_4.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Por mes");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(479, 86, 109, 23);
		panel_4.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Por a\u00F1o");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(479, 118, 109, 23);
		panel_4.add(radioButton_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Actualizar", null, panel_5, null);
		
		JLabel label_22 = new JLabel("Codigo del producto");
		label_22.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_22.setBounds(10, 29, 157, 18);
		panel_5.add(label_22);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(10, 58, 110, 20);
		panel_5.add(textField_15);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setBounds(10, 110, 231, 245);
		panel_5.add(textArea_11);
		
		JButton button_10 = new JButton("Buscar");
		button_10.setBounds(152, 58, 89, 23);
		panel_5.add(button_10);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setBounds(260, 203, 174, 152);
		panel_5.add(textArea_12);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setBounds(261, 58, 174, 123);
		panel_5.add(label_23);
		
		JButton btnConfirmarPrecio = new JButton("Confirmar precio");
		btnConfirmarPrecio.setBounds(460, 203, 139, 23);
		panel_5.add(btnConfirmarPrecio);
		
		JLabel label_24 = new JLabel("Descripcion");
		label_24.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_24.setBounds(260, 32, 157, 18);
		panel_5.add(label_24);
		
		JLabel lblActualizar = new JLabel("Actualizar");
		lblActualizar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblActualizar.setBounds(490, 29, 96, 18);
		panel_5.add(lblActualizar);
		
		JLabel lblNuevoPrecio = new JLabel("Nuevo Precio");
		lblNuevoPrecio.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblNuevoPrecio.setBounds(477, 111, 96, 18);
		panel_5.add(lblNuevoPrecio);
		
		textField_16 = new JTextField();
		textField_16.setBounds(462, 161, 126, 20);
		panel_5.add(textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		tabbedPane_1.addTab("Modificar IVA", null, panel_7, null);
		
		JLabel label_25 = new JLabel("Codigo del producto");
		label_25.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_25.setBounds(10, 29, 157, 18);
		panel_7.add(label_25);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 58, 110, 20);
		panel_7.add(textField_17);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setBounds(10, 110, 231, 245);
		panel_7.add(textArea_13);
		
		JButton button_12 = new JButton("Buscar");
		button_12.setBounds(152, 58, 89, 23);
		panel_7.add(button_12);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setBounds(260, 203, 174, 152);
		panel_7.add(textArea_14);
		
		JLabel label_26 = new JLabel("New label");
		label_26.setBounds(261, 58, 174, 123);
		panel_7.add(label_26);
		
		JButton btnConfirmarPrecio_1 = new JButton("Confirmar precio");
		btnConfirmarPrecio_1.setBounds(460, 203, 139, 23);
		panel_7.add(btnConfirmarPrecio_1);
		
		JLabel label_27 = new JLabel("Descripcion");
		label_27.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_27.setBounds(260, 32, 157, 18);
		panel_7.add(label_27);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblModificar.setBounds(490, 29, 96, 18);
		panel_7.add(lblModificar);
		
		JLabel lblNuevoPorcentaje = new JLabel("Nuevo Porcentaje");
		lblNuevoPorcentaje.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblNuevoPorcentaje.setBounds(460, 111, 139, 18);
		panel_7.add(lblNuevoPorcentaje);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(462, 161, 137, 20);
		panel_7.add(textField_18);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Control de usuarios", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Agregar usuarios");
		label.setBounds(40, 52, 129, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(10, 142, 66, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setBounds(10, 188, 66, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Eliminar usuarios");
		label_3.setBounds(429, 64, 100, 14);
		panel_1.add(label_3);
		
		JButton button = new JButton("Confirmar");
		button.setBounds(10, 239, 182, 23);
		panel_1.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(106, 142, 86, 20);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 185, 86, 20);
		panel_1.add(textField_1);
		
		JLabel label_4 = new JLabel("Nombre");
		label_4.setBounds(385, 142, 66, 14);
		panel_1.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(490, 139, 86, 20);
		panel_1.add(textField_2);
		
		JButton button_1 = new JButton("Confirmar");
		button_1.setBounds(385, 216, 182, 23);
		panel_1.add(button_1);
	}
}
