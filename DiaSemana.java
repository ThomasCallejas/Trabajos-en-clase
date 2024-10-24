package co.edu.tdea;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) { //NO BORRAR
		
	short numerodia = 0;
	String dia = "";
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el numero de semana que desea saber");
	numerodia = sc.nextShort();
			
	switch (numerodia) {
	case 1:
		dia = "Lunes";
		break;
	case 2:
		dia = "Martes";
		break;
	case 3:
		dia = "Miercoles";
		break;
	case 4:
		dia = "Jueves";
		break;
	case 5:
		dia = "Viernes";
		break;
	case 6:
		dia = "Sabado";
		break;
	case 7:
		dia = "Domingo";
		break;
	}
	System.out.println(dia);
	}

}
