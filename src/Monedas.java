import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Monedas extends JFrame {
	private static double entradaMoneda;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monedas frame = new Monedas(entradaMoneda);
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
	public Monedas(double entradaMoneda) {
		this.entradaMoneda = entradaMoneda;
		setTitle("Monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija la moneda a la que daseas convertir tu dinero");
		lblNewLabel.setBounds(72, 46, 293, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De Peso a Dolar", "De Peso a Euro", "De Peso a Libra", "De Peso a Yen", "De Peso a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libra a Peso", "De Yen a Peso", "De Won Coreano a Peso"}));
		comboBox.setBounds(72, 105, 293, 22);
		contentPane.add(comboBox);
		
		JButton cancel1 = new JButton("Atrás");
		cancel1.setForeground(new Color(0, 0, 255));
		cancel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EntradaMoneda frame = new EntradaMoneda();
					frame.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				dispose();
			}
		});
		cancel1.setBounds(276, 174, 89, 23);
		contentPane.add(cancel1);
		
		JButton ok4 = new JButton("OK");
		ok4.setForeground(new Color(0, 255, 0));
		ok4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox.getSelectedItem();
					
				double resultado;
				String billete;
								
				switch(selectedOption) {
					case "De Peso a Dolar":
						billete = "Dolares";
						resultado = entradaMoneda/198.61;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);						
						break;						
					case "De Peso a Euro":
						billete = "Euros";
						resultado = entradaMoneda/212.17;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;
					case "De Peso a Libra":
						billete = "Libras";
						resultado = entradaMoneda/239.81;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;
					case "De Peso a Yen":
						billete = "Yenes";
						resultado = entradaMoneda/1.47;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;
					case "De Peso a Won Coreano":
						billete = "Won Coreanos";
						resultado = entradaMoneda/0.15;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
					case "De Dolar a Peso":
						billete = "Pesos";
						resultado = entradaMoneda/0.005;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
					case "De Euro a Peso":
						billete = "Pesos";
						resultado = entradaMoneda/0.0047;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
					case "De Libra a Peso":
						billete = "Pesos";
						resultado = entradaMoneda/0.0042;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
					case "De Yen a Peso":
						billete = "Pesos";
						resultado = entradaMoneda/0.68;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
					case  "De Won Coreano a Peso":
						billete = "Pesos";
						resultado = entradaMoneda/6.65;
						JOptionPane.showMessageDialog(ok4, "Tienes $ "+ (double) Math.round(resultado*100d)/100d + " " + billete);
						break;	
				}
				dispose();
				int opcion = JOptionPane.showConfirmDialog(ok4, "¿Desea continuar?");
				if(opcion == JOptionPane.YES_OPTION) {
					try {
						EntradaMoneda frame = new EntradaMoneda();
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
						Monedas frame = new Monedas(entradaMoneda);
						frame.setVisible(true);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				
			}
			
		});
		ok4.setBounds(72, 174, 89, 23);
		contentPane.add(ok4);
		
	}
}
