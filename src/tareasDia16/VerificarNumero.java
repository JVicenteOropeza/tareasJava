package tareasDia16;

public class VerificarNumero {
	private double numero;

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public void PositivoONegativo(double numero) {
		this.numero = numero;
		if(numero > 0) {
			System.out.println("-------->>>> EL NUMERO ES POSITIVO");
		}else if(numero < 0) {
			System.out.println("-------->>>> EL NUMERO ES NEGATIVO");
		}else {
			System.out.println("-------->>>> EL NUMERO ES CERO");
		}
				
	}
	
}
