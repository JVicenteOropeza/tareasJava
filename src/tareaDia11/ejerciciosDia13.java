package tareaDia11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ejerciciosDia13 {
	//Métod para el producto de tres enteros
	public void Producto() {
		final int a, b, c, producto;
		Scanner leerProducto = new Scanner(System.in);
		
		try {
			System.out.println("Introduce los tres numeros a multiplicar");
			System.out.print("PRIMER NÚMERO:");
			a = leerProducto.nextInt();
			System.out.println();
			
			System.out.print("SEGUNDO NÚMERO:");
			b = leerProducto.nextInt();
			System.out.println();
			
			System.out.print("TERCERO NÚMERO:");
			c = leerProducto.nextInt();
			System.out.println();
			
			producto = Math.multiplyExact(a, Math.multiplyExact(b, c));
			
			System.out.println("PRODUCTO ES: "+producto);
		}catch (InputMismatchException ex) {
			System.out.println("SOLO SE ACEPTAN NUMEROS ENTEROS");
			leerProducto.close();
		}
		
		leerProducto.close();
		
	}
	
	//Evalua expresiones 
	public void Expresiones() {
		int opcion;
		float exp1, exp2, exp3, exp4, a, b, c, d, e, f;
		Scanner leerExp = new Scanner(System.in);
		
		System.out.println("El siguiente menú meustra la evaluación de varias expresiones.");
		
		System.out.println("Expresión -a+b/c ----------------- 1");
		System.out.println("Expresión (a-b)%c ---------------- 2");
		System.out.println("Expresión (a+b)/(c-d) ------------ 3");
		System.out.println("Expresión a-b/c*d+e%f ------------ 4");
		opcion = leerExp.nextInt();
	
			switch(opcion) {
				case 1:{
					System.out.println("Se evaluara la expresión: -a+b/c");
					
					System.out.print("Ingresa a: ");
					a = leerExp.nextInt();
					System.out.print("Ingresa b: ");
					b = leerExp.nextInt();
					System.out.print("Ingresa c: ");
					c = leerExp.nextInt();
					System.out.println();
					
					if(c == 0) {
						System.out.println("el valor de C no puede ser "+c);
					}else {
						//-16+32/4
						exp1 = -a + b/c;
						System.out.println("PRIMERO SE HACE b/c: "+b+" / "+c);
						System.out.println("SEGUNDO  SE HACE LA SUMA O RESTA -a+b/c: "+ (-a)+" '+' "+b/c);
						System.out.println("La expresión: -a+b/c evaluada es: "+exp1);
					}
					break;
				}
				case 2:{
					System.out.println("Se evaluara la expresión: (a-b)%c");
					
					System.out.print("Ingresa a: ");
					a = leerExp.nextInt();
					System.out.print("Ingresa b: ");
					b = leerExp.nextInt();
					System.out.print("Ingresa c: ");
					c = leerExp.nextInt();
					System.out.println();
					
					if(c == 0) {
						System.out.println("el valor de C no puede ser "+c);
					}else {
						System.out.println("PRIMERO SE HACE LA OPERACIÓN DENTRO DEL PARENTESIS (a-b): "+(a-b));
						System.out.println("SEGUNDO SE HACE LA OPERACIÓN MODULO (a-b)%c: "+ (a-b)+ " % "+c);
						//(48 - 7)% 11
						exp2 = (a - b) % c;
						System.out.println("La expresión: (a-b)%c evaluada es: "+exp2);
					}
					break;
				}
				case 3:{
					System.out.println("Se evaluara la expresión: (a+b)/(c-d)");
					
					System.out.print("Ingresa a: ");
					a = leerExp.nextInt();
					System.out.print("Ingresa b: ");
					b = leerExp.nextInt();
					System.out.print("Ingresa c: ");
					c = leerExp.nextInt();
					System.out.print("Ingresa d: ");
					d = leerExp.nextInt();
					System.out.println();
					
					if(c == d) {
						System.out.println("el valor de (c-d) no puede ser igual a 0. c y d tienen que ser diferentes");
					}else {
						System.out.println("PRIMERO SE HACEN LAS OPERACIONES EN LOS PARENTESIS (a+b) y (c-d): "+ (a+b)+" y "+(c-d));
						System.out.println("SEGUNDO SE HACE LA DIVISIÓN (a+b)/(c-d): "+ (a+b)+" / "+(c-d));
						//(18 + 2)/(17 - 12)
						exp3 = (a + b)/(c - d);
						System.out.println("La expresión: (a+b)/(c-d) evaluada es: "+exp3);
					}
					break;
				}
				case 4:{
					System.out.println("Se evaluara la expresión: a-b/c*d+e%f");
					System.out.print("Ingresa a: ");
					a = leerExp.nextInt();
					System.out.print("Ingresa b: ");
					b = leerExp.nextInt();
					System.out.print("Ingresa c: ");
					c = leerExp.nextInt();
					System.out.print("Ingresa d: ");
					d = leerExp.nextInt();
					System.out.print("Ingresa e: ");
					e = leerExp.nextInt();
					System.out.print("Ingresa f: ");
					f = leerExp.nextInt();
					System.out.println();
					
					if(c == 0 || d == 0 || f == 0) {
						System.out.println("el valor de 'c * d + e % f' no puede ser igual a 0. c,d y f tienen que ser diferentes a cero");
					}else {
						System.out.println("PRIMERO SE HACE LA OPERACIÓN DIVISIÓN: -b/c"+ (-b/c));
						System.out.println("SEGUNDO SE HACE LA OPERACIÓN MULTIPICACIÓN: (-b/c)*d"+ (-b/c)*d);
						System.out.println("TERCERO SE HACE LA OPERACIÓN MODULO, e%f: "+ (e%f));
						System.out.println("CUARTO SE HACE LA OPERACIÓN RESTA, a + ((-b/c)*d): "+ a+((-b/c)*d));
						System.out.println("QUINTO SE HACE LA OPERACIÓN SUMA: (a+((-b/c)*d))+(e%f): "+ ((a+((-b/c)*d))+(e%f)) );
						
						//17 - 18 /6 * 3 + 11 % 4
						exp4 = a - b / c * d + e % f;
						System.out.println("La expresión: a-b/c*d+e%f evaluada es: "+exp4);
					}
					break;
				}
				default:{
					System.out.println("SALISTE DE EXPRESIONES");
				}
				leerExp.close();
		}
		leerExp.close();
	}
	
	public void Cociente() {
		float a, b, cociente, parteEntera, parteDecimal;
		Scanner leerCociente = new Scanner(System.in);
		
		System.out.println("Calcularemos el cociente de una división, el resto de la separación y la respuesta real");
		
		System.out.print("Ingresa a: ");
		a = leerCociente.nextFloat();
		System.out.print("Ingresa b: ");
		b = leerCociente.nextFloat();
		if(b != 0) {
			DecimalFormat d = new DecimalFormat("#");
			cociente = a/b;
			parteDecimal = cociente % 1;
			parteEntera = cociente - parteDecimal;
			
			System.out.println("COCIENTE : "+cociente);
			System.out.printf("PARTE DECIMAL: %f\n",parteDecimal);
			System.out.println("PARTE ENTERA: "+d.format(parteEntera));
			leerCociente.close();
		}else {
			System.out.println("b no puede cero");
			leerCociente.close();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejerciciosDia13 activado= new ejerciciosDia13();
		int opcionMetodo;
		Scanner leerMetodo = new Scanner(System.in);
	    
		System.out.println("Selcciona el Método deseado");
		System.out.println("Producto 3 enteros --------------------- 1");
		System.out.println("Expresiones ---------------------------- 2");
		System.out.println("Divisón, Cociente, Speracion y Real ---- 3");
		opcionMetodo = leerMetodo.nextInt();
		
		if(opcionMetodo == 1) {
			activado.Producto();
		}
		if(opcionMetodo == 2) {
			activado.Expresiones();
		}
		if(opcionMetodo == 3) {
			activado.Cociente();
		}
		
		System.out.println("SALISTE DEL SISTEMA");
		leerMetodo.close();
	}
}
