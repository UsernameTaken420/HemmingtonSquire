
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
	private JTextField removeUser;
	private static JTextField add_code;
	private static JTextField add_VAT;
	private static JTextField add_name;
	private static JTextField add_initial;
	private static JTextField add_unitaryPrice;
	private static JTextField add_sellPrice;
	private static JTextField sell_search_search;
	private JTextField sell_sell_amount;
	private JTextField buy_quantity;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField update_price;
	private JTextField vat_value;
	private JButton add_user;
	private JButton remove_user;
	private JPanel panel_1;
	private static JPasswordField passToAdd;
	private JButton add_button;
	private static JTextField add_manufacturer;
	private JButton sell_search_button;
	private static ArrayList<Integer> find = new ArrayList<Integer>();
	private JTextField logicDeletion_code;
	private JTextField textField_2;
	private JTextField update_code;
	private JTextField vat_code;
	private JTextField buy_textField;
	private JTable table;
	private JTable table_1;
	private JTable add_find;
	private JTable logicDeletion_search;
	private JTable table_3;
	private JTable update_search;
	private JTable vat_search;
	private static JTextArea add_description;
	private JRadioButton seller;
	private JRadioButton admin;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

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

		add_description = new JTextArea();
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

				add_merchandise(add_code, add_name, add_manufacturer, add_initial, add_VAT, add_unitaryPrice,
						add_sellPrice, add_description);

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

		JTextArea sell_textArea = new JTextArea();
		sell_textArea.setBounds(624, 203, 139, 115);
		panel_3.add(sell_textArea);

		JButton sell_search_confirm = new JButton("Confirmar venta");
		sell_search_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				sell_confirm(table, sell_sell_amount, sell_textArea);

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

				sell(table, sell_sell_amount, sell_textArea);

			}
		});
		sell_search_see.setBounds(649, 120, 91, 23);
		panel_3.add(sell_search_see);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		tabbedPane_1.addTab("Comprar", null, panel_9, null);

		buy_quantity = new JTextField();
		buy_quantity.setColumns(10);
		buy_quantity.setBounds(715, 58, 61, 20);
		panel_9.add(buy_quantity);

		JTextArea buy_textArea = new JTextArea();
		buy_textArea.setBounds(637, 203, 139, 115);
		panel_9.add(buy_textArea);

		JButton buy_confirm = new JButton("Confirmar compra");
		buy_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buy_confirm(add_find, buy_quantity, buy_textArea);

			}
		});
		buy_confirm.setBounds(637, 332, 139, 23);
		panel_9.add(buy_confirm);

		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCompra.setBounds(680, 29, 61, 18);
		panel_9.add(lblCompra);

		JLabel label_15 = new JLabel("Cantidad");
		label_15.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_15.setBounds(637, 58, 68, 18);
		panel_9.add(label_15);

		JLabel lblPrecioFnal = new JLabel("Precio Final");
		lblPrecioFnal.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblPrecioFnal.setBounds(664, 163, 89, 18);
		panel_9.add(lblPrecioFnal);

		JButton buy_preview = new JButton("Visualizar");
		buy_preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buy(add_find, buy_quantity, buy_textArea);

			}
		});
		buy_preview.setBounds(664, 110, 91, 23);
		panel_9.add(buy_preview);

		JLabel label_11 = new JLabel("Codigo del producto");
		label_11.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_11.setBounds(10, 29, 157, 18);
		panel_9.add(label_11);

		buy_textField = new JTextField();
		buy_textField.setColumns(10);
		buy_textField.setBounds(10, 58, 110, 20);
		panel_9.add(buy_textField);

		JButton add_find_button = new JButton("Buscar");
		add_find_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				search(buy_textField, add_find, model);

			}
		});
		add_find_button.setBounds(152, 58, 89, 23);
		panel_9.add(add_find_button);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 89, 600, 286);
		panel_9.add(scrollPane_2);

		add_find = new JTable();
		scrollPane_2.setViewportView(add_find);

		add_find.setModel(model);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Baja Logica", null, panel_6, null);
		panel_6.setLayout(null);

		JButton btnConfirmarBajaLogica = new JButton("Confirmar baja logica");
		btnConfirmarBajaLogica.setBounds(626, 59, 160, 23);
		panel_6.add(btnConfirmarBajaLogica);

		logicDeletion_code = new JTextField();
		logicDeletion_code.setColumns(10);
		logicDeletion_code.setBounds(7, 60, 110, 20);
		panel_6.add(logicDeletion_code);

		JLabel label_13 = new JLabel("Codigo del producto");
		label_13.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_13.setBounds(7, 31, 157, 18);
		panel_6.add(label_13);

		JButton logicDeletion_button = new JButton("Buscar");
		logicDeletion_button.setBounds(149, 60, 89, 23);
		panel_6.add(logicDeletion_button);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(7, 91, 596, 282);
		panel_6.add(scrollPane_3);

		logicDeletion_search = new JTable();
		scrollPane_3.setViewportView(logicDeletion_search);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Obtener montos", null, panel_4, null);

		JTextArea textArea_10 = new JTextArea();
		textArea_10.setBounds(637, 203, 139, 152);
		panel_4.add(textArea_10);

		JButton btnConfirmarMontos = new JButton("Confirmar Montos");
		btnConfirmarMontos.setBounds(637, 158, 139, 23);
		panel_4.add(btnConfirmarMontos);

		JLabel lblMontos = new JLabel("Montos");
		lblMontos.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblMontos.setBounds(680, 29, 61, 18);
		panel_4.add(lblMontos);

		JRadioButton radioButton = new JRadioButton("Por dia");
		buttonGroup.add(radioButton);
		radioButton.setBounds(656, 58, 109, 23);
		panel_4.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("Por mes");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(656, 86, 109, 23);
		panel_4.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("Por a\u00F1o");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(656, 118, 109, 23);
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

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 90, 596, 285);
		panel_4.add(scrollPane_4);

		table_3 = new JTable();
		scrollPane_4.setViewportView(table_3);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Actualizar", null, panel_5, null);

		JButton update_price_button = new JButton("Confirmar precio");
		update_price_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				update(update_search, update_price);

			}
		});
		update_price_button.setBounds(637, 206, 139, 23);
		panel_5.add(update_price_button);

		JLabel lblActualizar = new JLabel("Actualizar");
		lblActualizar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblActualizar.setBounds(667, 32, 96, 18);
		panel_5.add(lblActualizar);

		JLabel lblNuevoPrecio = new JLabel("Nuevo Precio");
		lblNuevoPrecio.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblNuevoPrecio.setBounds(654, 114, 96, 18);
		panel_5.add(lblNuevoPrecio);

		update_price = new JTextField();
		update_price.setBounds(639, 164, 126, 20);
		panel_5.add(update_price);
		update_price.setColumns(10);

		update_code = new JTextField();
		update_code.setColumns(10);
		update_code.setBounds(10, 58, 110, 20);
		panel_5.add(update_code);

		JLabel label_19 = new JLabel("Codigo del producto");
		label_19.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_19.setBounds(10, 29, 157, 18);
		panel_5.add(label_19);

		JButton update_button = new JButton("Buscar");
		update_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				search(update_code, update_search, model);
			}
		});
		update_button.setBounds(152, 58, 89, 23);
		panel_5.add(update_button);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 101, 596, 274);
		panel_5.add(scrollPane_5);

		update_search = new JTable();
		scrollPane_5.setViewportView(update_search);

		update_search.setModel(model);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		tabbedPane_1.addTab("Modificar IVA", null, panel_7, null);

		JButton vat_value_button = new JButton("Confirmar precio");
		vat_value_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				vat(vat_search, vat_value);

			}
		});
		vat_value_button.setBounds(637, 203, 139, 23);
		panel_7.add(vat_value_button);

		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblModificar.setBounds(667, 29, 96, 18);
		panel_7.add(lblModificar);

		JLabel lblNuevoPorcentaje = new JLabel("Nuevo Porcentaje");
		lblNuevoPorcentaje.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblNuevoPorcentaje.setBounds(637, 111, 139, 18);
		panel_7.add(lblNuevoPorcentaje);

		vat_value = new JTextField();
		vat_value.setColumns(10);
		vat_value.setBounds(639, 161, 137, 20);
		panel_7.add(vat_value);

		vat_code = new JTextField();
		vat_code.setColumns(10);
		vat_code.setBounds(10, 58, 110, 20);
		panel_7.add(vat_code);

		JLabel label_21 = new JLabel("Codigo del producto");
		label_21.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_21.setBounds(10, 29, 157, 18);
		panel_7.add(label_21);

		JButton vat_button = new JButton("Buscar");
		vat_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				search(vat_code, vat_search, model);

			}
		});
		vat_button.setBounds(152, 58, 89, 23);
		panel_7.add(vat_button);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 94, 596, 281);
		panel_7.add(scrollPane_6);

		vat_search = new JTable();
		scrollPane_6.setViewportView(vat_search);

		vat_search.setModel(model);

		panel_1 = new JPanel();
		tabbedPane.addTab("Control de usuarios", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel label = new JLabel("Agregar usuarios");
		label.setBounds(40, 52, 129, 14);
		panel_1.add(label);

		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(10, 142, 113, 14);
		panel_1.add(label_1);

		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setBounds(10, 188, 113, 14);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("Eliminar usuarios");
		label_3.setBounds(630, 52, 100, 14);
		panel_1.add(label_3);

		add_user = new JButton("Confirmar");
		add_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean typeOfUser;
				if (vacio()) {

					if (admin.isSelected()) {
						typeOfUser = true;
					} else {
						typeOfUser = false;

					}

					MySQL.AddUser(passToAdd.getText(), userToAdd.getText(), typeOfUser);

					JOptionPane.showMessageDialog(null, "Registrado nuevo usuario");

					userToAdd.setText("");
					passToAdd.setText("");
				}

			}
		});
		add_user.setBounds(24, 341, 182, 23);
		panel_1.add(add_user);

		userToAdd = new JTextField();
		userToAdd.setColumns(10);
		userToAdd.setBounds(133, 139, 86, 20);
		panel_1.add(userToAdd);

		JLabel label_4 = new JLabel("Nombre");
		label_4.setBounds(588, 142, 66, 14);
		panel_1.add(label_4);

		removeUser = new JTextField();
		removeUser.setColumns(10);
		removeUser.setBounds(684, 139, 86, 20);
		panel_1.add(removeUser);

		remove_user = new JButton("Confirmar");
		remove_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (empty(removeUser)) {

					MySQL.RemoveUser(removeUser.getText());

					removeUser.setText("");
				}

			}
		});
		remove_user.setBounds(588, 227, 182, 23);
		panel_1.add(remove_user);

		passToAdd = new JPasswordField();
		passToAdd.setBounds(133, 186, 86, 17);
		panel_1.add(passToAdd);

		admin = new JRadioButton("Es administrador");
		buttonGroup_1.add(admin);
		admin.setBounds(10, 227, 209, 23);
		panel_1.add(admin);

		seller = new JRadioButton("Es vendedor");
		buttonGroup_1.add(seller);
		seller.setBounds(10, 264, 209, 23);
		panel_1.add(seller);
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
		if (add_description.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Descripcion... ingrese nuevamente");
			return false;
		}
		if (add_manufacturer.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Fabricante... ingrese nuevamente");
			return false;
		}
		int code, vat, Uprice, Sprice, stock;
	try {
			code = Integer.parseInt(add_code.getText());
			vat = Integer.parseInt(add_VAT.getText());
			Uprice = Integer.parseInt(add_unitaryPrice.getText());
			Sprice = Integer.parseInt(add_sellPrice.getText());
			stock = Integer.parseInt(add_initial.getText());

			if (code < 0 || vat < 0 || Uprice < 0 || Sprice < 0 || stock < 0) {

				JOptionPane.showMessageDialog(null, "No puede ingresar un valor negativo");
				return false;
			}

			
		} catch (java.lang.NumberFormatException ex2) {
			JOptionPane.showMessageDialog(null,
					"Error debe ingresar letras ni numeros mayores a 2147483647 en los campos codigo,iva,precio unitario,precio de venta,stock");
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

	public static void sell(JTable table, JTextField sell_sell_amount, JTextArea textArea_2) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			int Nrow = table.getSelectedRow();
			if (MisMetodos.SN(sell_sell_amount.getText())) {
				if (sell_sell_amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de venta no debe estar vacia");
				} else {

					Object ta = table.getValueAt(Nrow, 5);

					int ta2 = Integer.parseInt(ta.toString());

					textArea_2.setText(String.valueOf(Integer.parseInt(sell_sell_amount.getText()) * ta2));

				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de venta debe ser un numero y menor a 2147483647");
			}
		}

	}

	public static void sell_confirm(JTable table, JTextField sell_sell_amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MisMetodos.SN(sell_sell_amount.getText())) {
				if (sell_sell_amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de venta no debe estar vacia");
				} else {

					String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

					MySQL.sellMerch(tableS, Integer.parseInt(sell_sell_amount.getText()));

					JOptionPane.showMessageDialog(null, "Se ha vendido " + sell_sell_amount.getText() + " del producto "
							+ (String) table.getValueAt(table.getSelectedRow(), 0));
					sell_sell_amount.setText("");
					textArea.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de venta debe ser un numero y 2147483647");
			}
		}

	}

	public static void buy(JTable table, JTextField amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			int Nrow = table.getSelectedRow();
			if (MisMetodos.SN(amount.getText())) {
				if (amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de compra no debe estar vacia");
				} else {
					int am = Integer.parseInt(amount.getText());
					if (am > 0) {
						Object ta = table.getValueAt(Nrow, 5);

						int ta2 = Integer.parseInt(ta.toString());

						textArea.setText(String.valueOf(am * ta2));
					} else {
						JOptionPane.showMessageDialog(null, "No puede ingresar una cantidad menor a 0");
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de compra debe ser un numero y menor a 2147483647");
			}
		}

	}

	public static void buy_confirm(JTable table, JTextField amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MisMetodos.SN(amount.getText())) {
				if (amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de compra no debe estar vacia");
				} else {
					int am = Integer.parseInt(amount.getText());
					if (am > 0) {
						String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

						MySQL.buyMerch(tableS, am);

						JOptionPane.showMessageDialog(null, "Se ha comprado " + am + " del producto "
								+ (String) table.getValueAt(table.getSelectedRow(), 0));
					} else {

						JOptionPane.showMessageDialog(null, "No puede ingresar una cantidad menor a 0");
					}
					amount.setText("");
					textArea.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de compra debe ser un numero");
			}
		}

	}

	public static void vat(JTable table, JTextField value) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MisMetodos.SN(value.getText())) {
				if (value.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad a actualizar no debe estar vacia");
				} else {

					String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());
					int values = Integer.parseInt(value.getText());
					MySQL.changeVAT(tableS, values);
					if (values > 0) {
						JOptionPane.showMessageDialog(null, "El IVA se ha actualizado correctamente");
					}
					value.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad a actualizar debe ser un numero");
			}
		}

	}

	public static void update(JTable table, JTextField value) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MisMetodos.SN(value.getText())) {
				if (value.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "El nuevo prcio de venta no debe estar vacio");
				} else {
					int values = Integer.parseInt(value.getText());
					String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

					MySQL.changeSellPrice(tableS, values);

					if (values > 0) {
						JOptionPane.showMessageDialog(null, "El precio se ha actualizado correctamente");
					}

					value.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "El nuevo prcio de venta debe ser un numero");
			}
		}

	}

	public static void add_merchandise(JTextField code, JTextField name, JTextField manu, JTextField stock,
			JTextField vat, JTextField Uprice, JTextField Sprice, JTextArea des) {

		if (empty_add()) {

			MySQL.AddMerchandise(code.getText(), name.getText(), manu.getText(), stock.getText(), vat.getText(),
					Uprice.getText(), Sprice.getText(), des.getText());

			JOptionPane.showMessageDialog(null, "Nuevo producto ingresado correctamente");

		}
		

		code.setText("");
		name.setText("");
		manu.setText("");
		stock.setText("");
		vat.setText("");
		Uprice.setText("");
		Sprice.setText("");
		des.setText("");

	}
}
