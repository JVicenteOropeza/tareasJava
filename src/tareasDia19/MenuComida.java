package tareasDia19;

import java.util.Scanner;

public class MenuComida {
	private Scanner leer = new Scanner(System.in);
	
	public void MenuC() {
		int opcion;
		do {
		System.out.println("COMIDA-RICA ---------->1");
		System.out.println("COMIDA-PESADA -------->2");
		System.out.println("COMIDA-VITAMINA-T ---->3");
		System.out.println("COMIDA-ITALIANA ------>4");
		System.out.println("COMIDA-TRANQUILA ----->5");
		System.out.println("SALIR ---------------->6");	
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				System.out.println("COMIDA 1: Pozole, Orden tostadas, Orden Chicharron, Agua del sabor o refresco 600ml");
				break;
			}
			case 2:{
				System.out.println("COMIDA 2: Albondigas, Orden bolillo, Agua del sabor o refresco 600ml");
				break;
			}
			case 3:{
				System.out.println("COMIDA 3: Chilaquiles, Orden bolillo, Agua del sabor o refresco 600ml");
				break;
			}
			case 4:{
				System.out.println("COMIDA 4: Spaguetti con albondigas(100% carne), Agua del sabor o refresco 600ml");
				break;
			}
			case 5:{
				System.out.println("COMIDA 5: Cortadillo, Tortillas, Agua del sabor o refresco 600ml");
				break;
			}
			case 6:{
				System.out.println("SALISTE COMIDAS");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
		}while(opcion > 0 && opcion < 6);
	}
}
