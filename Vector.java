package Vector;

public class Vector {
	int D;
	double array[];
	
	Vector(double unArray[]){
		array = unArray;		
	}
	Vector(int unEntero){
		D = unEntero;
	}
	
	public String toString() {
		String aux="";
		for(int i=0; i< array.length; i++) {
			aux += array[i] + ", ";
		}
		return aux;
	}
	
	public static Vector VectorUnitario(Vector a) {
		double r=0;
		double denominador;
		for(int i=0; i<a.array.length; i++) {
			r += a.array[i]*a.array[i];
		}
		denominador = Math.sqrt(r);
		double[] nuevoVector = new double[a.array.length];
		
		for(int i=0; i<a.array.length; i++) {
			nuevoVector[i] = a.array[i]/denominador;
		}
		
		Vector v = new Vector(nuevoVector);
		return v;
	}

}
