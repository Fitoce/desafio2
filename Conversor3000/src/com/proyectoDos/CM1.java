package com.proyectoDos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class CM1 {

	private JFrame frmConversor;
	private JComboBox cboOrigen;
	private JTextField txtvalor;
	double redondeado , resultado ;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CM1 window = new CM1();
					window.frmConversor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CM1() {
		initialize();
	}
	public double redondear(double money) {
		return Math.round(resultado*100.0)/100.0;
	}	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\fitoc\\eclipse-workspace\\Conversores\\pngwing.com(52).png"));
		frmConversor.setTitle("CONVERSOR 3000");
		frmConversor.setBounds(100, 100, 600, 500);
		frmConversor.setLocationRelativeTo(null);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblMonedaOrigen = new JLabel("moneda origen");
		lblMonedaOrigen.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblMonedaOrigen.setBounds(66, 140, 139, 14);
		frmConversor.getContentPane().add(lblMonedaOrigen);
		
		JLabel lblNewLabel = new JLabel("moneda a convertir");
		lblNewLabel.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel.setBounds(335, 140, 170, 14);
		frmConversor.getContentPane().add(lblNewLabel);
		
		JComboBox cboOrigen = new JComboBox();
		cboOrigen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboOrigen.setModel(new DefaultComboBoxModel(new String[] {"Seleccion", "Peso Chileno (CLP)", "Dolar Estadounidense (USD)", "Euro (EUR)", "Libras Esterlinas (GBP)", "Yen Japones (JPY)", "Won Sul-Coreano (KWR)"}));
		cboOrigen.setBounds(66, 184, 153, 20);
		frmConversor.getContentPane().add(cboOrigen);
		
		JComboBox<?> cboConv = new JComboBox();
		cboConv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cboConv.setModel(new DefaultComboBoxModel(new String[] {"Seleccion", "Peso Chileno (CLP)", "Dolar Estadounidense (USD)", "Euro (EUR)", "Libras Esterlinas (GBP)", "Yen Japones (JPY)", "Won Sul-Coreano (KWR)"}));
		cboConv.setBounds(335, 184, 153, 20);
		frmConversor.getContentPane().add(cboConv);
		
		JLabel lblNewLabel_1 = new JLabel(" Conversor de Moneda");
		lblNewLabel_1.setFont(new Font("a Akhir Tahun", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(99, 11, 366, 45);
		frmConversor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(335, 267, 130, 20);
		frmConversor.getContentPane().add(lblNewLabel_2);
		
		txtvalor = new JTextField();
		txtvalor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtvalor.setBounds(66, 290, 153, 20);
		frmConversor.getContentPane().add(txtvalor);
		txtvalor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ingrese valor aqui");
		lblNewLabel_3.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(66, 269, 189, 17);
		frmConversor.getContentPane().add(lblNewLabel_3);
		
		JButton btnmenu1 = new JButton("Menu Principal");
		btnmenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.main(null);
				frmConversor.dispose();
			}
		});
		btnmenu1.setBounds(66, 381, 153, 23);
		frmConversor.getContentPane().add(btnmenu1);
		
		JButton btnexit = new JButton("Salir del Programa");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setBounds(335, 381, 153, 23);
		frmConversor.getContentPane().add(btnexit);
		
		JButton btnexe = new JButton("Ejecutar Operacion");
		btnexe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String MO = cboOrigen.getSelectedItem().toString();
				String MC = cboConv.getSelectedItem().toString();
				double valor = Double.parseDouble(txtvalor.getText());
				
				if(MO == MC) {
					 resultado = valor;
				}
				if (valor == ' ' ) {
					JOptionPane.showMessageDialog(null,"Ingrese el Valor a Convertir porfavor ");
				}
				
				if(MO != "Peso Chileno (CLP)" && MC != "Peso Chileno (CLP)") {
					JOptionPane.showMessageDialog(null,"Solo se permite convertir moneda nacional a divisas extranjeras y viceversa ");
				}
			
				if (MO == "Peso Chileno (CLP)" && MC == "Dolar Estadounidense (USD)" ) {
					resultado = valor /  804.2;
				}if (MO == "Dolar Estadounidense (USD)" && MC == "Peso Chileno (CLP)") {
					resultado = valor * 804.2;
				}
				if (MO == "Peso Chileno (CLP)" && MC == "Euro (EUR)" ) {
					resultado = valor /  886.2;
				}if (MO == "Euro (EUR)" && MC == "Peso Chileno (CLP)") {
					resultado = valor * 886.2;
				}
				if (MO == "Peso Chileno (CLP)" && MC == "Libras Esterlinas (GBP)" ) {
					resultado = valor /  1036.9;
				}if (MO == "Libras Esterlinas (GBP)" && MC == "Peso Chileno (CLP)") {
					resultado = valor * 1036.9;
				}
				if (MO == "Peso Chileno (CLP)" && MC == "Yen Japones (JPY)" ) {
					resultado = valor /  5.6;
				}if (MO == "Yen Japones (JPY)" && MC == "Peso Chileno (CLP)") {
					resultado = valor * 5.6;
				}
				if (MO == "Peso Chileno (CLP)" && MC == "Won Sul-Coreano (KWR)" ) {
					resultado = valor /  0.62;
				}if (MO == "Won Sul-Coreano (KWR)" && MC == "Peso Chileno (CLP)") {
					resultado = valor * 0.62;
				} 
				redondeado = redondear(resultado);
				txtResultado.setText(redondeado + "");
				
				
				
			}	
				
						
		});
		btnexe.setBounds(212, 329, 125, 23);
		frmConversor.getContentPane().add(btnexe);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtResultado.setColumns(10);
		txtResultado.setBounds(335, 292, 153, 20);
		frmConversor.getContentPane().add(txtResultado);
	}
	
	}
