import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class User_Remove extends JFrame {

	private JPanel contentPane;
	private static JTextField u;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Remove frame = new User_Remove();
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
	public User_Remove() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				
				User_Remove.this.dispose();
				Root_Frame.frame.setEnabled(true);
				Root_Frame.frame.setAlwaysOnTop(true);

			}
		});
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 217, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEliminarUsuarios = new JLabel("Eliminar usuarios");
		lblEliminarUsuarios.setBounds(59, 11, 93, 14);
		contentPane.add(lblEliminarUsuarios);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 76, 46, 14);
		contentPane.add(lblUsuario);
		
		u = new JTextField();
		u.setBounds(66, 73, 86, 20);
		contentPane.add(u);
		u.setColumns(10);
		
		JButton remove = new JButton("Eliminar");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (vacio()) {
					
					boolean x=MySQL.register();
					
					if(x){
						
						System.out.println("Conecto");
						MySQL.RemoveUser(u);
		
						
					}else{
						
						System.out.println("Hubo error");
					}
			}
				
		}});
		remove.setBounds(61, 131, 91, 23);
		contentPane.add(remove);
	}
	
	public static boolean vacio() {
		if (u.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Error No Ingreso el Usuario... ingrese nuevamente");
			return false;
		}
	
		return true;
	}

}
