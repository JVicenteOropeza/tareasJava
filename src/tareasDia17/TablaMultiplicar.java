package tareasDia17;

public class TablaMultiplicar {
	private double factor;
	private double multiplicado;
	
	public void Multiplica(double factor) {
		this.setFactor(factor);
		int limTabla = 10;

		for (int i = 1; i <= limTabla; i++) {
			this.multiplicado = factor * i;
			System.out.println(i+" x "+factor+" = "+multiplicado);
		}
		
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}
}
