package tareasDia19;

public class ConvertirNumeroSemana {
	private int numero;
	private String dia;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String NumeroDia(int numero) {
		this.numero = numero;
			switch(numero) {
				case 1:{
					dia = "DOMINGO";
					break;
				}
				case 2:{
					dia = "LUNES";
					break;
				}
				case 3:{
					dia = "MARTES";
					break;
				}
				case 4:{
					dia = "MIÉRCOLES";
					break;
				} 
				case 5:{
					dia = "JUEVES";
					break;
				}
				case 6:{
					dia = "VIERNES";
					break;
				}
				case 7:{
					dia = "SÁBADO";
					break;
				}
				default:{
					dia = "NO ES UN DÍA DE LA SEMANA";
					break;
				}
			}
			return dia;
	}
	
}
