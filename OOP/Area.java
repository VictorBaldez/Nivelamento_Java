package OOP;

import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos triângulos deseja calcular a área?:");
		String i;
		do {
			double x,y,z;
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			double triangleArea = area(x,y,z);
			showResult(triangleArea);
			System.out.println("Deseja realizar o cálculo da área de outro triângulo?:");
			i = input.next();
			} while ( i != "Sim");
		input.close();
	}
	public static double area(double ladoA,double ladoB,double ladoC) {
		
		double area;
			
		double p = (ladoA + ladoB + ladoC)/2;
		area = Math.sqrt((p*(p-ladoA))*(p-ladoB)*(p-ladoC));
		
		return area;
		
	}
	public static void showResult(double value) {
		System.out.println("Área = " + value);
	}
}
	public static void showResult(double value) {
		System.out.println("Área = " + value);
	}
}
