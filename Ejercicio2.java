package co.edu.tdea;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		double valorCompra = 0;
		String tarjeta = "";
		String pago = "";
		double descuento = 0;
		double valorfinal = 0;
		double valorDescuento = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de su compra");
		valorCompra = sc.nextDouble();
		System.out.println("Tiene tarjeta super cliente? (si o no)");	
		tarjeta = sc.next();
		System.out.println("Va a pagar en efectivo? (si o no)");
		pago = sc.next();
				
		if(valorCompra >= 300000 && tarjeta.equals("si")) {
			if (pago.equals("si")) {
					descuento = 0.25;
					}else {
						descuento = 0.17;
				}
			}else if (valorCompra >= 300000 && tarjeta.equals("no")) {
				if (pago.equals("si")) {
					descuento = 0.20;
					}else {
						descuento = 0.15;
				}
			}
			else if(valorCompra < 300000 && tarjeta.equals("si")) {
				if (pago.equals("si")) {
					descuento = 0.12;
					}else {
						descuento = 0.03;
				}
				
			}else if(valorCompra < 300000 && tarjeta.equals("no")) {
				if (pago.equals("si")) {
					descuento = 0.07;
					}else {
						descuento = 0.0;
				}
				
			}
		
		valorDescuento = valorCompra * descuento;
		valorfinal = valorCompra - valorDescuento;
		System.out.println("El monto final es: " + valorfinal);
	}

}

