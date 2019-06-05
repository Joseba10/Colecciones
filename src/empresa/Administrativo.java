package empresa;

public class Administrativo extends Empleado implements ManejadorOrdenador{

	public Administrativo(String nombre, String apellido, int edad, Dni dni,double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
	
	}
	
	void Administrativo() {
	}

	@Override
	public void teclear() {
		
		System.out.println("Teclear");
	}

	public void trabajar() {
		teclear();
		
	}

	
}
