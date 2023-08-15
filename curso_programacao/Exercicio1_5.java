package curso_programacao;

import java.util.Scanner;

public class Exercicio1_5{
	public static void main(String[]args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Essa é a caluladora de bhaskara.");
		
		float A,B,C;
		System.out.print("Digite o valor de A:");
		A = input.nextFloat();
		System.out.print("Digite o valor de B:");
		B = input.nextFloat();
		System.out.print("Digite o valor de C:");
		C = input.nextFloat();
		
		float delta = (float)(Math.pow(B,2)+4*A*C);
	
		float x = (float)(-B+ Math.sqrt(delta))/(2*A);
		float y = (float)(-B- Math.sqrt(delta))/(2*A);

		
		System.out.printf("As raízes são %.2f e %.2f",x,y);
		input.close();
	}
}