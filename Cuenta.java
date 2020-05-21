package Cajero;

public class Cuenta {
	private double saldo;
	/**
	 * Constructor de la clase Cuenta. su apertura está condicionada a un saldo inicial mínimo de 1000 pesos.
	 * @param saldoInicial Variable de tipo double que indica el saldo inicial de apertura de la cuenta.
	 */
	public Cuenta(double saldoInicial) {
		assert saldoInicial > 1000 : "No se puden abrir cuentas con menos de $1000";
		
		saldo = saldoInicial;
	}
	/**
	 * Deposita una cantidad en la cuenta.
	 * @param cantidad variable de típo double que indica la cantidad a depositar.
	 */
	public void deposito(double cantidad) {
		if(cantidad < 0) System.out.println("Se intento depositar una cantidad negativa");
		else
			saldo += cantidad;
	}
	/**
	 * Retira una cantidad de la cuenta. Si la cantidad a retirar es menor a la cantidad
	 * en la cuenta no se permitirá retirar nada.
	 * @param cantidad Variable de tipo double que indica la cantidad a retiral.
	 */
	public void retiro(double cantidad) {
		if(cantidad < 0) System.out.println("Se intento retirar una cantidad negativa");
		else {
			if(cantidad <= saldo)
				saldo -= cantidad;
			else {
				System.out.println("Saldo insuficiente en la cuenta");
			}
		}
	}
	/**
	 * Regresa el saldo que hay en la cuenta.
	 * @return double.
	 */
	public double obtenSaldo() {
		return saldo;
	}
	/**
	 * Regresa el saldo que hay en la cuenta.
	 */
	public String toString() {
		return "La cuenta tiene un saldo de: " + saldo;
	}
	
		
}
