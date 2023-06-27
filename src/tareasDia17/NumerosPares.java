package tareasDia17;

public class NumerosPares {
	int numeroDe;
	
	public void ImprimirNumPares(int numeroDe) {
		this.numeroDe = numeroDe;

		for (int i = 1; numeroDe !=0 ; i++) {
			if (i % 2 == 0) {
				System.out.print(i+"|");
				numeroDe--;
			}
		}
		System.out.println("");
	}
	
}
