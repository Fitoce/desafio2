package com.proyectouno.copy;

import javax.swing.JOptionPane;

public class menu1 {
	String menu1;
	int cierre;
	
	void ciclo () {
		do {
		menu1 = (String) (JOptionPane.showInputDialog(null,"Seleciona que tipo de Conversion deseas", "Conversor 3000" ,
				JOptionPane.PLAIN_MESSAGE, null , new Object[] {"Selecciona", "Conversor de Moneda" , "Conversor de Temperatura" ,
						"Conversor Ley de Ohms Ω "} , "Selecciona"));
		if (menu1 == "Conversor de Moneda" ) {
			conversorMoneda.moneda();
		}
		if (menu1 == "Conversor de Temperatura" ){
			conversorTemperatura.temperatura ();
		}
		if (menu1 == "Conversor Ley de Ohms Ω " ){
			conversorLeyOhm.lohm();
		}
			
		
		cierre =Integer.parseInt(JOptionPane.showInputDialog("Quieres continuar el programa? -1. SI -2. NO " ));
		}while (cierre == 1);
		JOptionPane.showMessageDialog(null,"programa Finalizado");
		
		}		
		
	
		public static void main (String[]args) {
			menu1 M = new menu1();
			M.ciclo();
		}
		
}

