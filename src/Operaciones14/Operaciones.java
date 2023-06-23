package Operaciones14;

public class Operaciones {

	private float a, b, resultado;
	
	//SETs
	public void setValorA(float num1) {
			a = num1;
	}
	public void setValorB(float num2) {
			b = num2;
	}
	
	//GETs
	public float getValorA() {
		return a;
	}
	public float getValorB() {
		return b;
	}
	
	public float Suma(float num1, float num2){
		this.a=num1;
		this.b=num2;
		this.resultado = a + b;
		
		return resultado;
	}
	
	public float Multiplicacion(float num1, float num2){
		this.a=num1;
		this.b=num2;
		this.resultado = a * b;
		
		return resultado;
	}
	
	public float Division(float num1, float num2){
		this.a=num1;
		this.b=num2;
		this.resultado = a / b;
		return resultado;
	}
}
