package Escuela;

import java.util.Calendar;

public class Persona {
	protected String Nombre;
	protected String ApellidoPaterno;
	protected String ApellidoMaterno;
	protected String Calle;
	protected String NumExterior;
	protected String Colonia;
	protected String Ciudad;
	protected String Estado;
	protected String CP;
	protected Fecha FechaNacimiento; 
    
    public Persona(String unNombre, String Paterno, String Materno, String unaCalle, String numExterior, 
    		String unaColonia, String unCiudad, String unEstado, String unCP, Fecha unaFecha ) {
        Nombre = unNombre;
        ApellidoPaterno = Paterno;
        ApellidoMaterno = Materno;
        Calle = unaCalle;
        NumExterior = numExterior;
        Colonia = unaColonia;
        Ciudad = unCiudad;
        Estado = unEstado;
        CP = unCP;
        FechaNacimiento = unaFecha;
               
    }
    
    
   public String formato() {
	   return Nombre + "\n" + Calle + " " + NumExterior + "\n" + Ciudad + " " + Estado + " " + CP;
   }
   
   public String toString() {
   	return formato();
   }
   
   public double Edad() {

	   double mesEdad, diaEdad, a�oEdad;
	   
	   Calendar cal = Calendar.getInstance();
	   int a�oActual = cal.get(Calendar.YEAR);
	   int mesActual = cal.get(Calendar.MONTH);
	   int diaActual = cal.get(Calendar.DATE);
	   Fecha f = new Fecha(diaActual,mesActual+1,a�oActual);
	  
	   double a�oNacimiento = FechaNacimiento.a�o();
	   double mesNacimiento = FechaNacimiento.mes();
	   double diaNacimiento = FechaNacimiento.dia();
	   
	   if(diaActual < diaNacimiento) {
		   diaEdad = f.diasdelMes() + diaActual - diaNacimiento;
		   //diasdelMes() es una funci�n de la clas Fecha con la que obtengo los d�as de cada mes.
	   }else {
		   mesActual += 1;
		   diaEdad = diaActual - diaNacimiento;
	   }
	   
	   if(mesActual < mesNacimiento) {
		   mesEdad = 12 + mesActual - mesNacimiento;
		   a�oActual -= 1;
	   }else {
		   mesEdad = mesActual - mesNacimiento;
	   }
	   
	   a�oEdad = a�oActual - a�oNacimiento;	   
	  
	   return a�oEdad;
	   	   
   }
   
   public String  informacion() {
	   return ApellidoPaterno + " " + ApellidoMaterno + " " + Nombre;
   }
    
   public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        
        Persona nueva = (Persona) obj;
        
        return Nombre == nueva.Nombre && 
        		ApellidoPaterno == nueva.ApellidoPaterno &&
                ApellidoMaterno == nueva.ApellidoMaterno;
    }
    
                  
}
