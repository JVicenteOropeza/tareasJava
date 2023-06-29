package ejerciciosTareaDia18;

public class FactorialNum {
	private int numero;
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void Factorial(int numero) {
		this.numero = numero;
		
		if(numero > 0) {
			int factorial = 1;
			int i = 1;
			while(i <= numero) {
				factorial = factorial * i;
				i++;
			}
			System.out.println("EL FACTORIAL DE "+numero+" ES: "+numero+"! = "+factorial);
		}else if(numero == 0) { //CASO 0! = 1
			int factorialCero = 1;
			System.out.println("EL FACTORIAL DE "+numero+" ES: "+numero+"! = "+factorialCero);
		}else if(numero < 0) {// CASO ES NEGATIVO
			System.out.println("EL NUJMERO ES NEGATIVO. SOLO SE ACEPTAN POSITIVOS PARA EL FACTORIAL");
		}
	}
	
}
