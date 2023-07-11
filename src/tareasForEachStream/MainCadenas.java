package tareasForEachStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainCadenas {
	private static List<String> cadenas = Arrays.asList("Fenix","ocHo","PanTalla","clasicos","FUERA");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mayusculas = cadenas.stream().map(String::toUpperCase).collect(Collectors.toList());
		for(String cadena:mayusculas) {
			System.out.println("Palabra en mayusculas: "+cadena);
		}
	}

}
