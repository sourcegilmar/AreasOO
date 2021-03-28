package entidades;

public class Quadrado {
	double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double area() {
		return Math.pow(lado, 2);
	}
}
