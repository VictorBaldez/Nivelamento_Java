package curso_programacao;

import java.util.Scanner;

public class Exercicio1_6{
	public static void main(String[]args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Calcule a soma de dois números:");
	
	float A,B;
	System.out.println("Insira o primeiro valor:");
	A = input.nextFloat();
	System.out.println("Insira o segundo valor:");
	B = input.nextFloat();
	
	float soma = A + B;
	System.out.printf("A soma é igual a %.2f",soma);
	
	input.close();
	}	
}