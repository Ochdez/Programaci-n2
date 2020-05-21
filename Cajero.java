/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Cajero;

public class Cajero {
	protected Banco elBanco;
    private int estado;
    private int NumeroCliente;
    private Cliente ClienteActual;
    private Cuenta CuentaActual;   
    
    public static final int ESTADO_INICIAL = 1;
    public static final int ESTADO_CLAVE = 2;
    public static final int ESTADO_CUENTA = 3;
    public static final int ESTADO_TRANSACCION = 4;

    public static final int CUENTA_DE_CHEQUES = 1;
    public static final int CUENTA_DE_AHORROS = 2;
    
    /**
     * Constructor para el Cajero de un Banco
     */
    
    public Cajero()
    {  
      elBanco = new Banco("bbva");
      elBanco.leeClientes();
      estado = ESTADO_INICIAL;
    }
    
    /**
     * Permite ver el estado de la operacion en la que se encuentra el cajero
     * @return estado
     */
    
    public int verEstado() {
        return estado;
    }
    
    /**
     * Despliega las opciones dialogo para el estado actual de las operaciones
     * y modifica el estado.
     * @param estadoNuevo Estado nuevo
     */
  
    public void muestraEstado(int estadoNuevo)
    {  
        estado = estadoNuevo;

        if (estado == ESTADO_INICIAL)
         System.out.println("Ingrese un Numero de Cliente ");
        else if (estado == ESTADO_CLAVE)
         System.out.println("Ingrese su Clave : ");
        else if (estado == ESTADO_CUENTA)
         System.out.println("Seleccione tipo de Cuenta\n" 
           + "A = Cheques\nB = Ahorros\nC = Salir\n");
        else if (estado == ESTADO_TRANSACCION)
         System.out.println("Saldo  = " 
            + CuentaActual.obtenSaldo()
            + "\n\nSeleccione una Operacion\n"
            + "A = Deposito\nB = Retiro\nC = Regresar\n");
    } 
    
    /**
     * Asigna un numero de cliente 
     * @param unCliente numero de cliente
     */

    public void ponNumeroCliente(int unCliente) 
    {  
        NumeroCliente = unCliente;
        estado = ESTADO_CLAVE;
    }
    
    /**
     * Busca que exista un cliente para una cuenta dada y una clave dad
     * @param unaClave Clave del Cliente
     */

    public void selecionaCliente(int unaClave)
    {  

        ClienteActual = elBanco.buscaCliente(NumeroCliente, unaClave);

        if (ClienteActual == null) 
            estado = ESTADO_INICIAL;
        else 
            estado = ESTADO_CUENTA;
    }
    
    /**
     * Permite cambiar a una cuenta de Cheques o de Ahorros
     * @param unaCuenta Cuenta 
     */

    public void selecionaCuenta(int unaCuenta)
    {
        if (unaCuenta == CUENTA_DE_CHEQUES)
            CuentaActual = ClienteActual.obten_cuenta_de_Cheques();
        else
            CuentaActual = ClienteActual.obten_cuenta_de_Ahorros();
        muestraEstado(ESTADO_TRANSACCION);
    }
    
    /**
     * Efectua un retiro de la cuenta actual 
     * @param miRetiro Cantidad a retirar
     */

    public void retiro(double miRetiro)
    {  
        CuentaActual.retiro(miRetiro);
        muestraEstado(ESTADO_CUENTA);
    }

    /** 
      depositos amount typed in keypad to current account. 
      Sets estado to ACCOUNT. 
    */

    public void deposito(double miDeposito)
    {  
        CuentaActual.deposito(miDeposito);
        muestraEstado(ESTADO_CUENTA);
    }
       
    public double muestraSaldo() {
        return CuentaActual.obtenSaldo();
    }
    
    public void salir() {
        estado = ESTADO_INICIAL;
    }  
}
