package calculadoraIVA;

public class Iva {
	private double iva = 0.160000;
	private double monto;
	private double montoMasIVA;

	public double getMontoMasIVA() {
		return montoMasIVA;
	}

	public void setMontoMasIVA(double montoMasIVA) {
		this.montoMasIVA = montoMasIVA;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public double MontoMasIVA(double monto, double iva) {
		this.monto = monto;
		
		if(iva > 1) {
			this.iva = iva/100;
		}
		
		this.montoMasIVA = monto + (monto * this.iva);
		
		return montoMasIVA;
	}
	
	
}
