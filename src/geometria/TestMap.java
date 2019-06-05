package geometria;

import java.util.HashMap;
import java.util.Map;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;

public class TestMap {
	public static void main(String[] args) {


		
		//CARGAR MAPA
		Map<String,Persona> mapPersonas= new HashMap<String,Persona>();
		Dni dni = new Dni(123456789, 'D');
		Dni dni2 = new Dni(123456589, 'A');

		Administrativo administrativo = new Administrativo("Juan", "Ramirez", 42, dni, 2200);
		Ingeniero ingeniero = new Ingeniero("Ricardo", "Costa", 32, dni, 3200);

		mapPersonas.put(administrativo.getDni().toString(), administrativo);
		mapPersonas.put(ingeniero.getDni().toString(),ingeniero);
		
		
		//Buscar
		Persona personabuscar = mapPersonas.get("123456789-D");
		System.out.println(personabuscar);
		
		
	}
}
