package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejadorOrdenador,Arreglador{
public static final int PORCENTAJE_MAXIMO_SUBIDA=20;
	public Ingeniero(String nombre, String apellido, int edad, Dni dni,double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);

	}
	
	
	void Ingerniero(){
		
	}


	@Override
	public void arreglar() {
		System.out.println("Arreglar");
	}

	@Override
	public void teclear() {
		
		System.out.println("Teclear");
	
		
	}
	@Override
	public void trabajar() {
	
		
	}
	

public double obtenersueldo() {
	  
	Random random = new Random();
	int porcentajesubida= random.nextInt(PORCENTAJE_MAXIMO_SUBIDA+1);
	
	return super.obtenersueldo()*(1+(double)porcentajesubida/(double)100);
}

static void disenyar() {
System.out.println("Diseñar");
}



}
