package calculadoraIVA;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainCalculadoraIVA {
	
	public static void main(String[] args) {
		double aplicadoIVA;
		double aplicadoDescuento;
		double descuentoEfectivo;
		String formatoDecimales = "#,###,###.00";
		NumberFormat formatoDescuento = NumberFormat.getPercentInstance();
		
		Scanner leer = new Scanner(System.in);
		Iva precioIVA = new Iva();
		Precio precioDescuento = new Precio();
		DecimalFormat formato = new DecimalFormat(formatoDecimales);
		
		//MENÚ
		System.out.println("-------------------------- MENÚ ----------------------------------------");
		System.out.println("CALCULADORA DE IVA");
		System.out.println("SI EL MONTO DEL IVA SUPERA LOS $50 SE HARÁ UN DESCUENTO DEL 10%");
		System.out.println("SI EL MONTO DEL IVA ES MENOR O IGUAL A $50 SE HARA UN DESCUENTO DEL 5%");
		System.out.println("************************************************************************");
		System.out.print("Ingresa el PRECIO: ");
		try {
		precioIVA.setMonto(leer.nextDouble());
		}catch(InputMismatchException ex) {
			System.out.println("Ingresa un CANTIDAD VALIDA");
		}
		System.out.println("Ingresa el IVA con el que trabajarás (POR DEFAULT EL IVA ESTA ASIGNADO EN 16%): ");
		try {
		precioIVA.setIva(leer.nextDouble());
		}catch (InputMismatchException ex) {
			System.out.println("Ingresa un PORCENTAJE");
		}
		//CACALCULO DEL PRECIO APLICANOD EL IVA
		aplicadoIVA = precioIVA.MontoMasIVA(precioIVA.getMonto(), precioIVA.getIva());
		
		//APLICANDO EL DESCUENTO
		aplicadoDescuento = precioDescuento.Descuento(precioIVA.getMonto(), precioIVA.getIva(), precioIVA.getMontoMasIVA());
		descuentoEfectivo = precioDescuento.DescuentoAplicado(precioDescuento.getMontoDelIVA());
		
		System.out.println("LE PRECIO ANTES DE IVA FUE DE $"+formato.format(precioIVA.getMonto())+" Y EL IVA QUE SE APLICO FUE DE: "+ formatoDescuento.format(precioIVA.getIva()));
		System.out.println("EL PRECIO + IVA ES DE: $"+formato.format(aplicadoIVA));
		System.out.println("EL MONTO DEL IVA FUE DE $"+formato.format(precioDescuento.getMontoDelIVA()));
		System.out.println("EL DESCUENTO QUE SE APLICO FUE DE: "+formatoDescuento.format(descuentoEfectivo)); 
		System.out.println("POR LO TANTO EL NUEVO PRECIO CON EL DESCUENTO APLICADO ES DE: $"+formato.format(aplicadoDescuento));
		leer.close();
	}

}
