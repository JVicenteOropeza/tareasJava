package tareasDia19;

import java.util.Scanner;

public class CalculadoraSwitch {
	private int opcion;
	private Scanner leer = new Scanner(System.in);
	
	
	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}


	public void MenuCalSwitch() {
		
		do {
		System.out.println("Señala opción para señalart el conjunto de numeros que usaremos: ");
		System.out.println("NUMEROS NATURALES --------- 1");
		System.out.println("NUMEROS ENTEROS ----------- 2");
		System.out.println("NUMEROS RACIONALES -------- 3");
		System.out.println("NUMEROS IRRACIONALES ------ 4");
		System.out.println("NUMEROS REALES  ----------- 5");
		System.out.println("NUMEROS COMPLEJOS  -------- 6");
		System.out.println("SALIR  -------------------- 7");
		opcion = leer.nextInt();
		switch(opcion) {
			case 1:{
				//NATURALES
				int resultado;
				resultado = NumerosNaturales();
				System.out.println(resultado);
				break;
			}
			case 2:{
				//ENTEROS
				int resultado;
				resultado = NumerosEnteros();
				System.out.println(resultado);
				break;
			}
			case 3:{
				//RACIONALES Q
				double resultado;
				resultado = NumerosRacionales();
				System.out.println(resultado);
				break;
			}
			case 4:{
				//IRRACIONALES
				double resultado;
				resultado = NumerosIrracionales();
				System.out.println(resultado);
				break;
			} 
			case 5:{
				//REALES
				double resultado;
				resultado = NumerosReales();
				System.out.println(resultado);
				break;
			}
			case 6:{
				//COMPLEJOS C
				String resultado;
				resultado = NumerosComplejos();
				System.out.println(resultado);
				break;
			}
			case 7:{
				//SALIDA
				System.out.println("SALISTE");
				break;
			}
			default:{
				break;
			}
		}
		}while(opcion > 0 && opcion <7);
	}
	
	//Son llamados en el método MenuCalSwitch
	private int NumerosNaturales() {
		int opcion; 
		int resultado = 0;
		System.out.println("Sleccionaste numeros Naturales");
		System.out.println("Estos están {1,2,3, ... ,oo}");
		System.out.println("Suma de Naturales ------------- 1");
		System.out.println("Multiplicaión de Naturales ---- 2");
		System.out.println("División de Naturales --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				int a,b;
				System.out.println("Ingres el primer número: ");
				a = leer.nextInt();
				System.out.println("Ingres el segundo número: ");
				b = leer.nextInt();
				resultado = a+b;
				break;
			}
			case 2:{
				int a,b;
				System.out.println("Ingres el primer número: ");
				a = leer.nextInt();
				System.out.println("Ingres el segundo número: ");
				b = leer.nextInt();
				resultado = a*b;
				break;
			}
			case 3:{
				int a,b;
				System.out.println("Ingres el primer número: ");
				a = leer.nextInt();
				System.out.println("Ingres el segundo número: ");
				b = leer.nextInt();
				resultado = a%b;
				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
		return resultado;
	}
	
	private int NumerosEnteros() {
		int opcion; 
		int resultado = 0;
		System.out.println("Sleccionaste numeros Enteros");
		System.out.println("Estos están {-oo, ... -3, -2, -1, 0, 1,2,3, ... ,oo}");
		System.out.println("Suma de Enteros ------------- 1");
		System.out.println("Multiplicaión de Enteros ---- 2");
		System.out.println("División de Enteros --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				int a,b;
				System.out.println("Ingres el primer número Entero: ");
				a = leer.nextInt();
				System.out.println("Ingres el primer número Entero: ");
				b = leer.nextInt();
				if( (a%1 == 0 || a%2 == 0) && (b%1 == 0 || b%2 == 0)) {
					resultado = a+b;
				}else {
					System.out.println("NO SON ENTEROS");
				}
				break;
			}
			case 2:{
				int a,b;
				System.out.println("Ingres el primer número Entero: ");
				a = leer.nextInt();
				System.out.println("Ingres el primer número Entero: ");
				b = leer.nextInt();
				if( (a%1 == 0 || a%2 == 0) && (b%1 == 0 || b%2 == 0)) {
					resultado = a*b;
				}else {
					System.out.println("NO SON ENTEROS");
				}
				break;
			}
			case 3:{
				int a,b;
				System.out.println("Ingres el primer número Entero: ");
				a = leer.nextInt();
				System.out.println("Ingres el primer número Entero: ");
				b = leer.nextInt();
				if( (a%1 == 0 || a%2 == 0) && (b%1 == 0 || b%2 == 0)) {
					resultado = a%b;
				}else {
					System.out.println("NO SON ENTEROS");
				}
				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
		return resultado;
	}
	
	private double NumerosRacionales() {
		int opcion;
		int resultado = 0;
		System.out.println("Sleccionaste numeros Racionales");
		System.out.println("Estos incluyen los numeros de la forma p/q tal que p, q están en los ENTEROS");
		System.out.println("Suma de Racionales ------------- 1");
		System.out.println("Multiplicaión de Racionales ---- 2");
		System.out.println("División de Racionales --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				int a,b,c,d;
				System.out.println("Ingres el primer número de forma a/b donde a = DIVIDENDO y b = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del primer numero: ");
				a = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del primer numero: ");
				b = leer.nextInt();
				System.out.println("Ingres el segundo número de forma c/d donde c = DIVIDENDO y d = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del segundo numero: ");
				c = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del segundo numero: ");
				d = leer.nextInt();
				System.out.println("Se sumara a/b + c/d");
				resultado = a/b + c/d;
				break;
			}
			case 2:{
				int a,b,c,d;
				System.out.println("Ingres el primer número de forma a/b donde a = DIVIDENDO y b = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del primer numero: ");
				a = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del primer numero: ");
				b = leer.nextInt();
				System.out.println("Ingres el segundo número de forma c/d donde c = DIVIDENDO y d = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del segundo numero: ");
				c = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del segundo numero: ");
				d = leer.nextInt();
				System.out.println("Se multiplicará a/b X c/d");
				resultado = a/b * c/d;
				break;
			}
			case 3:{
				int a,b,c,d;
				System.out.println("Ingres el primer número de forma a/b donde a = DIVIDENDO y b = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del primer numero: ");
				a = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del primer numero: ");
				b = leer.nextInt();
				System.out.println("Ingres el segundo número de forma c/d donde c = DIVIDENDO y d = DIVISOR:");
				System.out.println("Ingresa el DIVIDENDO del segundo numero: ");
				c = leer.nextInt();
				System.out.println("Ingresa el DIVISOR del segundo numero: ");
				d = leer.nextInt();
				System.out.println("Se dividirá a/b / c/d");
				resultado = (a/b)/(c/d);
				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
		return resultado;
	}
	
	private double NumerosIrracionales() {
		int opcion;
		double resultado = 0;
		System.out.println("Sleccionaste numeros Irracionales");
		System.out.println("Son todos aquello que tienen decimales infinitos y no se pueden expresar como el cociente de dos Enteros");
		System.out.println("Ejemplos: pi = 3.141592 ... , phi = 1.61803398 ... (letra griega) , e=2.71828 ... , la raiz cuadrada de 2 igual a 1.414213 ..., ");
		System.out.println("Suma de Irracionales ------------- 1");
		System.out.println("Multiplicaión de Irracionales ---- 2");
		System.out.println("División de Irracionales --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				double a,b;
				System.out.println("Ingres el primer número Irracional: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número Irracional: ");
				b = leer.nextDouble();
				resultado = a+b;
				break;
			}
			case 2:{
				double a,b;
				System.out.println("Ingres el primer número Irracional: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número Irracional: ");
				b = leer.nextDouble();
				resultado = a*b;
				break;
			}
			case 3:{
				double a,b;
				System.out.println("Ingres el primer número Irracional: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número Irracional: ");
				b = leer.nextDouble();
				resultado = a/b;
				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
	return resultado;	
}
	
	private double NumerosReales(){
		int opcion;
		double resultado = 0;
		System.out.println("Sleccionaste numeros Reales");
		System.out.println("Estos están compuestos por los NATURALES, ENTEROS, RACIONALES e IRRACIONALES");
		System.out.println("Suma de Reales ------------- 1");
		System.out.println("Multiplicaión de Reales ---- 2");
		System.out.println("División de Reales --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				double a,b;
				System.out.println("Ingres el primer número REAL: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número REAL: ");
				b = leer.nextDouble();
				resultado = a+b;
				break;
			}
			case 2:{
				double a,b;
				System.out.println("Ingres el primer número REAL: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número REAL: ");
				b = leer.nextDouble();
				resultado = a*b;
				break;
			}
			case 3:{
				double a,b;
				System.out.println("Ingres el primer número REAL: ");
				a = leer.nextDouble();
				System.out.println("Ingres el segundo número REAL: ");
				b = leer.nextDouble();
				resultado = a/b;
				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
	return resultado;
		
	}
	
	private String NumerosComplejos() {
		int opcion;
		String resultado = " ";
		System.out.println("Sleccionaste numeros Complejos");
		System.out.println("Estos son de la forma a+ib, donde i es igual a la raiz cuadra de -1 y a,b estan en los REALES");
		System.out.println("Suma de Complejos ------------- 1");
		System.out.println("Multiplicaión de Complejos ---- 2");
		System.out.println("División de Complejos --------- 3");
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:{
				double a,b,c,d;
				double real, imaginario;
				System.out.println("Ingresa el primer número Complejo de la forma a+ib : ");
				System.out.println("Ingresa a : ");
				a = leer.nextInt();
				System.out.println("Ingresa b : ");
				b = leer.nextInt();
				System.out.println("Ingresa el segundo número Complejo de la forma c+id : ");
				System.out.println("Ingresa c : ");
				c = leer.nextInt();
				System.out.println("Ingresa d : ");
				d = leer.nextInt();
				real = a+c;
				imaginario = b+d;		
				resultado = String.valueOf(real)+" +i"+String.valueOf(imaginario);
				break;
			}
			case 2:{
				int a,b,c,d;
				double real, imaginario;
				System.out.println("Ingresa el primer número Complejo de la forma a+ib : ");
				System.out.println("Ingresa a : ");
				a = leer.nextInt();
				System.out.println("Ingresa b : ");
				b = leer.nextInt();
				System.out.println("Ingresa el segundo número Complejo de la forma c+id : ");
				System.out.println("Ingresa c : ");
				c = leer.nextInt();
				System.out.println("Ingresa d : ");
				d = leer.nextInt();
				real = (a*c + (b*d*(-1)));
				imaginario = (a*d + b*c);		
				resultado = String.valueOf(real)+" +i"+String.valueOf(imaginario);
				break;
			}
			case 3:{
				double a,b,c,d;
				double real, imaginario;
				System.out.println("Ingresa el primer número Complejo de la forma a+ib : ");
				System.out.println("Ingresa a : ");
				a = leer.nextDouble();
				System.out.println("Ingresa b : ");
				b = leer.nextDouble();
				System.out.println("Ingresa el segundo número Complejo de la forma c+id : ");
				System.out.println("Ingresa c : ");
				c = leer.nextDouble();
				System.out.println("Ingresa d : ");
				d = leer.nextDouble();
				real = (a*c + b*d)/(c*c + d*d);
				imaginario = (b*c - a*d)/(c*c + d+d);	
				resultado = String.valueOf(real)+" +i"+String.valueOf(imaginario)
;				break;
			}
			case 4:{
				System.out.println("Regresar al menú anterior");
				break;
			}
			default:{
				System.out.println("Opcion NO valida");
				break;
			}
		}
		return resultado;
	}
	
}
