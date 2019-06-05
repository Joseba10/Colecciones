package geometria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;

public class TestMap2 {

	public static void main(String[] args) {

		Dni dni = new Dni(123456789, 'D');
		Dni dni2 = new Dni(123456589, 'A');
		Administrativo administrativo = new Administrativo("Juan", "Ramirez", 42, dni, 2200);
		Ingeniero ingeniero = new Ingeniero("Ricardo", "Costa", 32, dni, 3200);
		
		
		Map<Dni,Persona> mapPersonas= new HashMap<Dni,Persona>();
		
		mapPersonas.put(dni, administrativo);
		mapPersonas.put(dni2, ingeniero);
		
		//Buscar
		
		Dni dnipersonabuscar = new Dni(123456789, 'D');
		Persona personabuscar = mapPersonas.get(dnipersonabuscar);
		System.out.println(personabuscar);

		//Recorrer mapa
		
		Set<Dni> setClaves= mapPersonas.keySet();
		Iterator<Dni> iteradorClaves= setClaves.iterator();
		
		boolean hayMas= iteradorClaves.hasNext();
		
		Dni dni1= null;
		Persona persona= null;
		
		while(hayMas) {
			
			dni1= iteradorClaves.next();
			persona= mapPersonas.get(dni1);
			System.out.println(persona);
			hayMas= iteradorClaves.hasNext();
		}
	}

}
