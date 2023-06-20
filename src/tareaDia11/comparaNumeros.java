package tareaDia11;

import java.util.Scanner;

public class comparaNumeros {
	
	//Método para no repetir ls salida
	public void MayorMenorPrint(float a, float b) {
		System.out.println("El numero MAYOR es: "+a);
		System.out.println("El numero MENOR es: "+b);
	}
	
	//Método para comparar
	public static void ComparaTres(float num1, float num2, float num3) {
		final float mayor, menor;
		
		//Se hace instancia de comparaNumeros
		comparaNumeros salida = new comparaNumeros();
		
		if(num1 != num2 || num2 != num3) {
			System.out.println("Gracias! Todos los numeros son disintos");
			
			//Ya que sabemos que todos son distintos hacemos la compración
			if(num1 > num2) { //SI: num1>num2  NO:num2>num1
				if (num2 > num3) { //COMO: num1>num2 y SI: num2>num3 => num1>num2>num3 NO: num3>num2
					mayor = num1;
					menor = num3;		
					salida.MayorMenorPrint(mayor, menor);
					
				}else if(num1 > num3){ //COMO: num3>num2 y num1>num2 SI num1>num3=>num1>num3>num2
					mayor = num1;
					menor = num2;
					salida.MayorMenorPrint(mayor, menor);
					
				}else {//COMO: num3>num1 y num1>num2 => num3>num1>num2
					mayor = num3;
					menor = num2;
					salida.MayorMenorPrint(mayor, menor);
				}	
			}else if(num1 > num3) { //COMO: num2>num1 SI: num1>num3 => num2>num1>num3; NO: num3>num1
				mayor = num2;
				menor = num3;
				salida.MayorMenorPrint(mayor, menor);
				
			}else if(num3 > num2){//COMO: num3>num1 y num2>num1 SI: num3>num2 => num3>num2>num1 NO: num2>num3
				mayor = num3;
				menor = num1;
				salida.MayorMenorPrint(mayor, menor);
				
			}else { //COMO: num3>num1, num2>num1 y num2>num3 => num2>num3>num1
				mayor = num2;
				menor = num1;
				salida.MayorMenorPrint(mayor, menor);
			}
		}else { //Si todos son iguales no hat nada que hacer
		System.out.println("Todos son IGUALES. NO HAY NADA QUE CALCULAR");
		}
	}

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		float a, b, c;
		comparaNumeros numerosResultado = new comparaNumeros();
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Se compararan los tres numeros ingresados para regresar el mayor y el menor");
		
		System.out.println("Introduce el primer numero a comparar: ");
		a = leer.nextFloat();
		
		System.out.println("Introduce el segundo numero a comparar: ");
		b = leer.nextFloat();
		
		System.out.println("Introduce el tercero numero a comparar: ");
		c = leer.nextFloat();
		//Se llama al método para que imprima en pantalla el resultado
		numerosResultado.ComparaTres(a, b, c);

	}
}

