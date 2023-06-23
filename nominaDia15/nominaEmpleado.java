package nominaDia15;
import java.util.InputMismatchException;
import java.util.Scanner;

public class nominaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoEmpleado empleado = new InfoEmpleado();
		Nomina pagos = new Nomina();
		Scanner leer = new Scanner(System.in);
		float bruto;
		float neto;
		
		try {
			System.out.print("Ingresa el NOMBRE del EMPLEADO:");
			empleado.setNombre(leer.next());
			System.out.print("Ingresa el PUESTO del EMPLEADO:");
			empleado.setPuesto(leer.next());
			
			System.out.println("-----HORAS TRABAJADAS Y EXTRAS------");
			System.out.print("Ingresa el CANTIDAD HORAS REGULARES del EMPLEADO:");
			empleado.setHorasTrabajo(leer.nextFloat());
			System.out.print("Ingresa el CANTIDAD HORAS EXTRAS del EMPLEADO:");
			empleado.setHorasExtras(leer.nextFloat());
			
			System.out.println("-----CALCULO DE PAGO BRUTO Y NETO------");
			bruto = pagos.SueldoBruto(empleado.getHorasTrabajo(), empleado.getHorasExtras());
			neto = pagos.SueldoNeto(bruto);
			System.out.println("EL SUELDO BRUTO ES: "+ bruto);
			System.out.println("EL SUELDO NETO ES: "+ neto);
		}catch(InputMismatchException ex){
			System.out.println("Ingresa datos validos");
		}
		
	}

}
