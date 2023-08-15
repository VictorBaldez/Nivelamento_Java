package OOP;

import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos triangulos deseja calcular a área?:");
		int quantidade = input.nextInt();
		for (int i=0; i < quantidade; i++) {
			System.out.println("Insira o valor dos lados dos triângulos:");
			double x,y,z;
			x = input.nextDouble();
			y = input.nextDouble();
			z = input.nextDouble();
			double triangleArea = area(x,y,z);
			
			showResult(triangleArea);
			}
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