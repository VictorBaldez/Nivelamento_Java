package OOP;

import java.util.Scanner;

import entities.DataTriangulo;

public class Triangulo{
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		DataTriangulo x,y;
		x = new DataTriangulo();
		y = new DataTriangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n",areaX);
		System.out.printf("Triangle Y area: %.4f\n",areaY);
		
		if (areaX>areaY) 
			System.out.println("Largest area: X");
		else
			System.out.println("Largest area: Y");
		
		input.close();
	}
}