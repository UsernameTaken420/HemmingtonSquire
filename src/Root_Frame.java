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

public class Root_Frame extends JFrame {

	private JPanel contentPane;
	private static JTextField userToAdd;
	private JTextField removeUser;
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
	private JRadioButton seller_select;
	private JRadioButton admin_select;
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
		setTitle("Root");

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Login_Frame.frame.setVisible(true);
				frame.setVisible(false);

			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 550);

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
		tabbedPane.setBounds(10, 11, 874, 480);
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
		add_button.setBounds(379, 257, 182, 23);
		panel_2.add(add_button);

		zero = new JRadioButton("0%");
		buttonGroup_2.add(zero);
		zero.setBounds(145, 99, 48, 23);
		panel_2.add(zero);

		fourteen = new JRadioButton("14%");
		buttonGroup_2.add(fourteen);
		fourteen.setBounds(195, 99, 48, 23);
		panel_2.add(fourteen);

		twenty2 = new JRadioButton("22%");
		buttonGroup_2.add(twenty2);
		twenty2.setBounds(245, 99, 48, 23);
		panel_2.add(twenty2);

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

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		tabbedPane_1.addTab("Obtener montos", null, panel_4, null);

		get_year = new JTextField();
		get_year.setColumns(10);
		get_year.setBounds(10, 59, 110, 20);
		panel_4.add(get_year);

		JLabel lblFechaABuscar = new JLabel("Fecha a buscar");
		lblFechaABuscar.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblFechaABuscar.setBounds(353, 11, 157, 18);
		panel_4.add(lblFechaABuscar);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 90, 693, 285);
		panel_4.add(scrollPane_4);

		get_search = new JTable();
		get_search.setRowSelectionAllowed(false);
		scrollPane_4.setViewportView(get_search);
		get_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		DefaultTableModel model_date = new DefaultTableModel() {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        return false;
		    }
		};

		get_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		Object[] columnsNameLog = new Object[6];

		columnsNameLog[0] = "Codigo";
		columnsNameLog[1] = "Usuario";
		columnsNameLog[2] = "Fecha del movimiento";
		columnsNameLog[3] = "Movimiento del producto";
		columnsNameLog[4] = "Codigo del producto";
		columnsNameLog[5] = "Monto";

		model_date.setColumnIdentifiers(columnsNameLog);
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

		JTextArea get_total = new JTextArea();
		get_total.setBounds(713, 278, 121, 116);
		panel_4.add(get_total);

		JButton get_find = new JButton("Buscar");
		get_find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				logs(get_year, get_month, get_day, get_total, get_search, model_date);

			}
		});
		get_find.setBounds(408, 57, 89, 23);
		panel_4.add(get_find);

		JButton get_button = new JButton("Desplegar ");
		get_button.setBounds(713, 244, 121, 23);
		panel_4.add(get_button);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(713, 219, 46, 14);
		panel_4.add(lblTotal);

		JLabel label_16 = new JLabel("/");
		label_16.setBounds(130, 62, 14, 14);
		panel_4.add(label_16);

		JLabel label_17 = new JLabel("/");
		label_17.setBounds(252, 62, 14, 14);
		panel_4.add(label_17);

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
		down_button.setBounds(626, 59, 160, 23);
		panel_6.add(down_button);

		logicDeletion_code = new JTextField();
		logicDeletion_code.setColumns(10);
		logicDeletion_code.setBounds(7, 60, 110, 20);
		panel_6.add(logicDeletion_code);

		JLabel label_13 = new JLabel("Codigo del producto");
		label_13.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_13.setBounds(7, 31, 157, 18);
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
		down_search.setBounds(149, 60, 89, 23);
		panel_6.add(down_search);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(7, 91, 596, 282);
		panel_6.add(scrollPane_3);

		logicDeletion_search = new JTable();
		scrollPane_3.setViewportView(logicDeletion_search);
		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		logicDeletion_search.setModel(model);

		DefaultTableModel model2 = new DefaultTableModel();

		logicDeletion_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		model2.setColumnIdentifiers(columnsName);

		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Alta Logica", null, panel_8, null);
		panel_8.setLayout(null);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 75, 592, 300);
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
		up_buttton2.setBounds(619, 39, 160, 23);
		panel_8.add(up_buttton2);

		up_search = new JTextField();
		up_search.setColumns(10);
		up_search.setBounds(10, 40, 110, 20);
		panel_8.add(up_search);

		up_table.setModel(model2);

		JLabel label_12 = new JLabel("Codigo del producto");
		label_12.setFont(new Font("DokChampa", Font.PLAIN, 14));
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

		up_button.setBounds(142, 40, 89, 23);
		panel_8.add(up_button);

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
				boolean up = false;

				search(update_code, update_search, model, up);
			}
		});
		update_button.setBounds(152, 58, 89, 23);
		panel_5.add(update_button);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 101, 596, 274);
		panel_5.add(scrollPane_5);

		update_search = new JTable();
		scrollPane_5.setViewportView(update_search);
		update_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		update_search.setModel(model);
		update_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
				boolean up = false;
				search(vat_code, vat_search, model, up);

			}
		});
		vat_button.setBounds(152, 58, 89, 23);
		panel_7.add(vat_button);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 94, 596, 281);
		panel_7.add(scrollPane_6);

		vat_search = new JTable();
		scrollPane_6.setViewportView(vat_search);
		vat_search.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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

					if (admin_select.isSelected()) {
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

		admin_select = new JRadioButton("Es administrador");
		buttonGroup_1.add(admin_select);
		admin_select.setBounds(10, 227, 209, 23);
		panel_1.add(admin_select);

		seller_select = new JRadioButton("Es vendedor");
		buttonGroup_1.add(seller_select);
		seller_select.setBounds(10, 264, 209, 23);
		panel_1.add(seller_select);
	}

	public static boolean vacio() {
		if (userToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
		if (passToAdd.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso la Contrase√±a... ingrese nuevamente");
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

	public static void search(JTextField searching, JTable table, DefaultTableModel model, boolean up) {

		int cod = 0;

		if (empty(searching)) {

			try {
				cod = Integer.parseInt(searching.getText().trim());

			} catch (java.lang.NumberFormatException e23) {
				JOptionPane.showMessageDialog(null, "Error debe ingresar numeros en el campo codigo");
				searching.setText("");

			}

			MySQL.Find_Description(cod, table, model, up);

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

					double price = Integer.parseInt(table.getValueAt(Nrow, 6).toString());
					double iva = Integer.parseInt(table.getValueAt(Nrow, 4).toString());

					textArea.setText(total(sell_sell_amount, iva, price));

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
					}

					sell_sell_amount.setText("");
					textArea.setText("");
				}
			} else {
				JOptionPane.showMessageDialog(null, "La cantidad de venta debe ser un numero y menor a 2147483647");
			}
		}

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
						}

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
			if (MySQL.SN(value.getText())) {
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
			if (MySQL.SN(value.getText())) {
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

	public static void add_merchandise(JTextField code, JTextField name, JTextField manu, JTextField stock, int vat,
			JTextField Uprice, JTextField Sprice, JTextArea des) {

		if (empty_add()) {

			MySQL.AddMerchandise(code.getText(), name.getText(), manu.getText(), stock.getText(), vat, Uprice.getText(),
					Sprice.getText(), des.getText());

			JOptionPane.showMessageDialog(null, "Nuevo producto ingresado correctamente");

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

		}

	}

	public static void logic_validation(JTable table, boolean u) {

		if (table.getSelectedRow() < 0) {
			JOptionPane.showMessageDialog(null, "Se debe seleccionar un producto en la tabla");
		} else {

			String tableS = (table.getValueAt(table.getSelectedRow(), 0).toString());

			MySQL.Merch(tableS, u);

			JOptionPane.showMessageDialog(null, "Producto dado de alta correctamente");

		}

	}

	public static void logs(JTextField year, JTextField month, JTextField day, JTextArea display, JTable table,
			DefaultTableModel model) {

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
				System.out.println("el coso logs");
				MySQL.Find_Logs(year3, month3, day3, table, model);

			}
		} else {

			JOptionPane.showMessageDialog(null, "El campo aÒo no pude estar vacio y tiene que ser un numero");

		}

	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
