package co.edu.tdea;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {//NO BORRAR
		
		short edad = 0;
		double valorCompra = 0;
		double descuento = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su valor de compra");
		valorCompra = sc.nextDouble();
		System.out.println("Ingrese su edad");
		edad = sc.nextShort();
		
		if (valorCompra >= 20000 && edad >=18 && edad <=30) {
			descuento = 0.2;
			}else if (valorCompra >= 20000 && edad >=30) {
				descuento = 0.3;	
			}else if (valorCompra >= 20000 && edad <18) {
				descuento = 0.25;
			}else {
				System.out.println("No cumple con las condiciones para el descuento");
			}
		
		
		System.out.println("Su descuento es de: " + descuento *100 + "%");
		System.out.println(valorCompra * descuento);
	}	
	

}
