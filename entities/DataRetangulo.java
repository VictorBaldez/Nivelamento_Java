package entities;

public class DataRetangulo {
	public double altura;
	public double largura;
	
	public double area() {
		return altura*largura;
	}
	public double perimeter() {
		return (2*altura)+(2*largura);
	}
	public double diagonal() {
		return Math.sqrt((Math.pow(altura, 2))+Math.pow(largura, 2));
	}
}
