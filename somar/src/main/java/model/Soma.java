package model;

import model.Resultado;

public class Soma {
	
	private double a = 0.0;
	private double b = 0.0;
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Resultado calcular(){
		return new Resultado(this.a + this.b);
	}
	
}
