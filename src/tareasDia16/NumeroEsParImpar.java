package tareasDia16;

public class NumeroEsParImpar {
	private double numero;
	
	
	public double getNumero() {
		return numero;
	}


	public void setNumero(double numero) {
		this.numero = numero;
	}

	public void ParOImpar(double numero) {
		this.numero = numero;
		//Los numeros pares sin divisbles entre 2
		if(numero % 2 == 0) {
			System.out.println("EL NUMERO ES PAR");
			System.out.println("<<<<<<<<<< >>>>>>>>>>");
		}else {
			System.out.println("EL NUMERO ES IMPAR");
			System.out.println("<<<<<<<<<< >>>>>>>>>>");
		}
	}
	
	public void Primo(double numero) {
		this.numero = numero;
		//solo son divisibles entre 1 y ellos mismos y son postivos
		if((numero % 1)== 0 && (numero % numero)== 0 && (numero % 2 != 0) && numero > 0) {
			System.out.println("EL NUMERO ES PRIMO");
			System.out.println("<<<<<<<<<< >>>>>>>>>>");
		}else {
			System.out.println("EL NUMERO NO ES PRIMO");
			System.out.println("<<<<<<<<<< >>>>>>>>>>");
		}
		
	}
	
}
