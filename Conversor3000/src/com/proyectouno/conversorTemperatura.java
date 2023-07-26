package com.proyectouno.copy;

import java.io.PrintStream;

import javax.swing.JOptionPane;

public class conversorTemperatura  {
	
	private static PrintStream resu;
		
	static double temperatura;
	String escalaOrigen;
	String escalaConvertir;
	public static PrintStream getResu() {
		return resu;
	}

	public static void setResu(PrintStream resu) {
		conversorTemperatura.resu = resu;
	}
	
static void temperatura() {
		
			Double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa temperatura a convertir","Aqui"));
			
			String escalaOrigen = (String) (JOptionPane.showInputDialog(null,"Seleciona escala temperatura origen", "Conversor 3000" ,
					JOptionPane.PLAIN_MESSAGE, null , new Object[] { "Selecciona" , "Celsius" , "Fahrenheit","Kelvin" } ,"Selecciona"  ));
			
			String escalaConvertir = (String) (JOptionPane.showInputDialog(null,"Seleciona escala temperatura a convertir", "Conversor 3000" ,
					JOptionPane.PLAIN_MESSAGE, null , new Object[] { "Selecciona" , "Celsius" , "Fahrenheit","Kelvin" } ,"Selecciona"  ));
			
						
			operacionesTemperatura convierte = new operacionesTemperatura();
			
			convierte.setTemperatura(temperatura);
			convierte.setEscalaOrigen(escalaOrigen);
			convierte.setEscalaConvertir(escalaConvertir);
						
			
			double resultadoFinal = convierte.sacar();
			JOptionPane.showMessageDialog(null,"El valor de la conversion es: " + resultadoFinal);			

			
			
			
}






		

		
}	