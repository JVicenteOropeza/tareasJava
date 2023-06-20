package tareaDia11;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaración de variables
		double base;
		double altura;
		double areaCirculo;
		Scanner leerDato = new Scanner(System.in);
		
		//Se piden los datos
		System.out.println("Dando la longitud de la base y de la altura se calculara el área del trángulo");
		System.out.println();
		
		System.out.println("Instruce la longitud de la BASE: ");
		base = leerDato.nextDouble();
		System.out.println();
		
		System.out.println("Instruce la longitud de la ALTURA: ");
		altura = leerDato.nextDouble();
		System.out.println();
		
		//Se hace el calculo
		areaCirculo = (base * altura)/2;
		
		//Salida
		System.out.println("El área del trángulo de BASE iagual a :  "+base+" y de ALTURA igual a: "+altura+" es: ");
		System.out.println(areaCirculo);
	}

}
