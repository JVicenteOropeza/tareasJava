package tareasDia23;

import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;

public class PersonaGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> listaPersonas = new ArrayList<>();
		
		Persona persona1 = new Persona("JuanV", "42");
		Persona persona2 = new Persona("Antonio", "23");
		Persona persona3 = new Persona("Fernanda", "50");
		Persona persona4 = new Persona("Monica", "34");
		Persona persona5 = new Persona("Alberto", "24");
		Persona persona6 = new Persona("Fabiola", "30");
		Persona persona7 = new Persona("Iris", "40");
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		listaPersonas.add(persona6);
		listaPersonas.add(persona7);
	
		int contador = 1;
		System.out.println("--------------------------------");
		System.out.println("Lista de personas Concentrado");
		System.out.println("--------------------------------");
		for(Persona persona: listaPersonas) {
			System.out.println("Persona "+contador+": "+persona.getNombre()+" -->"+persona.getEdad());
			contador++;
		}
		
		//Exp-Lambda 
		Function<List<Persona>, List<Persona>> mayor30 = (personas) -> {
			List<Persona> resultado = new ArrayList<>();
			for(Persona persona : personas) {
				if(Integer.parseInt(persona.getEdad()) > 30) {
					resultado.add(persona);
				}
			}
			return resultado;
		}; //Termina Exp-Lambda
		System.out.println("--------------------------------");
		List<Persona> listaMayores30 = mayor30.apply(listaPersonas);
		System.out.println("Lista de perosnas Mayores de 30 (>30)");
		System.out.println("--------------------------------");
		contador=1;
		for(Persona persona : listaMayores30) {
			System.out.println("Persona "+contador+": "+persona.getNombre()+" -->"+persona.getEdad());
			contador++;
		}
		
	}

}
