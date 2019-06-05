package geometria;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main (String[] args) {
		
		Punto punto1= new Punto(1,2);
		Punto punto2= new Punto(1,2);
		Punto punto3= new Punto(5,6);
		
		//Cargar Lista
		List<Punto> listaPuntos= new ArrayList<Punto>();
		listaPuntos.add(punto1);
		listaPuntos.add(punto2);
		listaPuntos.add(punto3);
		
		//Recorrer Lista
		
		for (int i = 0; i < listaPuntos.size(); i++) {
			Punto punto = listaPuntos.get(i);
			System.out.println(punto);
		}

	}
}
