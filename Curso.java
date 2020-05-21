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
public class Curso {
    protected Materia materia;
    protected int calificacion;
    protected String seccion;
    
    public Curso(Materia unaMateria, String unaSeccion, int unaCalificacion) {
        
        materia = unaMateria;
        calificacion = unaCalificacion >=0 ? unaCalificacion : 0;
        seccion = unaSeccion;
    }
    
    public String getClave(){
        return materia.getClave();
    }
    
    public String getDescripcion() {
        return materia.getdescripcion();
    }
    
    public String informacion(){
        return materia.getdescripcion() + " " + calificacion + "\n";
    }
    
    public String toString() {
        return informacion();
    }
}
