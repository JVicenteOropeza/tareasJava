package tareasDia22;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MetodosArray {

	public List<String> IngresarPalabra(List<String> lista, String palabra) {
		lista.add(palabra);
		return lista;
	}
	
	public List<Integer> IngresarNumero(List<Integer> lista, int numero) {
		lista.add(numero);
		return lista;
	}
	
	public List<String> Repetida(List<String> lista){
		List<String> listaTemp= new ArrayList<>();
		for(String palabra : lista) {
			if(!listaTemp.contains(palabra)) {
				listaTemp.add(palabra);
			}
		}
		return listaTemp;
	}
	
	public List<Integer> OrdenarAscendente(List<Integer> lista){
		Collections.sort(lista);
		return lista;
	}
	
	public void MostrarLista(List<String> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+"|");
		}	
	}
	
	public void MostrarListaEnteros(List<Integer> lista) {
		for(int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+"|");
		}	
	}
}
