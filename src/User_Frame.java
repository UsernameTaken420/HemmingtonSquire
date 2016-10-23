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
import java.awt.SystemColor;

public class User_Frame extends JFrame {

	private JPanel contentPane;
	private static JTextField sell_search_search;
	private JTextField sell_sell_amount;
	private JTextField buy_quantity;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton sell_search_button;
	private static ArrayList<Integer> find = new ArrayList<Integer>();
	private JTextField get_year;
	private JTextField buy_textField;
	private JTable table;
	private JTable table_1;
	private JTable add_find;
	private JTable get_search;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	public static User_Frame frame;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private static int vat;
	private JTextField get_month;
	private JTextField get_day;
	private JTextArea get_total;
	private static DefaultTableModel model;
	private static int history;
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new User_Frame();
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
	public User_Frame() {
		setResizable(false);
		setTitle("Usuario");

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
		tabbedPane.setBackground(SystemColor.activeCaption);
		tabbedPane.setBounds(10, 11, 874, 501);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Control de mercaderia", null, panel, null);
		panel.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 849, 433);
		panel.add(tabbedPane_1);

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
		lblVenta.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblVenta.setBounds(711, 29, 61, 18);
		panel_3.add(lblVenta);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCantidad.setBounds(660, 58, 68, 18);
		panel_3.add(lblCantidad);

		JLabel label_14 = new JLabel("Precio Final");
		label_14.setFont(new Font("DokChampa", Font.PLAIN, 14));
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
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		label_2.setBounds(0, -19, 844, 424);
		panel_3.add(label_2);

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
		lblCompra.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblCompra.setBounds(711, 29, 61, 18);
		panel_9.add(lblCompra);

		JLabel label_15 = new JLabel("Cantidad");
		label_15.setFont(new Font("DokChampa", Font.PLAIN, 14));
		label_15.setBounds(660, 58, 68, 18);
		panel_9.add(label_15);

		JLabel lblPrecioFnal = new JLabel("Precio Final");
		lblPrecioFnal.setFont(new Font("DokChampa", Font.PLAIN, 14));
		lblPrecioFnal.setBounds(694, 146, 89, 18);
		panel_9.add(lblPrecioFnal);

		JButton buy_preview = new JButton("Visualizar");
		buy_preview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				buy(add_find, buy_quantity, buy_textArea);

			}
		});
		buy_preview.setBounds(692, 120, 91, 23);
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
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(0, 0, 848, 411);
		panel_9.add(label_3);
		label_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));

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

		DefaultTableModel model2 = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		;

		model2.setColumnIdentifiers(columnsName);

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
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_3.jpg"));
		label_4.setBounds(0, 0, 844, 405);
		panel_4.add(label_4);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(-15, -31, 895, 515);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_2.jpg"));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Usuario\\Documents\\HemmingtonSquire\\src\\Imagenes\\wood_1.jpg"));
		label.setBounds(0, 0, 896, 522);
		contentPane.add(label);
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

			JOptionPane.showMessageDialog(null, "El campo año no pude estar vacio y tiene que ser un numero");

		}

	}
}
