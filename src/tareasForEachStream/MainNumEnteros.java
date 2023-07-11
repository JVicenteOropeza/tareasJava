package tareasForEachStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;

public class MainNumEnteros {
	 private static List<Integer> listaEnteros = Arrays.asList(1,6,3,8,23,12,56,34,31,97,5,7);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dada una lista de números enteros, utiliza el bucle foreach y los 
		//streams para filtrar y mostrar solo los números pares.
		List<Integer> pares = listaEnteros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
		for(Integer numero:pares) {
			System.out.println("Numero Par: "+numero);
		}
		

	}

}
