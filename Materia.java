/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

/**
 *
 * @author felix
 */
public class Materia {
    private String clave_materia;
    private String descripcion;
    private int horas;
    private int grado;
    
    public Materia(String unaClave, String unaDesc, int unaHora, int unGrado) {
        clave_materia = unaClave;
        descripcion = unaDesc;
        horas = unaHora > 0 ? unaHora : 1;
        grado = unGrado > 0 ? unGrado : 1;
    }
    
    public String Informacion() {
        return clave_materia + " " + descripcion + "\n";
    }
    
    public String getdescripcion(){
        return descripcion;
    }
    
    public String getClave(){
        return clave_materia;
    }
    
    @Override
    public String toString() {
       return Informacion(); 
    }
    
    @Override
    public boolean equals(Object o) {
        if(o==null) return false;
        if(o.getClass() != this.getClass()) return false;
        if(this == o) return true;
        
        Materia aux = (Materia) o;
        
        return aux.clave_materia.equals(this.clave_materia);   
    }
}
