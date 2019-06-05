package empresa;

public class GestionTrabajo {

	public static void tratarEmpleado(Empleado empleado) {
		
		empleado.trabajar();
		
		if(empleado instanceof Ingeniero) {
			
			Ingeniero.disenyar();
			
			System.out.println("Es ingeniero");
		}
		
	}
	
	
	
	
}
