package tareaDia11;

import java.util.Scanner;

public class datosSaludo {

	public void SaludarFinal(String a, float b) {
		System.out.println("Hola "+a+ " es un gusto saludarte");
		System.out.println();
		System.out.println("Tu edad es de: "+b);
		System.out.println();
		System.out.println("Por favor ya no digas mentiras. Aceptala !!!");
		System.out.println();
		System.out.println("Hasta luego!!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad; 
		Scanner leer = new Scanner(System.in);
		datosSaludo saludo = new datosSaludo();
		
		System.out.println("Hola! Escribe tu nombre: ");
		nombre = leer.nextLine();
		System.out.println("Ahora introduce tu edad: ");
		edad = leer.nextInt();
		
		saludo.SaludarFinal(nombre, edad);

	}

}
