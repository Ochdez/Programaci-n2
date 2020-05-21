package Escuela;
import java.util.ArrayList;

public class Profesor extends Persona {
    protected String Clave_Profesor;
    protected  ArrayList <Materia> Lista_Materias;
    
    public Profesor(String unNombre, String unPaterno, String unMaterno, String unaCalle, 
            String unNumE, String unaColonia, String unaCiudad, String unEstado, String unCP, 
            Fecha unaFecha, String unaClave ) {
        super(unNombre, unPaterno, unMaterno, unaCalle, unNumE, unaColonia, 
                unaCiudad, unEstado, unCP, unaFecha);
            Clave_Profesor = unaClave;
            
            Lista_Materias = new ArrayList<Materia>();
    }
    
    public void agrega_materia(Materia unaMateria) {
        Lista_Materias.add(unaMateria);
    }
    
    public String informacion() {
        String aux;
        
        aux = String.format("%-8s %-32s \n", Clave_Profesor, super.informacion());
        
        return aux;
    }
    
    public String toString(){
        String aux;
        aux = informacion();
        
        for(Materia i: Lista_Materias) 
            aux += i.toString();
        
        return aux;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o==null) return false;
        if(o.getClass() != this.getClass()) return false;
        if(this == o) return true;
        
        Profesor aux = (Profesor) o;
        
        return aux.Clave_Profesor.equals(this.Clave_Profesor); 
    }
}
