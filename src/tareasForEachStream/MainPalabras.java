package tareasForEachStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//Dada una lista de palabras, utiliza el bucle foreach y los 
//streams para contar y mostrar la cantidad de palabras que tienen más de cuatro caracteres.
public class MainPalabras {
	private static List<String> palabras = Arrays.asList("mesa","silla","automovil","cuchara","plato","cama","oso","numero");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> palabrasMas = palabras.stream().filter(palabra -> palabra.length() > 4).collect(Collectors.toList());
		for(String palabra:palabrasMas) {
			System.out.println("Palabra de más de 4 letras: "+palabra);
		}
	}

}
