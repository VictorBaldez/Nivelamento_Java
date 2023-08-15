package curso_programacao;

import java.util.Scanner;

public class Exercicio2_7{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa ira calcular"
				+ " quanto você deverá pagar de imposto de renda.");
		float v,w,x,y,z;
		System.out.println("Insira o seu salário:");
		
		v = input.nextFloat();
		
		if (v <= 2000) {
			System.out.println("Isento.");
		}
		if (v >2000.01 && v <= 3000) {
			y =(float)(v - 2000.01);
			z =(float) y * (float)0.08 ;
			System.out.printf("Você deverá pagar R$ %.2f",z);
		}
		if (v >3000.01 && v <= 4500) {
			y =(float)(1000.01 * 0.08);
			z =(float)y + (float)((v - 3000.01)* 0.18) ;
			System.out.printf("Você deverá pagar R$ %.2f",z);
		}
		if (v >4500) {
			w =(float)(1000.01 * 0.08);
			x =(float)(1500 * 0.18);
			y =(float)((v - 4500.1)* 0.28);
			z = w + x + y;
			System.out.printf("Você deverá pagar R$ %.2f",z);
		}
		
		input.close();
	}
}
