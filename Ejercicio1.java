package co.edu.tdea;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {//NO BORRAR
		// TODO Auto-generated method stub
		
		double celsius = 0;
		double farenheit = 0;
		double kelvin= 0;
		double rankine = 0;	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese sus celsius:");
		celsius = sc.nextDouble();
		
		farenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;
		rankine = (celsius + 273.15) * 1.8;
		
		System.out.println("Farenheit es igual: "+ farenheit);
		System.out.println("Kelvin es igual: " + kelvin);
		System.out.println("Rankine es igual: " + rankine);
				
			
	}

}
