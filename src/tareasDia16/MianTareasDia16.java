package tareasDia16;
import java.util.InputMismatchException;
import practicaDia16.Bisiesto;
import java.util.Scanner;

public class MianTareasDia16 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		int tiempoBisiesto;
		
		Scanner leer = new Scanner(System.in);
		VerificarNumero numV = new VerificarNumero();//clase del paquete tareasDia16
		NumeroEsParImpar numPI = new NumeroEsParImpar();//clase del paquete tareasDia16
		Bisiesto tiempoEsBisiesto = new Bisiesto();//instancia de la clase practicaDia16
		boolean menus=true;
		
		System.out.println("BIENVENIDO PRIMERO SE EVALUARA SI EL NUMERO QUE SE INGRESE ES POSITIVO, NEGATIVO O CERO");
		do {
			try {
				System.out.println("Ingresa el numero a evualuar: ");
				numero = leer.nextDouble();
				numV.PositivoONegativo(numero);
				menus=false;
			}catch(InputMismatchException ex) {
				System.out.println("DEBE DE SER UN NUMERO");
				leer.nextLine();//se pone para limpar "leer" y que no caiga en un ciclo infinito
			}
		}while(menus);
		
		do {
			menus=true;
			try {
				System.out.println("EL SIGUIENTE NUMERO QUE INGRESES SERA EVALUADO PARA VERIFICAR");
				System.out.println("SI ES UN NUMERO PAR O IMPAR, Y SI ES PRIMO EL NUMERO");
				System.out.print("INGRESA UN NUMERO: ");
				numero = leer.nextDouble(); 
				numPI.ParOImpar(numero);
				numPI.Primo(numero);
				menus=false;
			}catch(InputMismatchException ex) {
				System.out.println("DEBE DE SER UN NUMERO");
				leer.nextLine();//se pone para limpar "leer" y que no caiga en un ciclo infinito
			}
		}while(menus);
		
		do {
			menus=true;
			try {
				System.out.println("Ingrese un año para verificar si es o no BISIESTO: ");
				tiempoBisiesto = leer.nextInt();
				tiempoEsBisiesto.TiempoBisiesto(tiempoBisiesto);
				menus=false;
			}catch(InputMismatchException ex) {
				System.out.println("DEBE DE SER UN NUMERO");
				leer.nextLine();//se pone para limpar "leer" y que no caiga en un ciclo infinito
		}
	}while(menus);
		
		leer.close();
	}

}
