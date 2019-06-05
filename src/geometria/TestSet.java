package geometria;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {


		Punto punto1= new Punto(1,2);
		Punto punto2= new Punto(1,2);
		Punto punto3= new Punto(5,6);
		
		//Cargar el SET
		Set<Punto> setPuntos= new HashSet<Punto>();
		setPuntos.add(punto1);
		boolean anyadido= setPuntos.add(punto2);
		setPuntos.add(punto3);
		
		//Recorrer el SET
		Iterator<Punto> iterator= setPuntos.iterator();
		boolean hayMas= iterator.hasNext();
		
		while(hayMas) {
			
			Punto punto =iterator.next();
			System.out.println(punto);
			hayMas= iterator.hasNext();
		}
		
		
		
		System.out.println(punto1==punto2);
		System.out.println(punto1.equals (punto2));
		
		
	
	}

}
