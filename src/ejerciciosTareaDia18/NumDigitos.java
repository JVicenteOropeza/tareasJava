package ejerciciosTareaDia18;

import java.lang.NumberFormatException;
public class NumDigitos {
	private String numero;
	private String[] numDes; 
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String[] getNumDes() {
		return numDes;
	}


	public void setNumDes(String[] numDes) {
		this.numDes = numDes;
	}


	public void SumaDigitos(String numero) {
		this.numero = numero; 
		int tamanoNumero = numero.length();
		this.numDes = new String[tamanoNumero];
		int suma = 0;
		try {
		int i = 0;
			while(i < tamanoNumero) {
				this.numDes[i] = String.valueOf(numero.charAt(i));
				i++;
			}
			
			int n = 0;
			while(n < tamanoNumero ) {
				suma = suma + Integer.parseInt(numDes[n]);
				n++;
			}
			
			System.out.println("LA SUMA DE LOS DIGITOS DE "+numero+" ES: "+suma);
		}catch(NumberFormatException ex) {
			System.out.println("NO PUEDEN SER LETRAS");
		}
	
	}
	
}
