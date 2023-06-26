package casaCambio;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class MainTipoCambio {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String monedaConversion;
		Scanner leer = new Scanner(System.in);
		double monto;
		double montoConversion;
		double cambio;
		String formatoDecimales = "#,###,###,###,###.00";
		Moneda moneda = new Moneda();
		Conversion conversion = new Conversion();
		DecimalFormat formato = new DecimalFormat(formatoDecimales);
		
		
		System.out.println("Bienvenido a la CASA DE CAMBIO");
		System.out.println("*******************************");
		System.out.println();
		System.out.println("Se tiene las siguientes monedas de cambio: ");
		System.out.println("*************** Pesos ***********************");
		System.out.println("*************** Soles ***********************");
		System.out.println("*************** Quetzal *********************");
		System.out.println("*************** Dolares *********************");
		
		System.out.print("Ingresa el nombre de la MONEDA BASE: ");
		moneda.setNombreMoneda(leer.nextLine());
		
		System.out.print("Ingresa el nombre de la MONEDA DE CONVERSIÓN: ");
		moneda.setCambioMoneda(leer.nextLine());
		
		if (moneda.ValidaMoneda(moneda.getNombreMoneda(), moneda.getCambioMoneda())) {
			
			try {
					System.out.println("Ingresa el monto de la moneda base "+moneda.getNombreMoneda()+" a la moneda de cambio "+ moneda.getCambioMoneda());
					monto = leer.nextDouble();
					
					leer.close();
					
					cambio = moneda.TipoCambio(moneda.getNombreMoneda(), moneda.getCambioMoneda());
			
					montoConversion = conversion.Convierte(cambio, monto);
				
					System.out.println("LOS $"+ formato.format(monto)+" "+ moneda.getNombreMoneda()+ "-- SON A --->> $"+formato.format(montoConversion)+" "+moneda.getCambioMoneda());
					
				}catch (InputMismatchException ex) {
					System.out.print("INGRESA UN MONTO VALIDO");
				}
			}else {
				System.out.println("NOMBRE DE MONEDAS NO VALIDAS");
			}	
		}
}
