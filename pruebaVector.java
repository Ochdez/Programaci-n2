package Vector;

public class pruebaVector {

	public static void main(String[] args) {
		double[] v = new double[3];
		v[0] = 4;
		v[1] = 2.0;
		v[2] = 7.0;
		Vector vector = new Vector(v);
		System.out.println(vector);
		System.out.println(vector.VectorUnitario(vector));
	}

}
