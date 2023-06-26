package calculadoraIVA;

public class Precio {
	private double precioConIVA;
	private double precioSinIVA;
	private double ivaAplicado;
	private double montoDelIVA; 
	private double montoConDescuento;
	private double descuentoMayor = 0.10000;
	private double descuentoMenor = 0.05000;
	private double descuento;
	
	
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getDescuentoMayor() {
		return descuentoMayor;
	}
	public void setDescuentoMayor(double descuentoMayor) {
		this.descuentoMayor = descuentoMayor;
	}
	public double getDescuentoMenor() {
		return descuentoMenor;
	}
	public void setDescuentoMenor(double descuentoMenor) {
		this.descuentoMenor = descuentoMenor;
	}
	public double getPrecioSinIVA() {
		return precioSinIVA;
	}
	public void setPrecioSinIVA(double precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}

	public double getIvaAplicado() {
		return ivaAplicado;
	}
	public void setIvaAplicado(double ivaAplicado) {
		this.ivaAplicado = ivaAplicado;
	}
	public double getMontoDelIVA() {
		return montoDelIVA;
	}
	public void setMontoDelIVA(double montoDelIVA) {
		this.montoDelIVA = montoDelIVA;
	}
	public double getMontoConDescuento() {
		return montoConDescuento;
	}
	public void setMontoConDescuento(double montoConDescuento) {
		this.montoConDescuento = montoConDescuento;
	}
	
	public double getPrecioConIVA() {
		return precioConIVA;
	}
	public void setPrecioConIVA(double precioConIVA) {
		this.precioConIVA = precioConIVA;
	}
	//APLICA EL DESCUENTO
	public double Descuento(double precioSinIVA, double ivaAplicado, double precioConIVA) {
		this.precioSinIVA = precioSinIVA;
		this.ivaAplicado = ivaAplicado;
		this.precioConIVA = precioConIVA;
		
		this.montoDelIVA = precioSinIVA * ivaAplicado;
		
		if(montoDelIVA > 50) {
			this.montoConDescuento = precioConIVA - (precioConIVA * descuentoMayor);
			
		}else if (montoDelIVA <= 50) {
			this.montoConDescuento = precioConIVA - (precioConIVA * descuentoMenor);
			
		}
		return montoConDescuento;
	}
	
	public double DescuentoAplicado(double montoDelIVA) {
		if(montoDelIVA > 50) {
			//System.out.println("MAYOR");
			this.descuento = this.descuentoMayor;
		}else if(montoDelIVA <= 50) {
			//System.out.println("MENOR");
			this.descuento = this.descuentoMenor;
		}
		return descuento;
	}
}
