package Escuela;

public class Prueba {
    static public void main(String args[]) {
        
        EscuelaNva esc = new EscuelaNva();                          
        System.out.println(esc.Edad_Promedio_Profesores());
         
        esc.Lee_Profesores();       
        System.out.println(esc.Edad_Promedio_Profesores());
        
        esc.Lee_Profesores();       
        System.out.println(esc.Edad_Promedio_Profesores());
    
        

    }
}
