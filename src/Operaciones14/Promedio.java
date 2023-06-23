package Operaciones14;

import java.util.Scanner;

public class Promedio {
	private byte cantidadNumeros;
	private float promedio;
	float[] arregloFloat;
	
	//SETs 
	public void setCantidadNumeros(byte c) {
		this.cantidadNumeros = c;
	}
	
	public void setArregloFloat(float[] arreglo) {
		this.arregloFloat = arreglo;
	}
	
	//GETs
	public byte getCantidadNumeros() {
		return cantidadNumeros;
	}
	
	public float[] getArregloFloat() {
		return arregloFloat;
	}
	
	public void llenarArreglo(byte c) {
		Scanner ingresarNumero = new Scanner(System.in);
		arregloFloat = new float[c];
		int r = 1;
		for(int i=0; i < c; i++) {
			System.out.print("Ingrea el núumero: "+ r++ +" ");
			arregloFloat[i] = ingresarNumero.nextFloat();
			System.out.println("arregloFloat[i]: "+ arregloFloat[i]);
		}
		System.out.println("**----------------------------------------------**");
		System.out.println("TODOS LOS NUMEROS LISTOS PARA PROMEDIAR");
		ingresarNumero.close();
	}
	
	public float ObtenerPromedio(){
		float sumando=0;
		for(int i=0; i < cantidadNumeros; i++) {
			System.out.println("ObtenerPromedio arregloFloat[i] "+arregloFloat[i]);
			sumando = sumando + arregloFloat[i];
		}
		promedio = sumando/cantidadNumeros;
		return promedio;
	}

}
