package empresa;

import geometria.Punto;

public abstract class Empleado extends Persona implements Comparable<Empleado> {

	private int codEmpleado;
	private static int numEmpleados = 0;
	private double sueldo;

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);

		this.sueldo = sueldo;

		numEmpleados++;
		this.codEmpleado = numEmpleados;

	}

	public Empleado() {

		numEmpleados++;
		this.codEmpleado = numEmpleados;
	}

	// Metodos

	void trabajar() {

	}

	public double obtenersueldo() {

		return sueldo;
	}

//Metodo GETTER

	public int getCodEmpleado() {
		return codEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", numEmpleados=" + numEmpleados + "Nombre " + getNombre()
				+ " Apellido " + getApellido() + " Edad " + getEdad() + " , sueldo=" + sueldo + "]";
	}

	public int compareTo(Empleado empleado) {
		return ((Integer) this.codEmpleado).compareTo(empleado.getCodEmpleado());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codEmpleado;
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (codEmpleado != other.codEmpleado)
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}

}
