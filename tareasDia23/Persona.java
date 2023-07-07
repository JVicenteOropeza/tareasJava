package tareasDia23;

public class Persona {
	private String nombre;
	private String edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	//Constructor
	public Persona(String nombre, String edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

}
