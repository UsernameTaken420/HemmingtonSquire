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
import java.awt.Toolkit;

public class User_Frame extends JFrame {

	private JPanel contentPane;
	private static JTextField sell_search_search;
	private JTextField sell_sell_amount;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton sell_search_button;
	private static ArrayList<Integer> find = new ArrayList<Integer>();
	private JTable table;
	private JTable table_1;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	public static User_Frame frame;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private static int vat;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(User_Frame.class.getResource("/Imagenes/Icono.png")));
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
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(User_Frame.class.getResource("/Imagenes/wood_3.jpg")));
		label_2.setBounds(0, -19, 844, 424);
		panel_3.add(label_2);

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
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(-15, -31, 895, 515);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon(User_Frame.class.getResource("/Imagenes/wood_2.jpg")));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(User_Frame.class.getResource("/Imagenes/wood_1.jpg")));
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
}
