package empresa;

public abstract class Persona {

	//Variables
	private String nombre;
	private String apellido;
	private int edad;
	private Dni dni;
	
	//Contructores
	
	public Persona(String nombre, String apellido, int edad, Dni dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public Persona() {
		super();
	}
	
	
	
	//Metodos Getter and Setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	
}
