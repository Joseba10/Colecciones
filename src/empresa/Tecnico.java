package empresa;

public  class Tecnico extends Empleado implements Arreglador {

	public Tecnico(String nombre, String apellido, int edad, Dni dni,double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);
		
	}

	void Tecnico() {
	}
	void trabajar() {
		
	}

	@Override
	public void arreglar() {
		System.out.println("Arreglar");
			
	}

	
	

}
