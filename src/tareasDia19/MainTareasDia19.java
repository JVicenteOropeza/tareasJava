package tareasDia19;

import java.util.Scanner;

public class MainTareasDia19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int dia;
		String nombreDia;
		ConvertirNumeroSemana diaSem = new ConvertirNumeroSemana();
		CalculadoraSwitch calcu = new CalculadoraSwitch();
		MenuComida comida = new MenuComida();
		
		System.out.println("----------->Tareas Switch<-----------");
		//TAREA 1
		do {
			System.out.print("Ingresa un número del 1 al 7: ");
			dia = leer.nextInt();
			nombreDia = diaSem.NumeroDia(dia);
			System.out.println("El dia que correponde al numero "+dia+" es: "+nombreDia);
			System.out.println();
		}while(dia > 0 && dia <= 7);
		//FIN TAREA 1
		
		//TAREA 2
		System.out.println("----------> Cualquier Número <----------");
		System.out.println("Se presenta el menú para los tipos de números");
		calcu.MenuCalSwitch();
		//FIN TAREA 2
		
		//TAREA 3
		System.out.println("----------> Menú Comidas<----------");
		comida.MenuC();
		leer.close();
	}

}
