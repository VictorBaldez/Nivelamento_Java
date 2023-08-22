package entities;

public class DataTriangulo {
	
	public double a;
	public double b;
	public double c;
	
	public double p = a + b + c;
	public double area() {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}  
}
