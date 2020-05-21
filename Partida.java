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
public class Partida {
	private Producto elProducto;
	private int cantidad;

	public Partida(Producto unProducto, int unaCantidad) {
		elProducto = unProducto;
		cantidad = unaCantidad >= 0 ? unaCantidad : 0;
	}

	public double obtenPrecioTotal() {
		return elProducto.obtenPrecio() * cantidad;
	}

	public String formato() {
		return String.format("%-30s%8.2f%5d%8.2f", elProducto.obtenDescripcion(), elProducto.obtenPrecio(), cantidad,
				obtenPrecioTotal());
	}

	@Override
	public String toString() {
		return formato();
	}

	@Override
	public boolean equals(Object val) {
		if (val == null)
			return false;
		if (this == val)
			return true;
		if (this.getClass() != val.getClass())
			return false;

		Partida aux = (Partida) val;

		return elProducto.equals(aux.elProducto) && cantidad == aux.cantidad;
	}
}
