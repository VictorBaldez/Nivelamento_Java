package curso_programacao;

import java.util.Scanner;

public class Exercicio2_1{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		float X,Y;
		
		System.out.println("Esse programa ira calcular se um número é par ou impar.");
		System.out.println("Insira o valor que deseja descobrir:");
		X = input.nextFloat();
		Y = X % 2;	
		if (Y == 0) {
			System.out.println("Esse número é par.");
		}
		else {
			System.out.println("Esse número é impar.");
		}
		input.close();
	}
}