package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Quadrado;
import entidades.Retangulo;
import entidades.Trapezio;
import entidades.Triangulo;

public class AreasOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int op = 1;
		do {
			String s = menu();
			System.out.println(s);
			System.out.println("Informe a op��o: ");
			op = sc.nextInt();
			if (op < 1 || op > 5)
				System.out.println("Op��o inv�lida!");
			switch (op) {
			case 1:				
				Quadrado quadrado = new Quadrado();
				System.out.println("Informe o lado: ");
				quadrado.setLado(sc.nextDouble());
				System.out.println("A �rea �: "+quadrado.area());	
				break;
			case 2:
				Retangulo retangulo = new Retangulo();
				System.out.println("Informe o lado 1: ");
				retangulo.setLado1(sc.nextDouble());
				System.out.println("Informe o lado 2: ");
				retangulo.setLado2(sc.nextDouble());
				System.out.println("A �rea �: "+retangulo.area());				
				break;
			case 3:
				Triangulo triangulo = new Triangulo();
				System.out.println("Informe a base: ");
				triangulo.setBase(sc.nextDouble());
				System.out.println("Informe a altura: ");
				triangulo.setAltura(sc.nextDouble());
				System.out.println("A �rea �: "+triangulo.area());
				break;
			case 4:
				Trapezio trapezio = new Trapezio();
				System.out.println("Informe a base maior: ");
				trapezio.setBaseMaior(sc.nextDouble());
				System.out.println("Informe a base menor: ");
				trapezio.setBaseMenor(sc.nextDouble());
				System.out.println("Informe a base altura: ");
				trapezio.setAltura(sc.nextDouble());
				System.out.println("A �rea �: "+trapezio.area());		
				break;
			/*
			 * A op��o default da estrutura foi suprimida
			 * n�o exclua esse c�digo poderemos precisar dele um dia
			 * Para o c�lcula da �rea de s�lidos de revolu��o
			 * usando o c�lculo diferencial e integral	
			 * default:
			 *	System.out.println("O n�mero n�o corresponde a uma op��o!");
			 */
			}
		} while (op != 5);
		mensagemEncerramento();

	}

	public static void mensagemEncerramento() {
		System.out.println("-----------------------");
		System.out.println("* PROGRAMA FINALIZADO *");
		System.out.println("-----------------------");
	}

	public static String menu() {
		String s = "Op��es\n"+
				"1-Calcular �rea do quadrado\n"+
				"2-Calcular �rea do ret�ngulo\n"+
				"3-Calcular �rea do tri�ngulo\n"+
				"4-Calcular �rea do trap�zio\n"+
				"5-Sair\n";
		return s;
	}
	
	/*
	 * Eclipse Standard/SDK
	 * Version: Luna Release (4.4.0)
	 * Build id: 20140612-0600
	 * (c) Copyright Eclipse contributors and others 2000, 2014. 
	 * Java SE 1.8
	 */

}
