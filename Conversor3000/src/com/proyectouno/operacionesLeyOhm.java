package com.proyectouno.copy;

import javax.swing.JOptionPane;

public class operacionesLeyOhm {
	
		double amperes , voltaje , resistencia , resultado , resultadoA , resultadoV , resultadoR;
		String tipo;
		
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getResultado() {
			return resultado;
		}

		public void setResultado(double resultado) {
			this.resultado = resultado;
		}

		public double getAmperes() {
			return amperes;
		}

		public void setAmperes(double amperes) {
			this.amperes = amperes;
		}

		public double getVoltaje() {
			return voltaje;
		}

		public void setVoltaje(double voltaje) {
			this.voltaje = voltaje;
		}

		public double getResistencia() {
			return resistencia;
		}

		public void setResistencia(double resistencia) {
			this.resistencia = resistencia;
		}

		public double getResultadoA() {
			return resultadoA;
		}

		public void setResultadoA(double resultadoA) {
			this.resultadoA = resultadoA;
		}

		public double getResultadoV() {
			return resultadoV;
		}

		public void setResultadoV(double resultadoV) {
			this.resultadoV = resultadoV;
		}

		public double getResultadoR() {
			return resultadoR;
		}

		public void setResultadoR(double resultadoR) {
			this.resultadoR = resultadoR;
		}
		
		public operacionesLeyOhm() {
			super();
		}
		public double redondear(double unidad) {
			return Math.round(resultado*100.0)/100.0;
			
		}
		
		public double ohms() {
			if(amperes != 0 && voltaje != 0 && resistencia != 0) {
				JOptionPane.showMessageDialog(null,"error debes marcar cero en la casilla que deseas obtener ");
			}
			
			if(amperes == 0) {
				resultadoA = 1;
				resultado = voltaje / resistencia;
			}
			if(voltaje == 0) {
				resultadoV = 1;
				resultado = amperes * resistencia;
			}
			if(resistencia == 0) {
				resultadoR = 1;
				resultado = voltaje / amperes;				
			}
			if(resultadoA == 1) {
				tipo = "  Amperes";
			}
			if(resultadoV == 1) {
				tipo = "  Volts";
			}
			if(resultadoR == 1) {
				tipo = "  Ω Ohms";
			}
		return redondear(resultado);
			
			
		

		}
		
		
	}		
