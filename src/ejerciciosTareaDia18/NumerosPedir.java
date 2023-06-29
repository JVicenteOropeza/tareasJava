package ejerciciosTareaDia18;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumerosPedir {
	private Scanner leer = new Scanner(System.in);
	
	public void PedirHasta() {
		int i = 1;
		int num;
		try {
			System.out.println("Se podrá ingresar numero siempre y cuando no sean negativos o myores a 5");
			do {
				System.out.println("Ingresa el numero: "+i);
				num = leer.nextInt();
				i++;
			}while (num > 0 && num < 5);//Hasta que num sea negativo o mayor a 5
		}catch(InputMismatchException ex) {
			System.out.println("DEBE DE SER UN TIPO NUMERO");
		}
		System.out.println("Saliste");
	}

}
