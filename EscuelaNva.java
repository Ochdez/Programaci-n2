package Escuela;

public class EscuelaNva extends EscuelaFIE {
	
	public double Edad_Promedio_Profesores() {
		double Edad=0, n=0;
		double promedio;
		for(Profesor i: Profesores) {
			Edad += i.Edad();
			n++;			
		}
		promedio = Edad/n;
		return promedio;
	}

}
