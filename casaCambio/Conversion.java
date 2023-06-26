package casaCambio;

public class Conversion {
	private double tipoCambio;
	private double monto;
	//private double base = 1;
	private double conversion;
	
	//GET y SET
	
	
	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getConversion() {
		return conversion;
	}

	public void setConversion(double conversion) {
		this.conversion = conversion;
	}

	//base = 1 --- tipoCambio
	//monto --- x
	public double Convierte(double tipoCambio, double monto) {
			this.conversion = (monto * tipoCambio);
			return conversion;
	}
	
}
