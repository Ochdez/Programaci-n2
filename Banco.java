package Cajero;
import java.util.ArrayList;
import Escuela.*;

public class Banco {
	/**
	 * Lista d clientes del Banco.
	 */
	private ArrayList <Cliente> Clientes;
	/**
	 * Variable correspondiente al nombre del bonco.
	 */
	private String Nombre;
	/**
	 * Constructor de la clase Banco.	
	 * @param unNombre Parametro de tipo String que asignará el nombre al Banco.
	 */
	public Banco(String unNombre){	
		Nombre = unNombre;
		Clientes = new ArrayList<Cliente>();		
		//leeClientes();
				
	}
	/**
	 * Metodo para agregar un cliente a la lista de Clientes correspondiente al Banco.
	 * @param unCliente Parametro de tipo Cliente.
	 */
	public void agregarCliente(Cliente unCliente) {
		Clientes.add(unCliente);
	}
	/**
	 * Metodo para agregar una cantidad definida de Clientes a la lista de Clientes.
	 */
	public void leeClientes() { 
		int N=100,m=1;
		EscuelaFIE esc = new EscuelaFIE();
		
		for(int i=0; i<N; i++) { 
		
			agregarCliente( new Cliente(esc.nombres[esc.NumAle(1,50)], esc.apellidos[esc.NumAle(1,50)],
                    esc.apellidos[esc.NumAle(1,50)], " ", " ", " ", "Morelia", "Michoacan", 
                    "CP", esc.FechaAle(1950, 1985), m++, esc.NumAle(1000,100), esc.NumAle(100,10000)));
		}
	
		
	}
	/**
	 * Muestra la lista de Clientes del Banco. 
	 */
	public String toString() {
		String aux ="";
		int n=0;
		for(Cliente i : Clientes) {
			n++;
			aux += n + ": " + i.toString() + "\nSaldo: "+ i.cuenta_de_Ahorros.obtenSaldo() + "\n\n";
		}
		return aux;
	}
	/**
	 * Metodo para buscar un cliente a partir de un numero de cliente y una clave.
	 * @param unNumero Parámetro de tipo entero corespondiente al numero de cliente que buscamos.
	 * @param unaClave Parámetro de tipo entero correspondiente a la clave del cliente que buscamos.
	 * @return Un Cliente
	 */
	public Cliente buscaCliente(int unNumero, int unaClave) {
		for(Cliente i: Clientes) 
			if(i.empata(unNumero, unaClave)) return i;
		
		return null;
		
	}
}
