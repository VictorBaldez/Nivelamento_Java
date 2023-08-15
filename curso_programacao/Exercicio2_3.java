package curso_programacao;

import java.util.Scanner;

public class Exercicio2_3{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse progama calculara se os numeros fornecidos são multiplos ou não.");
		float X,Y;
		System.out.println("Insira o primeiro valor:");
		X = input.nextFloat();
		System.out.println("Insira o segundo valor:");
		Y = input.nextFloat();
		
		if (X >= Y && X % Y == 0) {
			System.out.printf("Os números %f e %f são multiplos.",X,Y);
		}
		if (X >= Y && X % Y == 0) {
			System.out.printf("Os números %f e %f são multiplos.",X,Y);
		}
		else {
			System.out.printf("Os números %f e %f não são multiplos.",X,Y);
		}
		
		input.close();
	}
}