package co.edu.tdea;

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {//NO BORRAR
		
		double a = 0;
		double b = 0;
		double c = 0;
		double potencia = 0;
		double mas = 0;
		double menos = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor a");
		a = sc.nextDouble();
		System.out.println("Ingrese el valor b");
		b = sc.nextDouble();
		System.out.println("Ingrese el valor c");
		c = sc.nextDouble();
		
		potencia = Math.pow(b,2) - 4 * a * c;
		mas = (-b + Math.sqrt(potencia) / 2 * a);
		menos = (-b - Math.sqrt(potencia) / 2 * a);
		
		System.out.println("Resultado con mas: " + mas);
		System.out.println("Resultado con menos: " + menos);
	}

}
