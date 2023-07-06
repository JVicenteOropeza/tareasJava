package tareasDia22;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PalabraRepetida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosArray metodos = new MetodosArray();
		List<String> laLista = new ArrayList<>();
		Scanner leer = new Scanner(System.in);
		String palabra;
		
		String condicion;
		do {
			System.out.print("Ingresa una palabra: ");
			palabra = leer.next();
			laLista = metodos.IngresarPalabra(laLista, palabra);
			System.out.print("Deseas agregar otra palabra? S/N--->");
			condicion = leer.next();
			condicion = condicion.toUpperCase();
			
		}while(condicion.equals("S"));
		System.out.println("------------------------------------- ");
		System.out.println("Se tiene una lista de :");
		metodos.MostrarLista(laLista);
		
		laLista = metodos.Repetida(laLista);
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		System.out.println("Lista sin repeticiones");
		metodos.MostrarLista(laLista);
		System.out.println(" ");
		System.out.println("------------------------------------- ");
		
		leer.close();
	}

}
