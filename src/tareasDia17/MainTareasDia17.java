package tareasDia17;

import java.util.Scanner;

public class MainTareasDia17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		TablaMultiplicar multiplica = new TablaMultiplicar();
		NumerosPares pares = new NumerosPares();
		NumerosNaturales sumaN = new NumerosNaturales();
		int numero;
		
		System.out.print("INGRESA EL NUMERO PARA DESARROLLAR LA TABLA: ");
		numero = (int) leer.nextDouble();
		multiplica.Multiplica(numero);
		
		System.out.print("INGRESA CUANTOS NUMEROS PARES QUIERES HALLAR: ");
		numero = leer.nextInt();
		pares.ImprimirNumPares(numero);
		
		System.out.print("INGRESA CUANTOS PRIMEROS NUMEROS NATURALES QUIERES SUMAR ");
		numero = leer.nextInt();
		sumaN.SumaPrimerosNNaturales(numero);//Utilizando estructura FOR
		System.out.print("");
		sumaN.FormulaSumaNNaturales(numero); //Utilizando la formula de Gauss
		leer.close();
		
	}

}
