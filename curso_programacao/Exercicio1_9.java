package curso_programacao;

import java.util.Scanner;

public class Exercicio1_9{
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	float x = input.nextFloat();
	
	if (x > 10) {
		System.out.printf("O valor %.2f é maior que 10.",x);
	}
	else {
		System.out.printf("O valor %.2f não é maior que 10",x);
	}
	input.close();
	}
} 