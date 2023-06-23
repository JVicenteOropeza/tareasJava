package nominaDia15;

public class Nomina {
	private float pagoTrabajo = (float) 72.87;
	private float pagoExtra = (float) 25.96;
	private float sueldoBruto;
	private float sueldoNeto;
	private float descuentoMenor = (float) 0.16;
	private float descuentoMayor = (float) 0.18;
	
	//SET y GET;
	public float getPagoTrabajo() {
		return pagoTrabajo;
	}
	public void setPagoTrabajo(float pagoTrabajo) {
		this.pagoTrabajo = pagoTrabajo;
	}
	public float getPagoExtra() {
		return pagoExtra;
	}
	public void setPagoExtra(float pagoExtra) {
		this.pagoExtra = pagoExtra;
	}
	public float getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public float getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(float sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	public float SueldoBruto(float horasTrabajo, float horasExtras) {
		this.sueldoBruto = (horasTrabajo * pagoTrabajo)+(horasExtras * pagoExtra); 
		return sueldoBruto;
	}
	
	public float SueldoNeto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
		System.out.println("Sueldo Bruto" + sueldoBruto);
		if(sueldoBruto <= 2000 ) {
			this.sueldoNeto = sueldoBruto - (sueldoBruto * this.descuentoMenor);
		}
		if(sueldoBruto > 2000 ) {
			this.sueldoNeto = sueldoBruto - (sueldoBruto * this.descuentoMayor);
		}
		return sueldoNeto;
	}
		
}
