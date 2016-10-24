import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Root_Frame extends JFrame {

	private JPanel contentPane;
	private static JTextField userToAdd;
	private static JTextField removeUser;
	private static JTextField add_code;
	private static JTextField add_name;
	private static JTextField add_initial;
	private static JTextField add_unitaryPrice;
	private static JTextField add_sellPrice;
	private static JTextField sell_search_search;
	private JTextField sell_sell_amount;
	private JTextField buy_quantity;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField update_price;
	private JButton add_user;
	private JButton remove_user;
	private JPanel panel_1;
	private static JPasswordField passToAdd;
	private JButton add_button;
	private static JTextField add_manufacturer;
	private JButton sell_search_button;
	private static ArrayList<Integer> find = new ArrayList<Integer>();
	private JTextField logicDeletion_code;
	private JTextField get_year;
	private JTextField update_code;
	private JTextField vat_code;
	private JTextField buy_textField;
	private JTable table;
	private JTable table_1;
	private JTable add_find;
	private JTable logicDeletion_search;
	private JTable get_search;
	private JTable update_search;
	private JTable vat_search;
	private static JTextArea add_description;
	private static JRadioButton seller_select;
	private static JRadioButton admin_select;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	public static Root_Frame frame;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JRadioButton zero;
	private JRadioButton fourteen;
	private JRadioButton twenty2;
	private static int vat;
	private JTextField up_search;
	private JTable up_table;
	private JTextField get_month;
	private JTextField get_day;
	private static JPasswordField passCToAdd;
	private JTextArea get_total;
	private static DefaultTableModel model;
	private static int history;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JRadioButton Zero;
	private JRadioButton Fourteen;
	private JRadioButton Twenty2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Root_Frame();
					frame.setVisible(true);
					frame.setResizable(false);
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\Icono.png"));
		setResizable(false);
		setTitle("Administrador");

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Login_Frame.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 874, 501);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Control de mercaderia", null, panel, null);
		panel.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 849, 433);
		panel.add(tabbedPane_1);

		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Agregar", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel label_5 = new JLabel("Codigo");
		label_5.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_5.setBounds(81, 75, 123, 27);
		panel_2.add(label_5);

		JLabel label_6 = new JLabel("IVA");
		label_6.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_6.setBounds(81, 117, 123, 14);
		panel_2.add(label_6);

		JLabel label_7 = new JLabel("Nombre");
		label_7.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_7.setBounds(81, 155, 123, 14);
		panel_2.add(label_7);

		JLabel label_8 = new JLabel("Stock inicial");
		label_8.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_8.setBounds(81, 196, 123, 14);
		panel_2.add(label_8);

		JLabel label_9 = new JLabel("Precio Unitario");
		label_9.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_9.setBounds(81, 236, 123, 14);
		panel_2.add(label_9);

		JLabel label_10 = new JLabel("Precio de venta");
		label_10.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_10.setBounds(81, 276, 123, 14);
		panel_2.add(label_10);

		add_code = new JTextField();
		add_code.setColumns(10);
		add_code.setBounds(231, 82, 150, 20);
		panel_2.add(add_code);

		add_name = new JTextField();
		add_name.setColumns(10);
		add_name.setBounds(231, 156, 150, 20);
		panel_2.add(add_name);

		add_initial = new JTextField();
		add_initial.setColumns(10);
		add_initial.setBounds(231, 197, 150, 20);
		panel_2.add(add_initial);

		add_unitaryPrice = new JTextField();
		add_unitaryPrice.setColumns(10);
		add_unitaryPrice.setBounds(231, 237, 150, 20);
		panel_2.add(add_unitaryPrice);

		add_sellPrice = new JTextField();
		add_sellPrice.setColumns(10);
		add_sellPrice.setBounds(231, 277, 150, 20);
		panel_2.add(add_sellPrice);

		add_manufacturer = new JTextField();
		add_manufacturer.setColumns(10);
		add_manufacturer.setBounds(231, 319, 150, 20);
		panel_2.add(add_manufacturer);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(542, 76, 186, 214);
		panel_2.add(scrollPane);

		add_description = new JTextArea();
		scrollPane.setViewportView(add_description);

		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblFabricante.setBounds(81, 312, 123, 27);
		panel_2.add(lblFabricante);

		JLabel lblDescripcion_1 = new JLabel("Descripcion");
		lblDescripcion_1.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblDescripcion_1.setBounds(588, 35, 140, 27);
		panel_2.add(lblDescripcion_1);

		add_button = new JButton("Confirmar");
		add_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (zero.isSelected()) {
					vat = 0;
					add_merchandise(add_code, add_name, add_manufacturer, add_initial, vat, add_unitaryPrice,
							add_sellPrice, add_description);
				} else {

					if (fourteen.isSelected()) {
						vat = 14;
						add_merchandise(add_code, add_name, add_manufacturer, add_initial, vat, add_unitaryPrice,
								add_sellPrice, add_description);
					} else {
						if (twenty2.isSelected()) {
							vat = 22;
							add_merchandise(add_code, add_name, add_manufacturer, add_initial, vat, add_unitaryPrice,
									add_sellPrice, add_description);
						} else {
							JOptionPane.showMessageDialog(null, "Error tiene que seleccionar un porcentaje de IVA");
						}
					}
				}

			}
		});
		add_button.setBounds(543, 318, 185, 23);
		panel_2.add(add_button);

		zero = new JRadioButton("0%");
		zero.setBackground(new Color(240, 240, 240));
		buttonGroup_2.add(zero);
		zero.setBounds(233, 118, 48, 23);
		panel_2.add(zero);

		fourteen = new JRadioButton("14%");
		buttonGroup_2.add(fourteen);
		fourteen.setBounds(283, 118, 48, 23);
		panel_2.add(fourteen);

		twenty2 = new JRadioButton("22%");
		buttonGroup_2.add(twenty2);
		twenty2.setBounds(333, 118, 48, 23);
		panel_2.add(twenty2);
		
		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		label_20.setBounds(0, 0, 844, 405);
		panel_2.add(label_20);

		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Vender", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblCodigoDelProducto = new JLabel("Codigo del producto");
		lblCodigoDelProducto.setFont(new Font("DokChampa", Font.BOLD, 14));
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

		model = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		Object[] columnsName = new Object[8];

		columnsName[0] = "Codigo";
		columnsName[1] = "Nombre";
		columnsName[2] = "Fabricante";
		columnsName[3] = "Stock";
		columnsName[4] = "Iva";
		columnsName[5] = "Precio unitario";
		columnsName[6] = "Precio de venta";
		columnsName[7] = "Descripcion";

		model.setColumnIdentifiers(columnsName);

		table.setModel(model);

		sell_search_button = new JButton("Buscar");
		sell_search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean up = false;

				search(sell_search_search, table, model, up);

			}
		});
		sell_search_button.setBounds(152, 58, 89, 23);
		panel_3.add(sell_search_button);

		sell_sell_amount = new JTextField();
		sell_sell_amount.setColumns(10);
		sell_sell_amount.setBounds(745, 58, 61, 20);
		panel_3.add(sell_sell_amount);

		JTextArea sell_textArea = new JTextArea();
		sell_textArea.setBounds(667, 209, 139, 115);
		panel_3.add(sell_textArea);

		JButton sell_search_confirm = new JButton("Confirmar venta");
		sell_search_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				sell_confirm(table, sell_sell_amount, sell_textArea);

			}
		});
		sell_search_confirm.setBounds(667, 352, 139, 23);
		panel_3.add(sell_search_confirm);

		JLabel lblVenta = new JLabel("Venta");
		lblVenta.setFont(new Font("DokChampa", Font.BOLD, 14));
		lblVenta.setBounds(711, 29, 61, 18);
		panel_3.add(lblVenta);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCantidad.setBounds(660, 58, 68, 18);
		panel_3.add(lblCantidad);

		JLabel label_14 = new JLabel("Precio Final");
		label_14.setFont(new Font("DokChampa", Font.BOLD, 14));
		label_14.setBounds(694, 164, 89, 18);
		panel_3.add(label_14);

		JButton sell_search_see = new JButton("Visualizar");
		sell_search_see.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				sell(table, sell_sell_amount, sell_textArea);

			}
		});
		sell_search_see.setBounds(692, 120, 91, 23);
		panel_3.add(sell_search_see);
		
		JLabel label_22 = new JLabel("");
		label_22.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		label_22.setBounds(0, 0, 844, 405);
		panel_3.add(label_22);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		tabbedPane_1.addTab("Comprar", null, panel_9, null);

		buy_quantity = new JTextField();
		buy_quantity.setColumns(10);
		buy_quantity.setBounds(749, 58, 61, 20);
		panel_9.add(buy_quantity);

		JTextArea buy_textArea = new JTextArea();
		buy_textArea.setBounds(667, 209, 139, 115);
		panel_9.add(buy_textArea);

		JButton buy_confirm = new JButton("Confirmar compra");
		buy_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buy_confirm(add_find, buy_quantity, buy_textArea);

			}
		});
		buy_confirm.setBounds(671, 352, 139, 23);
		panel_9.add(buy_confirm);

		JLabel lblCompra = new JLabel("Compra");
		lblCompra.setFont(new Font("DokChampa", Font.BOLD, 14));
		lblCompra.setBounds(711, 29, 61, 18);
		panel_9.add(lblCompra);

		JLabel label_15 = new JLabel("Cantidad");
		label_15.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_15.setBounds(660, 58, 68, 18);
		panel_9.add(label_15);

		JLabel lblPrecioFnal = new JLabel("Precio Final");
		lblPrecioFnal.setFont(new Font("DokChampa", Font.BOLD, 14));
		lblPrecioFnal.setBounds(683, 180, 89, 18);
		panel_9.add(lblPrecioFnal);

		JButton buy_preview = new JButton("Visualizar");
		buy_preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buy(add_find, buy_quantity, buy_textArea);

			}
		});
		buy_preview.setBounds(683, 118, 91, 23);
		panel_9.add(buy_preview);

		JLabel label_11 = new JLabel("Codigo del producto");
		label_11.setFont(new Font("DokChampa", Font.BOLD, 14));
		label_11.setBounds(10, 29, 157, 18);
		panel_9.add(label_11);

		buy_textField = new JTextField();
		buy_textField.setColumns(10);
		buy_textField.setBounds(10, 58, 110, 20);
		panel_9.add(buy_textField);

		JButton add_find_button = new JButton("Buscar");
		add_find_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean up = false;

				search(buy_textField, add_find, model, up);

			}
		});
		add_find_button.setBounds(152, 58, 89, 23);
		panel_9.add(add_find_button);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 89, 600, 286);
		panel_9.add(scrollPane_2);

		add_find = new JTable();
		scrollPane_2.setViewportView(add_find);
		add_find.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add_find.setModel(model);

		add_find.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		lblNewLabel.setBounds(0, 0, 844, 405);
		panel_9.add(lblNewLabel);

		DefaultTableModel model_date = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		Object[] columnsNameLog = new Object[6];

		columnsNameLog[0] = "Codigo";
		columnsNameLog[1] = "Usuario";
		columnsNameLog[2] = "Fecha del movimiento";
		columnsNameLog[3] = "Movimiento del producto";
		columnsNameLog[4] = "Codigo del producto";
		columnsNameLog[5] = "Monto";

		model_date.setColumnIdentifiers(columnsNameLog);

		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Baja Logica", null, panel_6, null);
		panel_6.setLayout(null);

		JButton down_button = new JButton("Confirmar baja logica");
		down_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean u = false;
				logic_deletion(logicDeletion_search, u);
			}
		});
		down_button.setBounds(342, 371, 160, 23);
		panel_6.add(down_button);

		logicDeletion_code = new JTextField();
		logicDeletion_code.setColumns(10);
		logicDeletion_code.setBounds(10, 40, 110, 20);
		panel_6.add(logicDeletion_code);

		JLabel label_13 = new JLabel("Codigo del producto");
		label_13.setFont(new Font("DokChampa", Font.BOLD, 14));
		label_13.setBounds(10, 11, 157, 18);
		panel_6.add(label_13);

		JButton down_search = new JButton("Buscar");
		down_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (empty(logicDeletion_code)) {
					boolean up = false;

					search(logicDeletion_code, logicDeletion_search, model, up);
				}
			}
		});
		down_search.setBounds(130, 39, 89, 23);
		panel_6.add(down_search);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 75, 824, 285);
		panel_6.add(scrollPane_3);

		logicDeletion_search = new JTable();
		scrollPane_3.setViewportView(logicDeletion_search);
		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		logicDeletion_search.setModel(model);

		DefaultTableModel model2 = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		;

		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 844, 405);
		panel_6.add(lblNewLabel_1);

		model2.setColumnIdentifiers(columnsName);

		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Alta Logica", null, panel_8, null);
		panel_8.setLayout(null);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 75, 824, 285);
		panel_8.add(scrollPane_7);

		up_table = new JTable();
		scrollPane_7.setViewportView(up_table);
		up_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton up_buttton2 = new JButton("Confirmar alta logica");
		up_buttton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean u = true;

				logic_validation(up_table, u);
			}
		});
		up_buttton2.setBounds(313, 371, 222, 23);
		panel_8.add(up_buttton2);

		up_search = new JTextField();
		up_search.setColumns(10);
		up_search.setBounds(10, 40, 110, 20);
		panel_8.add(up_search);

		up_table.setModel(model2);

		JLabel label_12 = new JLabel("Codigo del producto");
		label_12.setFont(new Font("DokChampa", Font.BOLD, 14));
		label_12.setBounds(10, 11, 157, 18);
		panel_8.add(label_12);

		JButton up_button = new JButton("Buscar");
		up_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean up = true;
				if (empty(up_search)) {
					search(up_search, up_table, model2, up);
				}
			}
		});

		up_button.setBounds(130, 39, 89, 23);
		panel_8.add(up_button);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		label_23.setBounds(0, 0, 844, 405);
		panel_8.add(label_23);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		tabbedPane_1.addTab("Actualizar", null, panel_5, null);

		JButton update_price_button = new JButton("Confirmar precio");
		update_price_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				update(update_search, update_price);

			}
		});
		update_price_button.setBounds(695, 57, 139, 23);
		panel_5.add(update_price_button);

		JLabel lblNuevoPrecio = new JLabel("Nuevo Precio");
		lblNuevoPrecio.setFont(new Font("DokChampa", Font.BOLD, 14));
		lblNuevoPrecio.setBounds(545, 29, 140, 18);
		panel_5.add(lblNuevoPrecio);

		update_price = new JTextField();
		update_price.setBounds(545, 58, 140, 20);
		panel_5.add(update_price);
		update_price.setColumns(10);

		update_code = new JTextField();
		update_code.setColumns(10);
		update_code.setBounds(10, 58, 140, 20);
		panel_5.add(update_code);

		JLabel label_19 = new JLabel("Codigo del producto");
		label_19.setFont(new Font("DokChampa", Font.BOLD, 14));
		label_19.setBounds(10, 29, 157, 18);
		panel_5.add(label_19);

		JButton update_button = new JButton("Buscar");
		update_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean up = false;

				search(update_code, update_search, model, up);
			}
		});
		update_button.setBounds(160, 57, 139, 23);
		panel_5.add(update_button);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 101, 824, 274);
		panel_5.add(scrollPane_5);

		update_search = new JTable();
		scrollPane_5.setViewportView(update_search);
		update_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		update_search.setModel(model);
		update_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		lblNewLabel_2.setBounds(0, 0, 844, 405);
		panel_5.add(lblNewLabel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Obtener montos", null, panel_4, null);

		get_year = new JTextField();
		get_year.setColumns(10);
		get_year.setBounds(10, 59, 110, 20);
		panel_4.add(get_year);

		JLabel lblFechaABuscar = new JLabel("Fecha a buscar");
		lblFechaABuscar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblFechaABuscar.setBounds(140, 11, 157, 18);
		panel_4.add(lblFechaABuscar);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 90, 693, 285);
		panel_4.add(scrollPane_4);

		get_search = new JTable();
		get_search.setRowSelectionAllowed(false);
		scrollPane_4.setViewportView(get_search);
		get_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		get_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		get_search.setModel(model_date);

		get_month = new JTextField();
		get_month.setColumns(10);
		get_month.setBounds(140, 59, 110, 20);
		panel_4.add(get_month);

		get_day = new JTextField();
		get_day.setColumns(10);
		get_day.setBounds(260, 59, 110, 20);
		panel_4.add(get_day);

		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(10, 33, 110, 14);
		panel_4.add(lblAo);

		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(140, 33, 110, 14);
		panel_4.add(lblMes);

		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(260, 33, 110, 14);
		panel_4.add(lblDia);

		JButton get_find = new JButton("Buscar");
		get_find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				logs(get_year, get_month, get_day, get_search, model_date, get_total);

			}
		});
		get_find.setBounds(408, 57, 89, 23);
		panel_4.add(get_find);

		JLabel label_16 = new JLabel("/");
		label_16.setBounds(130, 62, 14, 14);
		panel_4.add(label_16);

		JLabel label_17 = new JLabel("/");
		label_17.setBounds(252, 62, 14, 14);
		panel_4.add(label_17);

		JLabel lblGanancia = new JLabel("Ganancia");
		lblGanancia.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblGanancia.setBounds(741, 276, 89, 18);
		panel_4.add(lblGanancia);

		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(713, 306, 119, 69);
		panel_4.add(scrollPane_8);

		get_total = new JTextArea();
		get_total.setBounds(713, 349, 117, 26);
		panel_4.add(get_total);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		lblNewLabel_3.setBounds(0, 0, 857, 405);
		panel_4.add(lblNewLabel_3);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		tabbedPane_1.addTab("Modificar IVA", null, panel_7, null);

		JButton vat_value_button = new JButton("Confirmar precio");
		vat_value_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vat_value = 0;
				if(Zero.isSelected()){
					
				}else{
					if(Fourteen.isSelected()){
						vat_value = 14;
					}else{
						if(Twenty2.isSelected()){
							vat_value = 22;
						}
					}
				}
				vat(vat_search, vat_value);

			}
		});
		vat_value_button.setBounds(612, 57, 139, 23);
		panel_7.add(vat_value_button);

		JLabel lblNuevoPorcentaje = new JLabel("Nuevo Porcentaje");
		lblNuevoPorcentaje.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblNuevoPorcentaje.setBounds(458, 29, 120, 18);
		panel_7.add(lblNuevoPorcentaje);

		vat_code = new JTextField();
		vat_code.setColumns(10);
		vat_code.setBounds(10, 58, 132, 20);
		panel_7.add(vat_code);

		JLabel label_21 = new JLabel("Codigo del producto");
		label_21.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_21.setBounds(10, 29, 157, 18);
		panel_7.add(label_21);

		JButton vat_button = new JButton("Buscar");
		vat_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean up = false;
				search(vat_code, vat_search, model, up);

			}
		});
		vat_button.setBounds(152, 58, 89, 23);
		panel_7.add(vat_button);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 94, 824, 281);
		panel_7.add(scrollPane_6);

		vat_search = new JTable();
		scrollPane_6.setViewportView(vat_search);
		vat_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		vat_search.setModel(model);
		
		Zero = new JRadioButton("0%");
		buttonGroup_3.add(Zero);
		Zero.setBounds(458, 55, 48, 23);
		panel_7.add(Zero);
		
		Fourteen = new JRadioButton("14%");
		buttonGroup_3.add(Fourteen);
		Fourteen.setBounds(508, 55, 48, 23);
		panel_7.add(Fourteen);
		
		Twenty2 = new JRadioButton("22%");
		buttonGroup_3.add(Twenty2);
		Twenty2.setBounds(558, 55, 48, 23);
		panel_7.add(Twenty2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		lblNewLabel_4.setBounds(0, 0, 844, 405);
		panel_7.add(lblNewLabel_4);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_2.jpg"));
		label_4.setBounds(0, 0, 869, 473);
		panel.add(label_4);

		panel_1 = new JPanel();
		tabbedPane.addTab("Control de usuarios", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel label = new JLabel("Agregar usuarios");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(89, 52, 269, 37);
		panel_1.add(label);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreDeUsuario.setBounds(31, 135, 209, 21);
		panel_1.add(lblNombreDeUsuario);

		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(31, 186, 171, 16);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("Eliminar usuarios");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_3.setBounds(542, 52, 238, 37);
		panel_1.add(label_3);

		add_user = new JButton("Confirmar");
		add_user.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				add_users();

			}
		});
		add_user.setBounds(119, 373, 209, 23);
		panel_1.add(add_user);

		userToAdd = new JTextField();
		userToAdd.setColumns(10);
		userToAdd.setBounds(250, 139, 175, 20);
		panel_1.add(userToAdd);

		JLabel lblNombreDeUsuario_1 = new JLabel("Nombre de usuario");
		lblNombreDeUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNombreDeUsuario_1.setBounds(471, 137, 175, 17);
		panel_1.add(lblNombreDeUsuario_1);

		removeUser = new JTextField();
		removeUser.setColumns(10);
		removeUser.setBounds(656, 139, 175, 20);
		panel_1.add(removeUser);

		remove_user = new JButton("Confirmar");
		remove_user.setFont(new Font("Tahoma", Font.PLAIN, 20));
		remove_user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove_user();
			}
		});
		remove_user.setBounds(552, 179, 228, 23);
		panel_1.add(remove_user);

		passToAdd = new JPasswordField();
		passToAdd.setBounds(250, 189, 175, 17);
		panel_1.add(passToAdd);

		admin_select = new JRadioButton("Es administrador");
		admin_select.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup_1.add(admin_select);
		admin_select.setBounds(31, 293, 394, 23);
		panel_1.add(admin_select);

		seller_select = new JRadioButton("Es vendedor");
		seller_select.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonGroup_1.add(seller_select);
		seller_select.setBounds(31, 330, 394, 23);
		panel_1.add(seller_select);

		passCToAdd = new JPasswordField();
		passCToAdd.setBounds(250, 236, 175, 17);
		panel_1.add(passCToAdd);

		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConfirmarContrasea.setBounds(31, 233, 209, 16);
		panel_1.add(lblConfirmarContrasea);
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_2.jpg"));
		label_18.setBounds(0, 0, 869, 473);
		panel_1.add(label_18);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_1.jpg"));
		label_1.setBounds(0, 0, 896, 522);
		contentPane.add(label_1);
	}

	public static boolean empty_users() {
		if (userToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
		if (passToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contrase√±a... ingrese nuevamente");
			return false;
		}
		if (passCToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"Error No Ingreso la confirmacion de la Contrase√±a... ingrese nuevamente");
			return false;
		}
		return true;
	}

	public static boolean empty_add() {
		if (add_code.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Codigo... ingrese nuevamente");
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
		int code, Uprice, Sprice, stock;
		try {
			code = Integer.parseInt(add_code.getText());
			Uprice = Integer.parseInt(add_unitaryPrice.getText());
			Sprice = Integer.parseInt(add_sellPrice.getText());
			stock = Integer.parseInt(add_initial.getText());

			if (code < 0 || vat < 0 || Uprice < 0 || Sprice < 0 || stock < 0) {

				JOptionPane.showMessageDialog(null, "No puede ingresar un valor negativo");
				return false;
			}

		} catch (java.lang.NumberFormatException ex2) {
			JOptionPane.showMessageDialog(null,
					"Error debe ingresar letras ni numeros mayores a 10 cifras en los campos codigo,iva,precio unitario,precio de venta,stock");
			return false;
		}

		if (add_name.getText().length() > 15 || add_manufacturer.getText().length() > 15
				|| add_description.getText().length() > 30) {

			JOptionPane.showMessageDialog(null,
					"Error no puede ingresar mas de 15 digitos en los campos nombre y fabricante y mas de 30 en descripcion");
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

	public static void search(JTextField searching, JTable table, DefaultTableModel model, boolean up) {

		int cod = 0;
		boolean x = true;

		if (empty(searching)) {

			try {
				cod = Integer.parseInt(searching.getText().trim());

			} catch (java.lang.NumberFormatException e23) {
				JOptionPane.showMessageDialog(null, "Error debe ingresar numeros en el campo codigo");
				searching.setText("");
				x = false;

			}
			if (x == true) {
				history = cod;
				MySQL.Find_Description(cod, table, model, up);

			}
		}

	}

	public static void sell(JTable table, JTextField sell_sell_amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			int Nrow = table.getSelectedRow();
			if (MySQL.SN(sell_sell_amount.getText())) {
				if (sell_sell_amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de venta no debe estar vacia");
				} else {
					int am = Integer.parseInt(sell_sell_amount.getText());

					if (am > 0) {

						double price = Integer.parseInt(table.getValueAt(Nrow, 6).toString());
						double iva = Integer.parseInt(table.getValueAt(Nrow, 4).toString());

						textArea.setText(total(sell_sell_amount, iva, price));

					} else {
						JOptionPane.showMessageDialog(null, "No puede ingresar una cantidad menor a 0");
					}
				}

			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de venta debe ser un numero y menor a 2147483647");
			}
		}

	}

	public static String total(JTextField amount, double iva, double price) {

		String value = String.valueOf((Double.parseDouble(amount.getText())) * (price + (price * (iva / 100))));

		return value;
	}

	public static void sell_confirm(JTable table, JTextField sell_sell_amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MySQL.SN(sell_sell_amount.getText())) {
				if (sell_sell_amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de venta no debe estar vacia");
				} else {

					int am = Integer.parseInt(sell_sell_amount.getText());

					if (am > 0) {

						String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

						int Nrow = table.getSelectedRow();
						double price = Integer.parseInt(table.getValueAt(Nrow, 6).toString());
						double iva = Integer.parseInt(table.getValueAt(Nrow, 4).toString());
						String total_amount = total(sell_sell_amount, iva, price);

						if (MySQL.sellMerch(tableS, Integer.parseInt(sell_sell_amount.getText()), total_amount)) {

							JOptionPane.showMessageDialog(null,
									"Se ha vendido " + sell_sell_amount.getText() + " del producto "
											+ (String) table.getValueAt(table.getSelectedRow(), 0) + " Total: $"
											+ total_amount);
							MySQL.Find_Description(history, table, model, false);

						}

					} else {

						JOptionPane.showMessageDialog(null, "No puede ingresar una cantidad menor a 0");

					}

				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de venta debe ser un numero y menor a 2147483647");
			}
		}

		sell_sell_amount.setText("");
		textArea.setText("");
	}

	public static void buy(JTable table, JTextField amount, JTextArea textArea) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			int Nrow = table.getSelectedRow();
			if (MySQL.SN(amount.getText())) {
				if (amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de compra no debe estar vacia");
				} else {
					int am = Integer.parseInt(amount.getText());
					if (am > 0) {

						double price = Integer.parseInt(table.getValueAt(Nrow, 6).toString());
						double iva = Integer.parseInt(table.getValueAt(Nrow, 4).toString());

						textArea.setText(total(amount, iva, price));

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
			if (MySQL.SN(amount.getText())) {
				if (amount.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "La cantidad de compra no debe estar vacia");
				} else {
					int am = Integer.parseInt(amount.getText());
					if (am > 0) {

						String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

						int Nrow = table.getSelectedRow();
						double price = Integer.parseInt(table.getValueAt(Nrow, 6).toString());
						double iva = Integer.parseInt(table.getValueAt(Nrow, 4).toString());

						String total_amount = total(amount, iva, price);

						if (MySQL.buyMerch(tableS, Integer.parseInt(amount.getText()), total_amount)) {

							JOptionPane.showMessageDialog(null,
									"Se ha comprado " + amount.getText() + " del producto "
											+ (String) table.getValueAt(table.getSelectedRow(), 0) + " Total: $"
											+ total_amount);

							MySQL.Find_Description(history, table, model, false);

						}

					} else {

						JOptionPane.showMessageDialog(null, "No puede ingresar una cantidad menor a 0");
					}

				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de compra debe ser un numero");
			}
		}

		amount.setText("");
		textArea.setText("");
	}

	public static void vat(JTable table, int value) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			
					
					String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());
					MySQL.changeVAT(tableS, value);
					if (value > 0) {
						JOptionPane.showMessageDialog(null, "El IVA se ha actualizado correctamente");
					}
					MySQL.Find_Description(history, table, model, false);

				}
			
		}


	public static void update(JTable table, JTextField value) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {
			if (MySQL.SN(value.getText())) {
				if (value.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "El nuevo precio de venta no debe estar vacio");
				} else {
					int values = Integer.parseInt(value.getText());
					String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

					MySQL.changeSellPrice(tableS, values);
					if (values > 0) {
						JOptionPane.showMessageDialog(null, "El precio se ha actualizado correctamente");
					}
					MySQL.Find_Description(history, table, model, false);

				}
			} else {
				JOptionPane.showMessageDialog(null, "El nuevo prcio de venta debe ser un numero y menor a 10 digitos");
			}
		}
		value.setText("");

	}

	public static void add_merchandise(JTextField code, JTextField name, JTextField manu, JTextField stock, int vat,
			JTextField Uprice, JTextField Sprice, JTextArea des) {

		if (empty_add()) {

			if(MySQL.AddMerchandise(code.getText(), name.getText(), manu.getText(), stock.getText(), vat, Uprice.getText(),
					Sprice.getText(), des.getText())){

			JOptionPane.showMessageDialog(null, "Nuevo producto ingresado correctamente");

			}
		}

		code.setText("");
		name.setText("");
		manu.setText("");
		stock.setText("");
		Uprice.setText("");
		Sprice.setText("");
		des.setText("");

	}

	public static void logic_deletion(JTable table, boolean u) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

			MySQL.Merch(tableS, u);

			JOptionPane.showMessageDialog(null, "Producto dado de baja correctamente");

			MySQL.Find_Description(history, table, model, false);

		}

	}

	public static void logic_validation(JTable table, boolean u) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

			MySQL.Merch(tableS, u);

			JOptionPane.showMessageDialog(null, "Producto dado de alta correctamente");

			MySQL.Find_Description(history, table, model, true);

		}

	}

	public static void logs(JTextField year, JTextField month, JTextField day, JTable table, DefaultTableModel model,
			JTextArea get_total) {

		String month3 = "", year3, day3 = "";
		boolean x = true;

		if (MySQL.SN(year.getText().trim())) {

			year3 = year.getText();

			if (month.getText().isEmpty()) {

				month3 = "01";
				day3 = "01";

				if (day.getText().isEmpty() == false) {

					JOptionPane.showMessageDialog(null, "Error tiene que ingresar un mes para buscar por dia");
					x = false;

				}

			} else {

				if (MySQL.SN2(month.getText().trim())) {

					int month2 = Integer.parseInt(month.getText());

					if (month2 > 12 || month2 <= 0) {
						JOptionPane.showMessageDialog(null,
								"Error no puede ingresar meses mayores a 12 ni meses negativos");
						x = false;
					} else {

						month3 = month.getText();

						if (day.getText().isEmpty()) {

							day3 = "01";

						} else {

							if (MySQL.SN2(day.getText().trim())) {

								int day2 = Integer.parseInt(day.getText());

								if (day2 > 31 || day2 <= 0) {
									JOptionPane.showMessageDialog(null,
											"Error no puede ingresar dias mayores a 31 ni dias negativos");
									x = false;

								} else {
									day3 = day.getText();
								}

							} else {

								JOptionPane.showMessageDialog(null, "Error solo puede ingresar numeros en dia");
								x = false;

							}
						}
					}
				} else {

					JOptionPane.showMessageDialog(null, "Error solo puede ingresar numeros en mes ");
					x = false;

				}
			}

			if (x == true) {
				MySQL.Find_Logs(year3, month3, day3, table, model, get_total);

			}

		} else {

			JOptionPane.showMessageDialog(null, "El campo aÒo no pude estar vacio y tiene que ser un numero");

		}

	}

	private static void add_users() {

		boolean typeOfUser = false;
		boolean x = true;
		if (empty_users()) {

			if (passToAdd.getText().length() > 15 || userToAdd.getText().length() > 15) {
				x = false;
				JOptionPane.showMessageDialog(null, "Error no puede ingresar usuarios ni contraseÒas mayores a 15");
			} else {

				if (admin_select.isSelected()) {
					typeOfUser = true;
				} else {
					if (seller_select.isSelected()) {
						typeOfUser = false;
					} else {
						JOptionPane.showMessageDialog(null, "Tiene que selecciona un tipo de usuario antes");
						x = false;
					}

				}

			}

			if (passToAdd.getText().equals(passCToAdd.getText()) == false) {
				JOptionPane.showMessageDialog(null, "Las contraseÒas no coinciden");
				x = false;
			} else {
				if (x == true) {

					MySQL.AddUser(passToAdd.getText(), userToAdd.getText(), typeOfUser);
					JOptionPane.showMessageDialog(null, "Registrado nuevo usuario");

				}
			}

			userToAdd.setText("");
			passToAdd.setText("");
			passCToAdd.setText("");

		}

	}

	private static void remove_user() {

		if (empty(removeUser)) {

			if (removeUser.getText().length() > 15) {
				JOptionPane.showMessageDialog(null, "No puede ingresar un nombre de usuario mayor a 15 car·cteres");
			} else {
				MySQL.RemoveUser(removeUser.getText());
			}

			removeUser.setText("");
		}

	}
}
