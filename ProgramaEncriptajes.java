package co.edu.tdea;

import java.util.Scanner;

public class ProgramaEncriptajes {

    public static void main(String[] args) {
    int opcion = 0;    
    Scanner sc = new Scanner(System.in);
    String[] VB = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] VE = {"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a"};
        
    do {
    System.out.println("MENU \n 1.Encriptar \n 2.Desencriptar \n 3.Salir");
    System.out.println("Ingrese la opción que desea:");
    opcion = sc.nextInt();    
            
    switch(opcion) {
    case 1: 
    	System.out.println("Ingrese el texto que desea encriptar: ");
    	String textoIngresado = sc.next().toLowerCase();
    	String[] vectorLetras = new String[textoIngresado.length()];
    
    for (int i = 0; i < textoIngresado.length(); i++) {
    	vectorLetras[i] = textoIngresado.substring(i, i + 1); 
        }
    String[] vectorCifrado = new String[vectorLetras.length];

    for(int i = 0; i < vectorLetras.length; i++) {
    	int posicion = -1;

    for (int j = 0; j < VB.length; j++) {
    	if (VB[j].equals(vectorLetras[i])) {
    		posicion = j;
    		break;
      }
      }
    if (posicion != -1) {
    	vectorCifrado[i] = VE[posicion];
    } else {
    	vectorCifrado[i] = vectorLetras[i];  
      }
      }

    System.out.print("Texto encriptado: ");
    for (int i = 0; i < vectorCifrado.length; i++) {
        System.out.print(vectorCifrado[i]);
    }
    System.out.println();
    break;
    
    case 2:
    	System.out.println("Ingrese el texto que desea desencriptar: ");
        textoIngresado = sc.next().toLowerCase();
        String[] vectorLetrasDesencriptar = new String[textoIngresado.length()];
        
    for (int i = 0; i < textoIngresado.length(); i++) {
                        vectorLetrasDesencriptar[i] = textoIngresado.substring(i, i + 1);
      }
      String[] vectorDesencriptado = new String[vectorLetrasDesencriptar.length];
                    
      for(int i = 0; i < vectorLetrasDesencriptar.length; i++) {
    	  int posicion = -1;

      for (int j = 0; j < VE.length; j++) {
    	  if (VE[j].equals(vectorLetrasDesencriptar[i])) {
    		  posicion = j;
              break;
       }
       }                       
      if (posicion != -1) {
    	  vectorDesencriptado[i] = VB[posicion];
    	  } else {
    		  vectorDesencriptado[i] = vectorLetrasDesencriptar[i];
       }
       }

    System.out.print("Texto desencriptado: ");
    for (int i = 0; i < vectorDesencriptado.length; i++) {
    	System.out.print(vectorDesencriptado[i]);
       }
    System.out.println();
    break;
               
    case 3:
    	System.out.println("El programa ha finalizado");
    	break;
        }
        } while(opcion != 3);
    }
}

