package com.proyectoDos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CLH {

	private JFrame frmConversor;
	private JTextField txtInR;
	private JTextField txtInA;
	private JTextField txtInV;
	private JTextField txtOut1;
	private JTextField txtOut2;

	double  resultado , resultadoA , resultadoV , resultadoR;
	String tipo , total;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CLH window = new CLH();
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
	public CLH() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConversor = new JFrame();
		frmConversor.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\fitoc\\eclipse-workspace\\Conversores\\pngwing.com(52).png"));
		frmConversor.setTitle("CONVERSOR 3000");
		frmConversor.setLocationRelativeTo(null);
		frmConversor.setBounds(100, 100, 600, 500);
		frmConversor.setLocationRelativeTo(null);
		frmConversor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConversor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" Conversor Ley de OHM");
		lblNewLabel_1.setFont(new Font("a Akhir Tahun", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(96, 11, 384, 45);
		frmConversor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese Resistencia en Ohms Ω ");
		lblNewLabel_3.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(68, 166, 320, 17);
		frmConversor.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ingrese corriente en Amperes (A).");
		lblNewLabel_3_1.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(68, 209, 320, 17);
		frmConversor.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("ingrese Voltaje en Volts (V).");
		lblNewLabel_3_2.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(68, 255, 320, 17);
		frmConversor.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Resultado");
		lblNewLabel_3_3.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(68, 305, 189, 17);
		frmConversor.getContentPane().add(lblNewLabel_3_3);
		
		txtInR = new JTextField();
		txtInR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtInR.setColumns(10);
		txtInR.setBounds(418, 162, 78, 20);
		frmConversor.getContentPane().add(txtInR);
		
		txtInA = new JTextField();
		txtInA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtInA.setColumns(10);
		txtInA.setBounds(418, 205, 78, 20);
		frmConversor.getContentPane().add(txtInA);
		
		txtInV = new JTextField();
		txtInV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtInV.setColumns(10);
		txtInV.setBounds(418, 251, 78, 20);
		frmConversor.getContentPane().add(txtInV);
		
		txtOut1 = new JTextField();
		txtOut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		txtOut1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtOut1.setColumns(10);
		txtOut1.setBounds(377, 301, 78, 20);
		frmConversor.getContentPane().add(txtOut1);
		
		JButton btnmenu1 = new JButton("Menu Principal");
		btnmenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu1.main(null);
				frmConversor.dispose();
			}
		});
		btnmenu1.setBounds(68, 385, 153, 23);
		frmConversor.getContentPane().add(btnmenu1);
		
		JButton btnexit = new JButton("Salir del Programa");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnexit.setBounds(377, 385, 153, 23);
		frmConversor.getContentPane().add(btnexit);
		
		JLabel lblNewLabel = new JLabel("Marca Cero en la casilla del valor que deseas obtener");
		lblNewLabel.setFont(new Font("a Akhir Tahun", Font.PLAIN, 14));
		lblNewLabel.setBounds(68, 99, 462, 30);
		frmConversor.getContentPane().add(lblNewLabel);
		
		txtOut2 = new JTextField();
		txtOut2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtOut2.setColumns(10);
		txtOut2.setBounds(465, 301, 90, 20);
		frmConversor.getContentPane().add(txtOut2);
		
		JButton btnexe = new JButton("Ejecutar Operacion");
		btnexe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double amperes = Double.parseDouble(txtInA.getText());
				double voltaje = Double.parseDouble(txtInV.getText());
				double resistencia = Double.parseDouble(txtInR.getText());
				
				if(amperes != 0 && voltaje != 0 && resistencia != 0) {
					JOptionPane.showMessageDialog(null,"Error debes marcar cero en la casilla que deseas obtener ");
				}
				if(amperes == 0) {					
					resultado = voltaje / resistencia;
					tipo = "  Amperes";
				}
				if(voltaje == 0) {
					resultado = amperes * resistencia;
					tipo = "  Volts";
				}
				if(resistencia == 0) {
					resultado = voltaje / amperes;
					tipo = "  Ω Ohms";				
				}
				
				txtOut1.setText(redondear(resultado)+"");
				txtOut2.setText(tipo+"");
				
								
				}

			
		});
		btnexe.setBounds(231, 333, 157, 23);
		frmConversor.getContentPane().add(btnexe);
	
	
	}
	public double redondear(double unidad) {
		return Math.round(resultado*100.0)/100.0;
		
	}
}
	
	
