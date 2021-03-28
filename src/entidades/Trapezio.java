package entidades;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura; 
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		return ((this.baseMaior + this.baseMaior)* this.altura) / 2;
	}
}
