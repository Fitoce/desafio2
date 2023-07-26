package com.proyectouno.copy;



import javax.swing.JOptionPane;

	public class conversorLeyOhm {
	
		
	
		double amperes , voltaje , resistencia, resultado , resultadofinal;
	
		static void lohm() {
		
		JOptionPane.showMessageDialog(null,"Bienvenido al calculo de la Ley de Ohm, Debes ingresar los valores segun su tipo si no tienes valor ingresa 0");
		
		double amperes = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la corriente en Amperes (I)"));		
		double voltaje = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor del voltaje en Volts (V)"));
		double resistencia = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de la resistencia en Ohms (Ω)"));
				
		
		operacionesLeyOhm obtiene = new operacionesLeyOhm();
		
		obtiene.setAmperes(amperes);
		obtiene.setVoltaje(voltaje);
		obtiene.setResistencia(resistencia);
		obtiene.getTipo();
		
		
		double valor = obtiene.ohms();
		String tipo = obtiene.tipo;
		JOptionPane.showMessageDialog(null,"El valor es de "+ valor + tipo);
		
	}
	

}
