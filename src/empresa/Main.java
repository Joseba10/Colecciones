package empresa;

public class Main {

	public static void main(String[] args) {

		Dni dni= new Dni(123456789, 'D');

		Administrativo administrativo= new Administrativo("Juan", "Ramirez", 45, dni, 2000);
		
		administrativo.trabajar();
		
		Tecnico tecnico= new Tecnico("Ramon", "Hernandez", 56, dni, 2600);
		
		tecnico.trabajar();
		
		Ingeniero ingeniero= new Ingeniero("Peyo","Dominguez", 23, dni,3000);
		
		System.out.println(administrativo);
		System.out.println(tecnico);
		System.out.println(ingeniero);
		
		
		ingeniero.trabajar();
		
		administrativo.obtenersueldo();
		tecnico.obtenersueldo();
		ingeniero.obtenersueldo();
		
		GestionTrabajo.tratarEmpleado(ingeniero);
		GestionTrabajo.tratarEmpleado(tecnico);
		GestionTrabajo.tratarEmpleado(administrativo);
		
	
		System.out.println("Sueldo del Administrativo " +administrativo.obtenersueldo());
		System.out.println("Sueldo del tecnico " +tecnico.obtenersueldo());
		System.out.println("Sueldo del ingeniero " +ingeniero.obtenersueldo());
		
		
		
		
	}

}
