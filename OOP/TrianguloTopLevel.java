 package OOP;

import java.util.Scanner;

public class TrianguloTopLevel {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa irá calcular a área de um triângulo.\nInsira o valor dos lados:");
		String i;
		do {
			double x,y,z;
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			double triangleArea = area(x,y,z);
			showResult(triangleArea);
			System.out.println("Deseja realizar o cálculo da área de outro triângulo?(Yes/No):");
			i = input.next();
			} while ( i.equals("Yes"));
		input.close();
	}
	public static double area(double ladoA,double ladoB,double ladoC) {
		
		double area;
			
		double p = (ladoA + ladoB + ladoC)/2;
		area = Math.sqrt((p * (p - ladoA) * (p - ladoB) * (p - ladoC)));
		
		return area;
		
	}
	public static void showResult(double value) {
		System.out.println("Área = " + value);
	}
}