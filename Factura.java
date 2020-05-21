/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRC;

import java.util.ArrayList;

/**
 *
 * @author felix
 */
public class Factura {
	private Cliente datosCliente;
	private Fecha datosFecha; //<-------
	private ArrayList<Partida> items;

	public Factura(Cliente unCliente, Fecha unaFecha) { //<--------
		items = new ArrayList<Partida>();
		datosCliente = unCliente;
		datosFecha = unaFecha; //<---------
	}

	public void agrega(Producto unProducto, int unaCantidad) {
		items.add(new Partida(unProducto, unaCantidad));
	}

	public double obtenCantidadDebida() {
		double cant = 0;

		for (Partida i : items)
			cant += i.obtenPrecioTotal();

		return cant;
	}

	public String formato() {
		String r = "                     F a c t u r a \n\n" +  datosFecha.toString() +"\n"+ "\n"+ datosCliente.toString()
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Descripcion", "Precio", "Cdad", "Total");

		for (Partida i : items)
			r += i.toString() + "\n";

		r += String.format("\nCANTIDAD TOTAL A PAGAR: $%8.2f", obtenCantidadDebida());

		return r;
	}

	@Override
	public String toString() {
		return formato();
	}
}
