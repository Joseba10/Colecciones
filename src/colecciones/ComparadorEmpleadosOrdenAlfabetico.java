package colecciones;

import java.util.Comparator;

import empresa.Empleado;

public class ComparadorEmpleadosOrdenAlfabetico implements Comparator<Empleado> {

	@Override
	public int compare(Empleado empleado1, Empleado empleado2) {
		String nombreCompleto1 = empleado1.getApellido() + " " + empleado1.getNombre();
		String nombreCompleto2 = empleado2.getApellido() + " " + empleado2.getNombre();
		return nombreCompleto1.compareTo(nombreCompleto2);
	}

}
