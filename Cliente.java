/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRC;

/**
 *
 * @author felix
 */
public class Cliente {
	private String nombre;
	private String domicilio;
	private String ciudad;
	private String estado;
	private String CP;
	private Fecha Nacimiento;//<------

	public Cliente(String unNombre, Fecha unaFecha, String unDomicilio, String unaCiudad, String unEstado, String unCP) {
		nombre = unNombre;
		domicilio = unDomicilio;
		ciudad = unaCiudad;
		estado = unEstado;
		CP = unCP;
		Nacimiento = unaFecha; //<-----
	}

	public String formato() {
	return nombre + "\n" + Nacimiento + "\n" + domicilio + "\n" + ciudad + ", " + estado + " " + CP; //<----
	}

	@Override
	public String toString() {
		return formato();
	}

	@Override
	public boolean equals(Object v) {
		if (v == null)
			return false;
		if (this == v)
			return true;
		if (this.getClass() != v.getClass())
			return false;

		Cliente aux = (Cliente) v;

		return nombre.equals(aux.nombre);

	}

}
