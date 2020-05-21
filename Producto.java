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
public class Producto {
	private String descripcion;
	private double precio;

	Producto(String unaDescripcion, double unPrecio) {
		descripcion = unaDescripcion;
		precio = unPrecio > 0 ? unPrecio : 0;
	}

	public String obtenDescripcion() {
		return descripcion;
	}

	public double obtenPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return descripcion + " " + precio;
	}

	@Override
	public boolean equals(Object a) {
		if (a == null)
			return false;
		if (this == a)
			return true;
		if (this.getClass() != a.getClass())
			return false;

		Producto aux = (Producto) a;

		return descripcion.equals(aux.descripcion) && precio == aux.precio;
	}

}
