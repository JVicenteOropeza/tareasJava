package practicaDia16;

public class Bisiesto {
	private int tiempo;
	
	
	
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public void TiempoBisiesto(int tiempo) {
		this.tiempo = tiempo;
				if ((tiempo % 4 == 0 && tiempo % 100 != 0) || tiempo % 400 == 0 ) {//la negacion de que no son divisibles entre 400
					System.out.println("El año "+tiempo+ " es BISIESTO");
				}else{
					System.out.println("El año "+tiempo+ " NO es BISIESTO");
				}
	}
}
