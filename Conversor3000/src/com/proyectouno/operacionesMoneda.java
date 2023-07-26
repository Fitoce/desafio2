package com.proyectouno.copy;

import javax.swing.JOptionPane;

public class operacionesMoneda {
	
	private double ingreso2 , resultado;
	private String monedaOrigen2 , monedaConvertir2;
	
public double getIngreso2() {
		return ingreso2;
	}

	public void setIngreso2(double ingreso2) {
		this.ingreso2 = ingreso2;
	}

	public double getresultado() {
		return resultado;
	}

	public void setresultado(double resultado) {
		this.resultado = resultado;
	}

	public String getMonedaOrigen2() {
		return monedaOrigen2;
	}

	public void setMonedaOrigen2(String monedaOrigen2) {
		this.monedaOrigen2 = monedaOrigen2;
	}

	public String getMonedaConvertir2() {
		return monedaConvertir2;
	}

	public void setMonedaConvertir2(String monedaConvertir2) {
		this.monedaConvertir2 = monedaConvertir2;
	}

	
	public operacionesMoneda() {

		super();
	}
	public double redondear(double money) {
		return Math.round(resultado*100.0)/100.0;
		
	}
	
	public double conver() {
		
		if(monedaOrigen2 == monedaConvertir2) {
			return ingreso2;
		}
		if(monedaOrigen2 != "Peso Chileno (CLP)" && monedaConvertir2 != "Peso Chileno (CLP)") {
			JOptionPane.showMessageDialog(null,"Solo se permite convertir moneda nacional a divisas extranjeras y viceversa ");
		}
	
		if (monedaOrigen2 == "Peso Chileno (CLP)" && monedaConvertir2 == "Dolar estadounidense (USD)" ) {
			resultado = ingreso2 /  804.2;
		}if (monedaOrigen2 == "Dolar estadounidense (USD)" && monedaConvertir2 == "Peso Chileno (CLP)") {
			resultado = ingreso2 * 804.2;
		}
		if (monedaOrigen2 == "Peso Chileno (CLP)" && monedaConvertir2 == "Euro (EUR)" ) {
			resultado = ingreso2 /  886.2;
		}if (monedaOrigen2 == "Euro (EUR)" && monedaConvertir2 == "Peso Chileno (CLP)") {
			resultado = ingreso2 * 886.2;
		}
		if (monedaOrigen2 == "Peso Chileno (CLP)" && monedaConvertir2 == "Libras Esterlinas(GBP)" ) {
			resultado = ingreso2 /  1036.9;
		}if (monedaOrigen2 == "Libras Esterlinas(GBP)" && monedaConvertir2 == "Peso Chileno (CLP)") {
			resultado = ingreso2 * 1036.9;
		}
		if (monedaOrigen2 == "Peso Chileno (CLP)" && monedaConvertir2 == "Yen Japones (JPY)" ) {
			resultado = ingreso2 /  5.6;
		}if (monedaOrigen2 == "Yen Japones (JPY)" && monedaConvertir2 == "Peso Chileno (CLP)") {
			resultado = ingreso2 * 5.6;
		}
		if (monedaOrigen2 == "Peso Chileno (CLP)" && monedaConvertir2 == "Won sul-coreano(KRW)" ) {
			resultado = ingreso2 /  0.62;
		}if (monedaOrigen2 == "Won sul-coreano(KRW)" && monedaConvertir2 == "Peso Chileno (CLP)") {
			resultado = ingreso2 * 0.62;
		}
		
		
		return redondear(resultado);		
	}


		
	
		
	}
