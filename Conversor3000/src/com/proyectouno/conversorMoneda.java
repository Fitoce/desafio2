package com.proyectouno.copy;

import java.io.PrintStream;

import javax.swing.JOptionPane;

public class conversorMoneda  {
	private static PrintStream resultado;
	double ingreso;
	String monedaOrigen;
	String monedaConvertir,monedaConvertir2;
	
	
static void moneda() {
		
			Double ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cifra que desea convertir","Aqui"));
			
			String monedaOrigen = (String) (JOptionPane.showInputDialog(null,"Seleciona tipo de moneda de origen", "Conversor 3000" ,
					JOptionPane.PLAIN_MESSAGE, null , new Object[] { "Selecciona" , "Peso Chileno (CLP)" , "Dolar estadounidense (USD)" ,
							"Euro (EUR)" , "Libras Esterlinas(GBP)" , "Yen Japones (JPY)" , "Won sul-coreano(KRW)"} ,"Selecciona"  ));
			
			String monedaConvertir = (String) (JOptionPane.showInputDialog(null,"Seleciona tipo de moneda a convertir", "Conversor 3000" ,
						JOptionPane.PLAIN_MESSAGE, null , new Object[] { "Selecciona" , "Peso Chileno (CLP)" , "Dolar estadounidense (USD)" ,
								"Euro (EUR)" , "Libras Esterlinas(GBP)" , "Yen Japones (JPY)" , "Won sul-coreano(KRW)"} ,"Selecciona"  ));
			
				
						
			operacionesMoneda convierte = new operacionesMoneda();
			
			convierte.setIngreso2(ingreso);
			convierte.setMonedaOrigen2(monedaOrigen);
			convierte.setMonedaConvertir2(monedaConvertir);		

			
			double resultadoFinal = convierte.conver();
			JOptionPane.showMessageDialog(null,"El valor es: " + resultadoFinal);			

						
			
}					



public static PrintStream getResultado() {
	return resultado;
}


public static void setResultado(PrintStream resultado) {
	conversorMoneda.resultado = resultado;
}
		

		
}	