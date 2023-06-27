package tareasDia17;

public class NumerosNaturales {
	private int cantidad;
	private int suma;
	
	public void SumaPrimerosNNaturales(int cantidad) {
		this.cantidad = cantidad;
		
		for (int i=1; i <= cantidad; i++) {
			suma = suma + i;
		}
		
		System.out.println("LA SUMA DE LOS >>>> "+cantidad+" <<<< MUMEROS NATURALES USANDO FOR ES DE >>>> "+suma);
	}
	
	public void FormulaSumaNNaturales(int n) {
		this.cantidad = n;
		suma = (n*(n+1))/2;
		System.out.println("SUMA DE LOS --->"+cantidad+"<--- NUMEROS NATUTALES USANDO GAUSS ES DE --->"+suma);
		
	}
}
