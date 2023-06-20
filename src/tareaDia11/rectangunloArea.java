package tareaDia11;

import java.util.Scanner;

public class rectangunloArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		double ladoA;
		double ladoB;
		double areaRectangulo;
		Scanner leerLado = new Scanner(System.in); 
		
		//Se piden los datos
		System.out.println("Dando las longitudes de los lados de un rectángulo se calculara el área del mismo");
		System.out.println();
		
		System.out.println("Instruce la longitud del LADO 1: ");
		ladoA = leerLado.nextDouble();
		System.out.println();
		
		System.out.println("Bienvenido, instruce la longitud del LADO 2: ");
		ladoB = leerLado.nextDouble();
		System.out.println();
		
		//Se hace el calculo
		areaRectangulo = ladoA * ladoB;
		
		//Salida
		System.out.println("El área del rectangulo de lado 1 iagual a :  "+ladoA+" y de lado 2 igual a: "+ladoB+" es: ");
		System.out.println(areaRectangulo);
		
	}

}
