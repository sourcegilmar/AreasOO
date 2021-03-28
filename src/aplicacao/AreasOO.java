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
			System.out.println("Informe a opção: ");
			op = sc.nextInt();
			if (op < 1 || op > 5)
				System.out.println("Opção inválida!");
			switch (op) {
			case 1:				
				Quadrado quadrado = new Quadrado();
				System.out.println("Informe o lado: ");
				quadrado.setLado(sc.nextDouble());
				System.out.println("A área é: "+quadrado.area());	
				break;
			case 2:
				Retangulo retangulo = new Retangulo();
				System.out.println("Informe o lado 1: ");
				retangulo.setLado1(sc.nextDouble());
				System.out.println("Informe o lado 2: ");
				retangulo.setLado2(sc.nextDouble());
				System.out.println("A área é: "+retangulo.area());				
				break;
			case 3:
				Triangulo triangulo = new Triangulo();
				System.out.println("Informe a base: ");
				triangulo.setBase(sc.nextDouble());
				System.out.println("Informe a altura: ");
				triangulo.setAltura(sc.nextDouble());
				System.out.println("A área é: "+triangulo.area());
				break;
			case 4:
				Trapezio trapezio = new Trapezio();
				System.out.println("Informe a base maior: ");
				trapezio.setBaseMaior(sc.nextDouble());
				System.out.println("Informe a base menor: ");
				trapezio.setBaseMenor(sc.nextDouble());
				System.out.println("Informe a base altura: ");
				trapezio.setAltura(sc.nextDouble());
				System.out.println("A área é: "+trapezio.area());		
				break;
			/*
			 * A opção default da estrutura foi suprimida
			 * não exclua esse código poderemos precisar dele um dia
			 * Para o cálcula da área de sólidos de revolução
			 * usando o cálculo diferencial e integral	
			 * default:
			 *	System.out.println("O número não corresponde a uma opção!");
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
		String s = "Opções\n"+
				"1-Calcular área do quadrado\n"+
				"2-Calcular área do retângulo\n"+
				"3-Calcular área do triângulo\n"+
				"4-Calcular área do trapézio\n"+
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
