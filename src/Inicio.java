import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		
		setBackground(new Color(240, 240, 240));
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione una opción de conversión");
		lblNewLabel.setBounds(106, 38, 217, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(128, 255, 255));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conversor de Moneda", "Conversor de Temperatura"}));
		comboBox.setBounds(106, 99, 217, 22);
		contentPane.add(comboBox);
		
		JButton ok = new JButton("OK");
		ok.setForeground(new Color(0, 255, 0));
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String selectedOption = (String) comboBox.getSelectedItem();
				if (selectedOption.equals("Conversor de Moneda")) {
					JFrame entradaMoneda = new EntradaMoneda();
					entradaMoneda.setVisible(true);	
	                
	            } else if (selectedOption.equals("Conversor de Temperatura")) {
	            	JFrame entradaTemperatura = new EntradaTemperatura();
					entradaTemperatura.setVisible(true);
	            }
				dispose();
			}
		});

		ok.setBounds(106, 186, 89, 23);
		contentPane.add(ok);
		
		JButton salir = new JButton("Salir");
		salir.setForeground(new Color(255, 0, 0));
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});		
		
		salir.setBounds(234, 186, 89, 23);
		contentPane.add(salir);
		
		
	}
}
