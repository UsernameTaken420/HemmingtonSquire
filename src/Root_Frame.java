
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Root_Frame extends JFrame {

	private JPanel contentPane;
	private static JTextField userToAdd;
	private JTextField u2;
	private static JTextField add_code;
	private static JTextField add_VAT;
	private static JTextField add_name;
	private static JTextField add_initial;
	private static JTextField add_unitaryPrice;
	private static JTextField add_sellPrice;
	private static JTextField sell_search_search;
	private JTextField sell_sell_amount;
	private JTextField textField_12;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_16;
	private JTextField textField_18;
	private JButton add_user;
	private JButton remove_user;
	private JPanel panel_1;
	private static JPasswordField passToAdd;
	private JButton add_button;
	private JTextField add_manufacturer;
	private JButton sell_search_button;
	private static ArrayList<Integer> find = new ArrayList<Integer>();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Root_Frame frame = new Root_Frame();
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
		setTitle("Root");

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 528);

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
		tabbedPane.setBounds(10, 11, 816, 458);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Control de mercaderia", null, panel, null);
		panel.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 791, 411);
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

		add_code = new JTextField();
		add_code.setColumns(10);
		add_code.setBounds(143, 63, 111, 20);
		panel_2.add(add_code);

		add_VAT = new JTextField();
		add_VAT.setColumns(10);
		add_VAT.setBounds(143, 99, 111, 20);
		panel_2.add(add_VAT);

		add_name = new JTextField();
		add_name.setColumns(10);
		add_name.setBounds(143, 137, 111, 20);
		panel_2.add(add_name);

		add_initial = new JTextField();
		add_initial.setColumns(10);
		add_initial.setBounds(143, 178, 111, 20);
		panel_2.add(add_initial);

		add_unitaryPrice = new JTextField();
		add_unitaryPrice.setColumns(10);
		add_unitaryPrice.setBounds(143, 218, 111, 20);
		panel_2.add(add_unitaryPrice);

		add_sellPrice = new JTextField();
		add_sellPrice.setColumns(10);
		add_sellPrice.setBounds(143, 258, 111, 20);
		panel_2.add(add_sellPrice);

		add_manufacturer = new JTextField();
		add_manufacturer.setColumns(10);
		add_manufacturer.setBounds(143, 300, 111, 20);
		panel_2.add(add_manufacturer);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(376, 62, 182, 172);
		panel_2.add(scrollPane);

		JTextArea add_description = new JTextArea();
		scrollPane.setViewportView(add_description);

		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblFabricante.setBounds(10, 296, 123, 27);
		panel_2.add(lblFabricante);

		JLabel lblDescripcion_1 = new JLabel("Descripcion");
		lblDescripcion_1.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblDescripcion_1.setBounds(422, 24, 123, 27);
		panel_2.add(lblDescripcion_1);

		add_button = new JButton("Confirmar");
		add_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		add_button.setBounds(379, 257, 182, 23);
		panel_2.add(add_button);

		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Vender", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblCodigoDelProducto = new JLabel("Codigo del producto");
		lblCodigoDelProducto.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCodigoDelProducto.setBounds(10, 29, 157, 18);
		panel_3.add(lblCodigoDelProducto);

		sell_search_search = new JTextField();
		sell_search_search.setColumns(10);
		sell_search_search.setBounds(10, 58, 110, 20);
		panel_3.add(sell_search_search);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 108, 604, 267);
		panel_3.add(scrollPane_1);
		table = new JTable();
		scrollPane_1.setViewportView(table);

		DefaultTableModel model = new DefaultTableModel();

		Object[] columnsName = new Object[8];

		columnsName[0] = "Codigo";
		columnsName[1] = "Nombre";
		columnsName[2] = "Fabricante";
		columnsName[3] = "Stock";
		columnsName[4] = "Iva";
		columnsName[5] = "Precio de venta";
		columnsName[6] = "Precio unitario";
		columnsName[7] = "Descripcion";

		model.setColumnIdentifiers(columnsName);

		table.setModel(model);

		sell_search_button = new JButton("Buscar");
		sell_search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				search(sell_search_search, table, model);

			}
		});
		sell_search_button.setBounds(152, 58, 89, 23);
		panel_3.add(sell_search_button);

		sell_sell_amount = new JTextField();
		sell_sell_amount.setColumns(10);
		sell_sell_amount.setBounds(702, 58, 61, 20);
		panel_3.add(sell_sell_amount);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(624, 203, 139, 115);
		panel_3.add(textArea_2);

		JButton sell_search_confirm = new JButton("Confirmar venta");
		sell_search_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sell_search_confirm.setBounds(624, 332, 139, 23);
		panel_3.add(sell_search_confirm);

		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblVenta.setBounds(667, 29, 61, 18);
		panel_3.add(lblVenta);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCantidad.setBounds(624, 58, 68, 18);
		panel_3.add(lblCantidad);

		JLabel label_14 = new JLabel("Precio Final");
		label_14.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_14.setBounds(651, 163, 89, 18);
		panel_3.add(label_14);

		JButton sell_search_see = new JButton("Visualizar");
		sell_search_see.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sell_search_see.setBounds(649, 120, 91, 23);
		panel_3.add(sell_search_see);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		tabbedPane_1.addTab("Comprar", null, panel_9, null);

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
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(487, 110, 91, 23);
		panel_9.add(button_7);

		JLabel label_11 = new JLabel("Codigo del producto");
		label_11.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_11.setBounds(10, 29, 157, 18);
		panel_9.add(label_11);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 58, 110, 20);
		panel_9.add(textField);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 101, 223, 252);
		panel_9.add(scrollPane_3);

		JList list = new JList();
		scrollPane_3.setViewportView(list);

		JButton button = new JButton("Buscar");
		button.setBounds(152, 58, 89, 23);
		panel_9.add(button);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(262, 205, 170, 148);
		panel_9.add(scrollPane_4);

		JTextArea textArea = new JTextArea();
		scrollPane_4.setViewportView(textArea);

		JLabel label_12 = new JLabel("Descripcion");
		label_12.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_12.setBounds(260, 32, 157, 18);
		panel_9.add(label_12);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Baja Logica", null, panel_6, null);
		panel_6.setLayout(null);

		JButton btnConfirmarBajaLogica = new JButton("Confirmar baja logica");
		btnConfirmarBajaLogica.setBounds(439, 75, 160, 23);
		panel_6.add(btnConfirmarBajaLogica);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(7, 60, 110, 20);
		panel_6.add(textField_1);

		JLabel label_13 = new JLabel("Codigo del producto");
		label_13.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_13.setBounds(7, 31, 157, 18);
		panel_6.add(label_13);

		JButton button_1 = new JButton("Buscar");
		button_1.setBounds(149, 60, 89, 23);
		panel_6.add(button_1);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(9, 103, 223, 252);
		panel_6.add(scrollPane_5);

		JList list_1 = new JList();
		scrollPane_5.setViewportView(list_1);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(259, 207, 170, 148);
		panel_6.add(scrollPane_6);

		JTextArea textArea_1 = new JTextArea();
		scrollPane_6.setViewportView(textArea_1);

		JLabel label_16 = new JLabel("Descripcion");
		label_16.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_16.setBounds(257, 34, 157, 18);
		panel_6.add(label_16);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Obtener montos", null, panel_4, null);

		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(460, 203, 139, 152);
		panel_4.add(textArea_10);

		JButton btnConfirmarMontos = new JButton("Confirmar Montos");
		btnConfirmarMontos.setBounds(460, 158, 139, 23);
		panel_4.add(btnConfirmarMontos);

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

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 58, 110, 20);
		panel_4.add(textField_2);

		JLabel label_17 = new JLabel("Codigo del producto");
		label_17.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_17.setBounds(10, 29, 157, 18);
		panel_4.add(label_17);

		JButton button_2 = new JButton("Buscar");
		button_2.setBounds(152, 58, 89, 23);
		panel_4.add(button_2);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(12, 101, 223, 252);
		panel_4.add(scrollPane_7);

		JList list_2 = new JList();
		scrollPane_7.setViewportView(list_2);

		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(262, 205, 170, 148);
		panel_4.add(scrollPane_8);

		JTextArea textArea_3 = new JTextArea();
		scrollPane_8.setViewportView(textArea_3);

		JLabel label_18 = new JLabel("Descripcion");
		label_18.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_18.setBounds(260, 32, 157, 18);
		panel_4.add(label_18);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Actualizar", null, panel_5, null);

		JButton btnConfirmarPrecio = new JButton("Confirmar precio");
		btnConfirmarPrecio.setBounds(460, 203, 139, 23);
		panel_5.add(btnConfirmarPrecio);

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

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 58, 110, 20);
		panel_5.add(textField_3);

		JLabel label_19 = new JLabel("Codigo del producto");
		label_19.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_19.setBounds(10, 29, 157, 18);
		panel_5.add(label_19);

		JButton button_3 = new JButton("Buscar");
		button_3.setBounds(152, 58, 89, 23);
		panel_5.add(button_3);

		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(12, 101, 223, 252);
		panel_5.add(scrollPane_9);

		JList list_3 = new JList();
		scrollPane_9.setViewportView(list_3);

		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(262, 205, 170, 148);
		panel_5.add(scrollPane_10);

		JTextArea textArea_4 = new JTextArea();
		scrollPane_10.setViewportView(textArea_4);

		JLabel label_20 = new JLabel("Descripcion");
		label_20.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_20.setBounds(260, 32, 157, 18);
		panel_5.add(label_20);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		tabbedPane_1.addTab("Modificar IVA", null, panel_7, null);

		JButton btnConfirmarPrecio_1 = new JButton("Confirmar precio");
		btnConfirmarPrecio_1.setBounds(460, 203, 139, 23);
		panel_7.add(btnConfirmarPrecio_1);

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

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 58, 110, 20);
		panel_7.add(textField_4);

		JLabel label_21 = new JLabel("Codigo del producto");
		label_21.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_21.setBounds(10, 29, 157, 18);
		panel_7.add(label_21);

		JButton button_4 = new JButton("Buscar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(152, 58, 89, 23);
		panel_7.add(button_4);

		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(12, 101, 223, 252);
		panel_7.add(scrollPane_11);

		JList list_4 = new JList();
		scrollPane_11.setViewportView(list_4);

		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(262, 205, 170, 148);
		panel_7.add(scrollPane_12);

		JTextArea textArea_6 = new JTextArea();
		scrollPane_12.setViewportView(textArea_6);

		JLabel label_22 = new JLabel("Descripcion");
		label_22.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_22.setBounds(260, 32, 157, 18);
		panel_7.add(label_22);

		panel_1 = new JPanel();
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

		add_user = new JButton("Confirmar");
		add_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (vacio()) {

					System.out.println("Conecto");
					MySQL.AddUser(passToAdd.getText(), userToAdd.getText());

					JOptionPane.showMessageDialog(null, "Registrado nuevo usuario");

					userToAdd.setText("");
					passToAdd.setText("");

				}

			}
		});
		add_user.setBounds(10, 239, 182, 23);
		panel_1.add(add_user);

		userToAdd = new JTextField();
		userToAdd.setColumns(10);
		userToAdd.setBounds(106, 142, 86, 20);
		panel_1.add(userToAdd);

		JLabel label_4 = new JLabel("Nombre");
		label_4.setBounds(385, 142, 66, 14);
		panel_1.add(label_4);

		u2 = new JTextField();
		u2.setColumns(10);
		u2.setBounds(490, 139, 86, 20);
		panel_1.add(u2);

		remove_user = new JButton("Confirmar");
		remove_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (vacio1()) {

					System.out.println("Conecto");
					MySQL.RemoveUser(userToAdd.getText());

				}

			}
		});
		remove_user.setBounds(385, 216, 182, 23);
		panel_1.add(remove_user);

		passToAdd = new JPasswordField();
		passToAdd.setBounds(106, 185, 86, 17);
		panel_1.add(passToAdd);
	}

	public static boolean vacio() {
		if (userToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
		if (passToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contraseña... ingrese nuevamente");
			return false;
		}

		return true;
	}

	public static boolean vacio1() {
		if (userToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}

		return true;
	}

	public static boolean empty_add() {
		if (add_code.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Codigo... ingrese nuevamente");
			return false;
		}
		if (add_VAT.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el IVA... ingrese nuevamente");
			return false;
		}
		if (add_name.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Nombre... ingrese nuevamente");
			return false;
		}
		if (add_initial.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Stock Inicial... ingrese nuevamente");
			return false;
		}
		if (add_unitaryPrice.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Precio Unitario... ingrese nuevamente");
			return false;
		}
		if (add_sellPrice.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Precio de Venta... ingrese nuevamente");
			return false;
		}

		return true;
	}

	public static boolean empty(JTextField empty_Jtext) {
		if (empty_Jtext.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Codigo... ingrese nuevamente");
			return false;
		}

		return true;
	}

	public static void search(JTextField searching, JTable table, DefaultTableModel model) {

		int cod = 0;

		if (empty(searching)) {

			try {
				cod = Integer.parseInt(searching.getText().trim());

			} catch (java.lang.NumberFormatException e23) {
				JOptionPane.showMessageDialog(null, "Error debe ingresar numeros en el campo codigo");
				searching.setText("");

			}

			MySQL.Find_Description(cod, table, model);
		}

	}
}
