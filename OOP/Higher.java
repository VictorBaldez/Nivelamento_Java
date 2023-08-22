package OOP;

import java.util.Scanner;

public class Higher{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		Double a,b,c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double higher = max(a,b,c);
		
		showResult(higher);
		input.close(); 
	}
	
	public static double max(double x,double y, double z) {
	
	double aux;	
	if (x>y && x>z) 
		aux =x;
	else if (y>x && y>z) 
		aux =y;
	else 
		aux =z;
	return aux;
	}
	public static void showResult(double value) {
		System.out.println("Higher = " + value);
	}
}
