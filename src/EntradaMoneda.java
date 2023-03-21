import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EntradaMoneda extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaMoneda frame = new EntradaMoneda();
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
	public EntradaMoneda() {
		setTitle("Entarda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese la cantidad de dinero que deseas convertir");
		lblNewLabel.setBounds(70, 35, 298, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField.setBounds(95, 106, 244, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton ok2 = new JButton("OK");
		ok2.setForeground(new Color(0, 255, 0));
		ok2.addActionListener(new ActionListener() {			

			public void actionPerformed(ActionEvent e) {
				try {
					double entradaMoneda = Double.parseDouble(textField.getText());
					JFrame monedas = new Monedas(entradaMoneda);
	                monedas.setVisible(true);
	                dispose();
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(ok2, "Valor no válido");
				}
				
			}
		});
		ok2.setBounds(95, 181, 89, 23);
		contentPane.add(ok2);
		
		JButton cancel = new JButton("Atrás");
		cancel.setForeground(new Color(0, 0, 255));
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				dispose();
			}
		});
		cancel.setBounds(250, 181, 89, 23);
		contentPane.add(cancel);
	}
}
