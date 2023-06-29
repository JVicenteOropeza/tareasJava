package ejerciciosTareaDia18;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class MainTareasDia18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumerosPedir pedir = new NumerosPedir();
		NumDigitos sumarDigitos = new NumDigitos();
		FactorialNum factorial = new FactorialNum();
		Scanner leer = new Scanner(System.in);
		String numero;
		
		pedir.PedirHasta();
		
		//Se hace la suma de los digitos
		System.out.println("Ingresa un número para culcular la suma de sus digitos: ");
		numero = leer.nextLine();
		sumarDigitos.SumaDigitos(numero);
		
		//Se hace el factorial de ese mismo numero
		try {
			System.out.println("Ingresa un número para calcular el factorial: ");
			numero = leer.nextLine();
			factorial.Factorial(Integer.parseInt(numero));
		}catch(NumberFormatException ex) {
			System.out.println("SOLO SE ADMITEN NUMEROS");
		}
		
		leer.close();
	}

}
