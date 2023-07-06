package tareasDia22;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NumeroAscendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosArray metodos = new MetodosArray();
		List<Integer> laLista = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		int numero;
		int condicion=1;
		
		do {
			System.out.print("Ingresa el numero "+condicion+" :");
			numero = leer.nextInt();
			laLista = metodos.IngresarNumero(laLista, numero);
			condicion++;
		}while(condicion > 0 && condicion <=5);
		
		System.out.println("------------------------------------- ");
		System.out.println("Se tiene una lista de :");
		metodos.MostrarListaEnteros(laLista);
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		System.out.println("Se tiene una lista ordenada Ascendente :");
		laLista = metodos.OrdenarAscendente(laLista);
		metodos.MostrarListaEnteros(laLista);
		
		leer.close();
	}

}
