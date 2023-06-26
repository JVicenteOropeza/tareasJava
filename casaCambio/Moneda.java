package casaCambio;

public class Moneda {
	private String nombreMoneda;
	private String cambioMoneda;
	private double tipoCambio;
	private boolean validaMoneda;
	/*private double soles;
	private double dolares;
	private double pesos;
	private double quetzal;*/
	
	//SET,GET
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}
	
	public String getNombreMoneda() {
		return nombreMoneda;
	}
	public void setCambioMoneda(String cambioMoneda) {
		this.cambioMoneda = cambioMoneda;
	}
	
	public String getCambioMoneda() {
		return cambioMoneda;
	}
	
	public double TipoCambio(String nombreMoneda, String cambioMoneda) {
		this.nombreMoneda = nombreMoneda; 
		this.cambioMoneda = cambioMoneda;
		//se hacen todas mayusculas para evitar que el usuario escriba en minusculas y por lo tanto se de un error al comparar
		final String monedaNombreMoneda = nombreMoneda.toUpperCase();
		final String monedaCambioMoneda = cambioMoneda.toUpperCase();
		System.out.println("entre a TipoCambio en Moneda" +nombreMoneda+"------" +cambioMoneda);
		
		
		//try {
			if(monedaNombreMoneda.equals("SOLES")) {
				switch(monedaCambioMoneda){
					case "DOLARES":{
						this.tipoCambio = 0.28;
						return tipoCambio;
						
					}
					case "PESOS":{
						this.tipoCambio = 4.73;
						return tipoCambio;
						
					}
					case "QUETZAL":{
						this.tipoCambio = 2.16;
						return tipoCambio;
						
					}
					default:{
						System.out.println("NO ES UNA MONEDA VALIDA -- >>>");
					}
				}
			}else {
				System.out.println("NO ES UNA MONEDA VALIDA --");
			}
			if(monedaNombreMoneda.equals("PESOS")) {
				System.out.println("entre a TipoCambio a Pesos-Dolares en Moneda");
				switch(monedaCambioMoneda){
					case "DOLARES":{
						this.tipoCambio = 0.058;
						System.out.println("tipoCambio de Moneda "+ tipoCambio);
						return tipoCambio;
						
					}
					case "SOLES":{
						this.tipoCambio = 0.21;
						return tipoCambio;
						
					}
					case "QUETZAL":{
						this.tipoCambio = 0.46;
						return tipoCambio;
						
					}
					default:{
						System.out.println("NO SE TIENE DATO PARA DEVOLVER EL tipoCambio");
					}
				}
			}else {
				System.out.println("NO ES UNA MONEDA VALIDA --");
			}
			if(monedaNombreMoneda.equals("QUETZAL")) {
				switch(monedaCambioMoneda){
					case "DOLARES":{
						this.tipoCambio = 0.13;
						return tipoCambio;
						
					}
					case "SOLES":{
						this.tipoCambio = 0.46;
						return tipoCambio;
						
					}
					case "PESOS":{
						this.tipoCambio = 2.19;
						return tipoCambio;
						
					}
					default:{
						System.out.println("NO SE TIENE DATO PARA DEVOLVER EL tipoCambio");
					}
				}
			}else {
				System.out.println("NO ES UNA MONEDA VALIDA --");
			}
			if(monedaNombreMoneda.equals("DOLARES")) {
				switch(monedaCambioMoneda){
					case "QUETZAL":{
						this.tipoCambio = 7.48;
						return tipoCambio;
						
					}
					case "SOLES":{
						this.tipoCambio = 3.63;
						return tipoCambio;
				
					}
					case "PESOS":{
						this.tipoCambio = 17.16;
						return tipoCambio;
		
					}
					default:{
						System.out.println("NO SE TIENE DATO PARA DEVOLVER EL tipoCambio");
					}
				}	
			}else {
				System.out.println("NO ES UNA MONEDA VALIDA --");
			}
		/*}catch (Exception error){
			if(tipoCambio == 0) {
			System.out.println("Solo opciones validas");
			}
		}*/
		return tipoCambio;
	}
	//SE VALIDA QUE LAS MONEDAS SEAN CORRECTAS
	public boolean ValidaMoneda(String nombreMoneda, String cambioMoneda) {
		final String monedaNombreMoneda = nombreMoneda.toUpperCase();
		final String monedaCambioMoneda = cambioMoneda.toUpperCase();
		if((monedaNombreMoneda.equals("PESOS") || monedaNombreMoneda.equals("DOLARES") || monedaNombreMoneda.equals("SOLES") || monedaNombreMoneda.equals("QUETZAL")) &&
			(monedaCambioMoneda.equals("PESOS") || monedaCambioMoneda.equals("DOLARES") || monedaCambioMoneda.equals("SOLES") || monedaCambioMoneda.equals("QUETZAL"))){
			this.validaMoneda = true;
		}else {
			this.validaMoneda = false;
		}
		return validaMoneda;
		
	}
}
