package tareasDia23;

import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class NumerosPromedio {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(40);
		listaNumeros.add(34);
		listaNumeros.add(78);
		listaNumeros.add(23);
		listaNumeros.add(18);
		listaNumeros.add(43);
		listaNumeros.add(38);
		
		promediando(listaNumeros);
	}
	
	public static void promediando(List<Integer> lista) {
		
		//Ex
				Function<List<Integer>, Double> promedio = (numeros) -> {
					Double resultado = 0.0;
					for(int i = 0; i < numeros.size(); i++) {
						resultado = resultado + numeros.get(i);
					}
					return resultado = resultado/numeros.size();
				};
		
		Double prom = promedio.apply(lista);
		
		System.out.println("El promedio es: "+prom);
	}
}