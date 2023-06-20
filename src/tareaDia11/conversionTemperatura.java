package tareaDia11;
//Se hace el importa de la Clase Scanner para leer datos del teclado
import java.util.Scanner;

public class conversionTemperatura {
	
	public static void main(String[ ] args) {
		//Dlacración de variables y constantes
		int opcionUsuario;
		float temperaturaDada;
		float temperaturaConversion;
		Scanner leerDato = new Scanner (System.in);
		
		/*Inicio del programa. Pide al usiario una opción
		y después la temperatura a calcular */
		
		System.out.println("Este programa convierte de Centigrados a Fahrenheit o viceversa");
		System.out.println("Centigrados a Fahrenheit------ 1");
		System.out.println("Fahrenheit Centigrados  ------ 2");
		
		//lectura de datos
		System.out.println("Introduce el numero de tu opción: ");
		opcionUsuario = leerDato.nextInt();
		
		System.out.println("Proporciona la temperatura a convertir: ");
		temperaturaDada = leerDato.nextFloat();
		
		if(opcionUsuario == 1){
			//C a F
			temperaturaConversion = ((temperaturaDada - 32)* 5)/9;
			System.out.println("La temperatura de "+temperaturaDada+" grados Centigrados es a "+temperaturaConversion+" grados Fahrenheit");
			
		}else {
			//F a C
			temperaturaConversion = (temperaturaDada * (9/5))+32;
			System.out.println("La temperatura de "+temperaturaDada+" grados Fahrenheit es a "+temperaturaConversion+" grados Centigrados");
		}
	}
}
