package Operaciones14;

public class Circulo {
	private float radio, resultado;
	
	//SETs
	public void setRadio(float r) {
		this.radio = r;
	}
	
	public float getRadio() {
		return radio;
	}
	
	public float AreaCirculo(float r){
		resultado = r;
		resultado = (float) ((Math.PI)* Math.pow(resultado, 2));
		return resultado;
	}
}
