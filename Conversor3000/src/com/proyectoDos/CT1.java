package com.proyectoDos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CT1 {

	private JFrame frmConversor;
	private JTextField txtinTemp;
	double tfinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CT1 window = new CT1();
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
	public CT1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\fitoc\\eclipse-workspace\\Conversores\\pngwing.com(52).png"));
		frmConversor.setTitle("CONVERSOR 3000");
		frmConversor.getContentPane().setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		frmConversor.setBounds(100, 100, 600, 500);
		frmConversor.setLocationRelativeTo(null);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel(" Conversor de Temperatura");
		lblTitulo.setFont(new Font("a Akhir Tahun", Font.PLAIN, 28));
		lblTitulo.setBounds(66, 11, 450, 45);
		frmConversor.getContentPane().add(lblTitulo);
		
		JComboBox cboTemOrigen = new JComboBox();
		cboTemOrigen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTemOrigen.setModel(new DefaultComboBoxModel(new String[] {"Seleccion", "Celsius", "Fahrenheit", "Kelvin"}));
		cboTemOrigen.setBounds(66, 177, 153, 20);
		frmConversor.getContentPane().add(cboTemOrigen);
		
		JComboBox<?> cboTemConvertir = new JComboBox();
		cboTemConvertir.setModel(new DefaultComboBoxModel(new String[] {"Seleccion", "Celsius", "Fahrenheit", "Kelvin"}));
		cboTemConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cboTemConvertir.setBounds(358, 177, 153, 20);
		frmConversor.getContentPane().add(cboTemConvertir);
		
		txtinTemp = new JTextField();
		txtinTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtinTemp.setColumns(10);
		txtinTemp.setBounds(66, 285, 153, 20);
		frmConversor.getContentPane().add(txtinTemp);
		
		JLabel lblOutTemp = new JLabel("");
		lblOutTemp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOutTemp.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblOutTemp.setBounds(358, 285, 153, 20);
		frmConversor.getContentPane().add(lblOutTemp);
		
		JButton btnMenu1 = new JButton("Menu Principal");
		btnMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.main(null);
				frmConversor.dispose();
			}
		});
		btnMenu1.setBounds(66, 383, 153, 23);
		frmConversor.getContentPane().add(btnMenu1);
		
		JButton btnExit = new JButton("Salir del Programa");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(358, 383, 153, 23);
		frmConversor.getContentPane().add(btnExit);
		
		JLabel lblInTemp = new JLabel("ingrese Temperatura aqui");
		lblInTemp.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblInTemp.setBounds(66, 257, 189, 17);
		frmConversor.getContentPane().add(lblInTemp);
		
		JLabel lblOutRes = new JLabel("Resultado");
		lblOutRes.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblOutRes.setBounds(358, 255, 130, 20);
		frmConversor.getContentPane().add(lblOutRes);
		
		JLabel lblTemOrigen = new JLabel("Escala de origen");
		lblTemOrigen.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblTemOrigen.setBounds(66, 144, 139, 14);
		frmConversor.getContentPane().add(lblTemOrigen);
		
		JLabel lblEscalaAConvertir = new JLabel("Escala a convertir");
		lblEscalaAConvertir.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblEscalaAConvertir.setBounds(358, 144, 170, 14);
		frmConversor.getContentPane().add(lblEscalaAConvertir);
		
		JButton btnExe = new JButton("Ejecutar Operacion");
		btnExe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EO = cboTemOrigen.getSelectedItem().toString();
				String EC = cboTemConvertir.getSelectedItem().toString();
				double temperatura = Double.parseDouble(txtinTemp.getText());
				double redondeado ; 
				
								
				if( EO == "Celsius" && EC == "Fahrenheit") {
					tfinal = ((9*temperatura)/5) + 32;
				}
				if( EO == "Fahrenheit" && EC == "Celsius") {
					tfinal = (5* (temperatura-32)) / 9;
				}
				if( EO == "Celsius" && EC == "Kelvin") {
					tfinal = temperatura + 273.15;
				}
				if( EO == "Kelvin" && EC == "Celsius") {
					tfinal = temperatura-273.15;
				}
				if( EO == "Fahrenheit" && EC == "Kelvin") {
					tfinal = ((5*(temperatura-32)) /9)+273.15;
				}
				if( EO == "Kelvin" && EC == "Fahrenheit") {
					tfinal = ((9*(temperatura-273.15))/5)+32;
				}
				if(EO == EC) {
					tfinal = temperatura;
				}
				
				redondeado = redondear(tfinal);
				lblOutTemp.setText(redondeado + "");
				
				
			}
				
		});
		btnExe.setBounds(223, 319, 125, 23);
		frmConversor.getContentPane().add(btnExe);
	}
	public double redondear(double temp) {
		return Math.round(tfinal*100.0)/100.0;
		
	}
}
