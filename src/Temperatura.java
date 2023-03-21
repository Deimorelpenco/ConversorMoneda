import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Temperatura extends JFrame {
	private static double entradaTemperatura;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura(entradaTemperatura);
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
	public Temperatura(double entradaTemperatura) {
		this.entradaTemperatura = entradaTemperatura;
		setTitle("Temperaturas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija la unidad de temperatura a la que quire convertir");
		lblNewLabel.setBounds(62, 45, 312, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Kelvin a Celsius", "De Rankine a Celsius"}));
		comboBox.setBounds(62, 108, 312, 22);
		contentPane.add(comboBox);
		
		JButton cancel2 = new JButton("Atrás");
		cancel2.setForeground(new Color(0, 0, 255));
		cancel2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EntradaTemperatura frame = new EntradaTemperatura();
					frame.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				dispose();
			}
		});
		cancel2.setBounds(285, 178, 89, 23);
		contentPane.add(cancel2);
		
		JButton ok5 = new JButton("OK");
		ok5.setForeground(new Color(0, 255, 0));
		ok5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String selectedOption = (String) comboBox.getSelectedItem();
				
				double resultado;
				String unidad=" °C", unidad2=" °F",unidad3=" °K", unidad4=" R";
				
				switch (selectedOption) {
				case "De Celsius a Fahrenheit":					
					resultado = (entradaTemperatura * 9/5) + 32;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad + " son " + (double) Math.round(resultado*100d)/100d + unidad2);
					break;
				case "De Celsius a Kelvin":					
					resultado = entradaTemperatura + 273.15;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad + " son " + (double) Math.round(resultado*100d)/100d + unidad3);
					break;
				case "De Celsius a Rankine":					
					resultado = (entradaTemperatura * 9/5) + 491.67;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad + " son " + (double) Math.round(resultado*100d)/100d + unidad4);
					break;
				case "De Fahrenheit a Celsius":					
					resultado = (entradaTemperatura * 9/5) + 32;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad2 + " son " + (double) Math.round(resultado*100d)/100d + unidad);
					break;
				case "De Kelvin a Celsius":					
					resultado = entradaTemperatura - 273.15;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad3 + " son " + (double) Math.round(resultado*100d)/100d + unidad);
					break;
				case "De Rankine a Celsius":					
					resultado = (entradaTemperatura - 491.67) * 5/9;
					JOptionPane.showMessageDialog(ok5, (double) Math.round(entradaTemperatura*100d)/100d + unidad4 + " son " + (double) Math.round(resultado*100d)/100d + unidad);
					break;				
				}
				dispose();
				int opcion = JOptionPane.showConfirmDialog(ok5, "¿Desea continuar?");
				
				if(opcion == JOptionPane.YES_OPTION) {
					try {
						EntradaTemperatura frame = new EntradaTemperatura();
						frame.setVisible(true);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}else if (opcion == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
					System.exit(0);
				}else if (opcion == JOptionPane.CANCEL_OPTION) {
					//JOptionPane.showMessageDialog(null, "Programa Finalizado");
					//System.exit(0);
					try {
						Temperatura frame = new Temperatura(entradaTemperatura);
						frame.setVisible(true);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		ok5.setBounds(62, 178, 89, 23);
		contentPane.add(ok5);

	}
}
