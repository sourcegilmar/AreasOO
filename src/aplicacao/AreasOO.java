package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class AreasOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int op = 1;
		do {
			String s = "Op��es\n"+"1-Calcular �rea do quadrado\n"+"2-Calcular �rea do ret�ngulo\n"+
					"3-Calcular �rea do tri�ngulo\n"+"4-Calcular �rea do trap�zio\n"+"5-Sair\n";
			System.out.println(s);
			System.out.println("Informe a op��o: ");
			op = sc.nextInt();
			if (op < 1 || op > 5)
				System.out.println("Op��o inv�lida!");
			switch (op) {
			case 1:				
				double aq = 0;
				System.out.println("Informe o lado: ");
				double x = sc.nextDouble();
				aq = Math.pow(x, 2);
				System.out.println("---------------------------");
				System.out.println("A �rea do quadrado �: "+String.format("%.2f", aq));
				System.out.println("---------------------------");
				break;
			case 2:
				double ar = 0;
				System.out.println("Informe os dois lados do ret�ngulo: ");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				ar = a * b;
				System.out.println("---------------------------");
				System.out.println("A �rea do ret�ngulo �: "+String.format("%.2f", ar));
				System.out.println("---------------------------");				
				break;
			case 3:
				double at=0;
				System.out.println("Informe a base e a altura do tri�ngulo");
				double y = sc.nextDouble();
				double z = sc.nextDouble();
				at = y * z;
				System.out.println("---------------------------");
				System.out.println("A �rea do ret�ngulo �: "+String.format("%.2f", at));
				System.out.println("---------------------------");
				break;
			case 4:
				double at2=0;
				System.out.println("Informe as medidas do trap�zio: ");
				double m1 = sc.nextDouble();
				double m2 = sc.nextDouble();
				double m3 = sc.nextDouble();
				at2 = ((m1 + m2)*m3)/2;
				System.out.println("---------------------------");
				System.out.println("A �rea do ret�ngulo �: "+String.format("%.2f", at2));
				System.out.println("---------------------------");
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
		System.out.println("-----------------------");
		System.out.println("* PROGRAMA FINALIZADO *");
		System.out.println("-----------------------");

	}
	
	/*
	 * Eclipse Standard/SDK
	 * Version: Luna Release (4.4.0)
	 * Build id: 20140612-0600
	 * (c) Copyright Eclipse contributors and others 2000, 2014. 
	 * Java SE 1.8
	 */

}
