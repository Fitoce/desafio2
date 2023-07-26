package com.proyectouno.copy;

public class operacionesTemperatura {
	
	private double temperatura, tfinal ;
	private String escalaOrigen , escalaConvertir;
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getEscalaOrigen() {
		return escalaOrigen;
	}
	public void setEscalaOrigen(String escalaOrigen) {
		this.escalaOrigen = escalaOrigen;
	}
	public String getEscalaConvertir() {
		return escalaConvertir;
	}
	public void setEscalaConvertir(String escalaConvertir) {
		this.escalaConvertir = escalaConvertir;
	}
	public double getTfinal() {
		return tfinal;
	}
	public void setTfinal(double tfinal) {
		this.tfinal = tfinal;
	}
	
public operacionesTemperatura() {
	super();
		
	}
public double redondear(double tempe) {
	return Math.round(tfinal*100.0)/100.0;
	
}
	public double sacar() {
		
		if( escalaOrigen == "Celsius" && escalaConvertir == "Fahrenheit") {
			tfinal = ((9*temperatura)/5) + 32;
		}
		if( escalaOrigen == "Fahrenheit" && escalaConvertir == "Celsius") {
			tfinal = (5* (temperatura-32)) / 9;
		}
		if( escalaOrigen == "Celsius" && escalaConvertir == "Kelvin") {
			tfinal = temperatura + 273.15;
		}
		if( escalaOrigen == "Kelvin" && escalaConvertir == "Celsius") {
			tfinal = temperatura-273.15;
		}
		if( escalaOrigen == "Fahrenheit" && escalaConvertir == "Kelvin") {
			tfinal = ((5*(temperatura-32)) /9)+273.15;
		}
		if( escalaOrigen == "Kelvin" && escalaConvertir == "Fahrenheit") {
			tfinal = ((9*(temperatura-273.15))/5)+32;
		}
		if(escalaOrigen == escalaConvertir) {
			return temperatura;
		}
		
		
		
		return redondear(tfinal);
	
}

	
}