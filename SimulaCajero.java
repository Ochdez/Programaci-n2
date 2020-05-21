/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cajero;

import java.util.Locale;
import java.util.Scanner;

public class SimulaCajero {
    
    static public void main(String args[]) {
    		  	    	  	
        Cajero miCajero = new Cajero();            
        
        int estado = 0;
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
                
        while(true) {
            estado = miCajero.verEstado();
            if(estado == Cajero.ESTADO_INICIAL) {
                miCajero.muestraEstado(estado);

                int numero = in.nextInt();
                miCajero.ponNumeroCliente(numero);
            }
            else if(estado == Cajero.ESTADO_CLAVE) {
                miCajero.muestraEstado(estado);

                int numero = in.nextInt();
                miCajero.selecionaCliente(numero);
            }
            else if(estado == Cajero.ESTADO_CUENTA) {
                
                miCajero.muestraEstado(estado);
                
                String comando = in.next();
                
                if(comando.equalsIgnoreCase("A"))
                    miCajero.selecionaCuenta(Cajero.CUENTA_DE_CHEQUES);
                else if (comando.equalsIgnoreCase("B"))
                    miCajero.selecionaCuenta(Cajero.CUENTA_DE_AHORROS);
                else if(comando.equalsIgnoreCase("C"))
                    miCajero.muestraEstado(Cajero.ESTADO_INICIAL);
                else{
                    System.out.println("Entrada Ilegal ");
                }
            }
            
            else if(estado == Cajero.ESTADO_TRANSACCION) {
                miCajero.muestraEstado(estado);

                String comando = in.next();
                if(comando.equalsIgnoreCase("A")) {
                    System.out.print("Cantidad a Depositar ");
                    double monto = in.nextDouble();
                    miCajero.deposito(monto);
                }
                else if(comando.equalsIgnoreCase("B")) {                
                    System.out.print("Cantidad a Retirar ");
                    double monto = in.nextDouble();
                    miCajero.retiro(monto);
                }
                else if(comando.equalsIgnoreCase("C"))
                   miCajero.muestraEstado(Cajero.ESTADO_CUENTA);
                else {
                    System.out.println("Entrada ilegal ");
                    miCajero.muestraEstado(Cajero.ESTADO_TRANSACCION);
                }
            } 
        }
        
    }
}
