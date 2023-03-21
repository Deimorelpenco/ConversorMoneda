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

public class EntradaTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaTemperatura frame = new EntradaTemperatura();
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
	public EntradaTemperatura() {
		setTitle("Entrada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el valor a convertir");
		lblNewLabel.setBounds(140, 40, 163, 14);
		contentPane.add(lblNewLabel);
		
		textField2 = new JTextField();
		textField2.setBounds(126, 98, 177, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JButton ok3 = new JButton("OK");
		ok3.setForeground(new Color(0, 255, 0));
		ok3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double entradaTemperatura = Double.parseDouble(textField2.getText());
					JFrame temperatura = new Temperatura(entradaTemperatura);
	                temperatura.setVisible(true);
	                dispose();
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(ok3, "Valor no válido");
				}
			}
		});
		ok3.setBounds(97, 184, 89, 23);
		contentPane.add(ok3);
		
		JButton cancel3 = new JButton("Atrás");
		cancel3.setForeground(new Color(0, 0, 255));
		cancel3.addActionListener(new ActionListener() {
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
		cancel3.setBounds(241, 184, 89, 23);
		contentPane.add(cancel3);
	}

}
