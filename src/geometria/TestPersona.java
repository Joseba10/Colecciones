package geometria;

import java.util.ArrayList;
import java.util.List;

import empresa.Administrativo;
import empresa.Dni;
import empresa.Ingeniero;
import empresa.Persona;

public class TestPersona {

	public static void main(String[] args) {

		List<Persona> listaPersonas = crearListaPersonas();
		recorrerListaPersonas(listaPersonas);
		Persona personaBuscar = buscarPersonaPorDni(listaPersonas, "123456789-D");
		System.out.println(personaBuscar);
	}

	public static List<Persona> crearListaPersonas() {

		List<Persona> listaPersonas = new ArrayList<Persona>();
		Dni dni = new Dni(123456789, 'D');
		Dni dni2 = new Dni(123456589, 'A');

		Administrativo administrativo = new Administrativo("Juan", "Ramirez", 42, dni, 2200);
		Ingeniero ingeniero = new Ingeniero("Ricardo", "Costa", 32, dni, 3200);

		listaPersonas.add(administrativo);
		listaPersonas.add(ingeniero);
		return listaPersonas;

	}

	public static void recorrerListaPersonas(List<Persona> listapersonas) {

		for (int i = 0; i < listapersonas.size(); i++) {
			Persona persona = listapersonas.get(i);
			System.out.println(persona);
		}
	}

	public static Persona buscarPersonaPorDni(List<Persona> listaPersonas, String dni) {

		Persona persona = null;

		boolean encontrado = false;
		int i = 0;

		while ((i < listaPersonas.size() && (!encontrado))) {

			if (listaPersonas.get(i).getDni().toString().equals(dni)) {

				encontrado = true;

			} else {

				i = i + 1;
			}
			if (!encontrado) {
				persona = null;

			} else {

				persona = listaPersonas.get(i);
			}

			
		}
		return persona;

	}

}
