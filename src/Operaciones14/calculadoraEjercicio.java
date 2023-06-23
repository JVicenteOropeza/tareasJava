package Operaciones14;
import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadoraEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		boolean menu;
		Scanner leerCalculadora = new Scanner(System.in);
		//se crean los objetos para tener acceso a los métodos
		Operaciones calculandoFlotantes = new Operaciones();
		Circulo circulo = new Circulo();
		Promedio promFlotantes = new Promedio();
	//Se determinan los menus	
	do {
		try{
			menu = false;
			System.out.println("Bienvenido !");
			System.out.println("Selecciona una opción del siguiente menú");
			System.out.println("**-----------------------------------------------------------**");
			System.out.println("");
			System.out.println("Calculadora ----------------- 1");
			System.out.println("Área de un Circulo ---------- 2");
			System.out.println("Promedio -------------------- 3");
			opcion = leerCalculadora.nextInt();
		
		
		switch(opcion) {
			case 1:{
				final int opcion1; //Submenu operaciones
				System.out.println("CALCULADORA DE DOS NUMEROS FLOTANTES, ELIJE");
				System.out.println("SUMA ---------------- 1");
				System.out.println("MULTIPLICACION ------ 2");
				System.out.println("DIVISIÓN ------------ 3");
				opcion1 = leerCalculadora.nextInt();
				
				if(opcion1 == 1) {
					//calculandoFlotantes
					float suma;
					System.out.println("SUMA");
					System.out.print("Ingresa el primer numero: ");
					calculandoFlotantes.setValorA(leerCalculadora.nextFloat());
					System.out.print("Ingresa el segundo numero: ");
					calculandoFlotantes.setValorB(leerCalculadora.nextFloat());
					
					suma = calculandoFlotantes.Suma(calculandoFlotantes.getValorA(), calculandoFlotantes.getValorB());
					System.out.print("LA SUMA ES: "+suma);
					leerCalculadora.close();
				}
				if(opcion1 == 2) {
					float multiplicacion;
					System.out.println("MULTIPLICACIÓN");
					System.out.print("Ingresa el primer numero: ");
					calculandoFlotantes.setValorA(leerCalculadora.nextFloat());
					System.out.print("Ingresa el segundo numero: ");
					calculandoFlotantes.setValorB(leerCalculadora.nextFloat());
					
					multiplicacion = calculandoFlotantes.Multiplicacion(calculandoFlotantes.getValorA(), calculandoFlotantes.getValorB());
					System.out.print("LA MULTIPLICACION ES: "+multiplicacion);
					leerCalculadora.close();
				}
				if(opcion1 == 3) {
					float division;
					System.out.println("DIVISIÓN");
					System.out.print("Ingresa el primer numero: ");
					calculandoFlotantes.setValorA(leerCalculadora.nextFloat());
					System.out.print("Ingresa el segundo numero: ");
					calculandoFlotantes.setValorB(leerCalculadora.nextFloat());
					
					if(calculandoFlotantes.getValorB() != 0) {
						division = calculandoFlotantes.Division(calculandoFlotantes.getValorA(), calculandoFlotantes.getValorB());
						System.out.print("LA DIVISION ES: "+division);
						leerCalculadora.close();
					}else {
						System.out.println("EL SEGUNDO NUMERO QUE ES EL DIVISOR NO PUEDE SER CERO");
						menu = true;
					}
				}
				System.out.println("SALISTE DE LA OPCIÓN 1");
				menu = true;
				break;
			}
			case 2:{//se valida opción 2 AREA DE UN CIRCULO
				float area;
				System.out.println("ÁREA DE UN CIRCULO DANDO SU RADIO");
				System.out.print("Ingresa el radio (r): ");
				circulo.setRadio(leerCalculadora.nextFloat()); //se asigna el radio para que se calcule el radio
				area = circulo.AreaCirculo(circulo.getRadio());
				
				System.out.println("El área del circulo con radio "+circulo.getRadio()+" es de: "+area);
				//leerCalculadora.close();
				break;
			}
			case 3:{ //se valida opción 3 Promedio
				float promedioCalculado;
				System.out.println("PROMEDIO DE NUMEROS FLOTANTES");
				System.out.print("Ingresa la cantidad de numeros que ingresaras");
				promFlotantes.setCantidadNumeros(leerCalculadora.nextByte());
				System.out.println("getCantidadNumeros" + promFlotantes.getCantidadNumeros());
				//Se llama al llenado del 
				promFlotantes.llenarArreglo(promFlotantes.getCantidadNumeros());
				//Se calcula el promedio
				promedioCalculado = promFlotantes.ObtenerPromedio();
				
				System.out.println("El promedio es de: "+ promedioCalculado);
				//leerCalculadora.close();
				break;
			}
			default:{
				System.out.println("SALISTE DE CALCULADORA DE FLOTANTES");
				menu = true;
			}
		}
		}catch(InputMismatchException ex) {
			System.out.println("FAVOR DE INTRODUCIR UNA OPCIÓN LISTADA");
			menu = true;
		}
	}while(menu);
	}
}