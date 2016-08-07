import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;



public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.setLayout(null);
		
		JLabel lblNahueSeLa = new JLabel("Nahue se la come");
		lblNahueSeLa.setBounds(123, 83, 301, 85);
		lblNahueSeLa.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		contentPane.add(lblNahueSeLa);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(227, 179, 29, 20);
		contentPane.add(spinner);
		
		JLabel lblCuantasSeCome = new JLabel("Cuantas se come?");
		lblCuantasSeCome.setBounds(98, 179, 103, 20);
		contentPane.add(lblCuantasSeCome);

	}

}
