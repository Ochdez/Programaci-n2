/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.util.ArrayList;

public class Escuela {
    private String Nombre;
    private ArrayList <Alumno> Alumnos;
    private ArrayList <Profesor> Profesores;
    private ArrayList <Materia> Materias;
    
    public Escuela(String unNombre) {
        Nombre = unNombre;
        
        Alumnos = new ArrayList <Alumno> ();
        Profesores = new ArrayList <Profesor> ();
        Materias = new ArrayList <Materia>();
    }
    
    //public void Agrega_Alumno(Alumno unAlumno) {
      //  Alumnos.add(unAlumno);
    //}
    
    public void Agrega_Materia(Materia unaMateria) {
        Materias.add(unaMateria);
    }
    
    public void Agrega_Profesor(Profesor unProfesor) {
        Profesores.add(unProfesor);
    }
    
    void Lee_Materia() {
        Agrega_Materia(new Materia("m01", "Matematicas I", 5, 1));
        Agrega_Materia(new Materia("m02", "Matematicas II", 5, 2));
        Agrega_Materia(new Materia("m03", "Física I", 4, 1));
        Agrega_Materia(new Materia("m04", "Física II", 4, 2));
        Agrega_Materia(new Materia("m05", "Química", 3, 1));
        Agrega_Materia(new Materia("m06", "Programaciín de Computadoras", 3, 1));
        Agrega_Materia(new Materia("m07", "Algebra", 3, 1));
        Agrega_Materia(new Materia("m08", "Control", 3, 3));
        Agrega_Materia(new Materia("m09", "Circuitos", 3, 3));
        Agrega_Materia(new Materia("m10", "Electrónica I", 4, 3));
        Agrega_Materia(new Materia("m11", "Diseño", 3, 1));
        Agrega_Materia(new Materia("m12", "Métodos Numéricos", 3, 3));
    }
    
    Curso Nuevo(String unaClave, int unaCalificacion, String unaSeccion ) {
        int k;
        Materia aux;
        
        k = existeMateria(unaClave);
        
        if(k>=0) {
            aux = Materias.get(k);
            
            return new Curso(aux, unaSeccion, unaCalificacion);
        }
        
        return null;
        
    }
    
    int existeMateria(String unaClave) {
        int k =0;
        
        for(Materia i: Materias) {
            if(unaClave.equals(i.getClave())) return k;
            k++;
        }
        
        return -1;
    }
    
    public void Agrega_alumno(Alumno unA) {
        Alumnos.add(unA);
    }
    
    void Lee_Alumnos() {
       
    	Alumno aux = new Alumno("Juan", "Pérez", "López",
                "Lazaro Cardenas", "100", "Las Americas", "Morelia", "Michoacan", "58000", new Fecha(13, 03, 1990), "122kka");
        aux.agrega_Curso(Nuevo("m03", 10, "A"));
        aux.agrega_Curso(Nuevo("m05", 8, "A"));
        aux.agrega_Curso(Nuevo("m06", 7, "A"));
        aux.agrega_Curso(Nuevo("m12", 8, "A"));

        Agrega_alumno(aux);

        aux = new Alumno("Manuel", "Juárez", "Mena", 
                "Benito Juarez",  "134", "Villas del Gentillal", "Morelia", "Michoacan", "58032", new Fecha(14, 02, 1995), "8sdsdf8");
        aux.agrega_Curso(Nuevo("m03", 9, "A"));
        aux.agrega_Curso(Nuevo("m05", 8, "A"));
        aux.agrega_Curso(Nuevo("m06", 8, "A"));
        aux.agrega_Curso(Nuevo("m12", 8, "A"));
        aux.agrega_Curso(Nuevo("m07", 6, "A"));
        aux.agrega_Curso(Nuevo("m09", 10, "A"));
        aux.agrega_Curso(Nuevo("m01", 8, "A"));

        Agrega_alumno(aux);

        aux = new Alumno("Carla", "Medina", "Alvarez",
                "Calle s/n", "s/n", "Sin colonia", "Morelia", "Michacan", "",  new Fecha(30, 8, 1994), "02392d");

        aux.agrega_Curso(Nuevo("m01", 10, "A"));
        aux.agrega_Curso(Nuevo("m05", 8, "A"));
        aux.agrega_Curso(Nuevo("m08", 7, "A"));
        aux.agrega_Curso(Nuevo("m10", 7, "A"));
        aux.agrega_Curso(Nuevo("m12", 8, "A"));

        Agrega_alumno(aux);

        aux = new Alumno("Maria Luisa", "Rico", "Gomez",
                "Calle s/n",  "s/n1", "Sin colonia", "Morelia", "Michoacan", "", new Fecha(15, 11, 1994), "9234jja");

        aux.agrega_Curso(Nuevo("m11", 8, "A"));
        aux.agrega_Curso(Nuevo("m01", 8, "A"));

        Agrega_alumno(aux);       

        aux = new Alumno("Luis Manuel", "Arce", "Salas",
                "Calle s/n",  "s/n1", "Sin colonia", "Morelia", "Michoacan", "", new Fecha(30, 12, 1994), "8234jf");

        aux.agrega_Curso(Nuevo("m03", 8, "A"));
        aux.agrega_Curso(Nuevo("m01", 9, "A"));
        aux.agrega_Curso(Nuevo("m07", 7, "A"));

        Agrega_alumno(aux);
    }
    
    public void Lee_Profesores() {
        Profesor unProfe = new Profesor("Romario", "Ramirez", "Calderon","Lazaro Cardenas", "100-A", 
        		"Ventura Puente", "Morelia", "Michoacan", "58010", new Fecha(12, 12, 1912), "P234898d" );
        
        int mat;
        
        mat = existeMateria("m01");
        if(mat != -1) 
            unProfe.agrega_materia(Materias.get(mat));
        
        Agrega_Profesor(unProfe);
        
        unProfe = new Profesor("Honorio", "Rincon", "Lopez", "La lomita", "23", "Col el Porvenir", "Tarimbaro",
        "Michoacan", "59010", new Fecha(10, 3, 1972), "Plcsdff");
        
        mat = existeMateria("m03");
        if(mat != -1) 
            unProfe.agrega_materia(Materias.get(mat));   
        
        Agrega_Profesor(unProfe);
    }
    
    public String Promedios() {
    	String Aux="";
    	
    	for(Alumno i: Alumnos) {
    		
    		int sum=0, n=0, p;
    		Aux += i.informacion();
    		for(Curso j: i.Kardex) {
    			sum += j.calificacion;
    			n++;
    		}
    		p = sum/n;
    		if(sum/n > 5 && sum%n >= 2) p++;
    		Aux += " Promedio: " + p + "\n";    		   		
    	}
    	return Aux; 
    	
    }
    
    
    public String Lista_Alumnos_por_Materia() {
    	String aux="";
    	
    	for(Materia i: Materias) {
    		boolean coincide = false;		
    		int n;
    		for(Profesor j: Profesores) {
    			
    			for(Materia k: j.Lista_Materias) {
    				n=0;
    				if(k.getClave() == i.getClave()) {   					
    					coincide = true; 
    					aux += "\n" + "Profesor: " + j.informacion() + k.Informacion( ) + "\n" ;
    					
    					for(Alumno z: Alumnos){
    						
    						for(Curso y: z.Kardex) {
    						
    							if(y.materia.getClave() == k.getClave()) {
    								n++; 
        							aux += n + ". "+ z.informacion();
    							}
    							
    						}
    					}
    				}    				 					 				
    			}
    		}
    		if(!coincide) {    		
    			aux += "\n" + "Profesor: Materia sin profesor" + "\n" + i.Informacion();
    		}   		
    	}
    	return aux;    	
    }
    
    public String toString(){
        
        String aux;
        
        aux = this.Nombre + "\n\n";
        
        aux += "Las materias que se imparten son: \n\n";
        for(Materia i: Materias) 
            aux += "\t" + i.toString();
        
        
        aux += "Los profesore activos son: \n\n";
        
        for(Profesor p: Profesores)
            aux += "\t" + p.toString();
                
        return aux;
    }
    
}
