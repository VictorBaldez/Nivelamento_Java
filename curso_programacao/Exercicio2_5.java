package curso_programacao;

import java.util.Scanner;

public class Exercicio2_5{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa ira receber um número e identificar em qual intervalo ele se encontra.");
		float X;
		System.out.println("Insira um número entre 0 e 100");
		X = input.nextFloat();
		
		if (X > 0 && X <= 25){
			System.out.println("O valor está entre o intervalo 0 a 25");
		}
		else if (X > 0 && X <= 50){
			System.out.println("O valor está entre o intervalo 25 a 50");
		}
		else if (X > 0 && X <= 75){
			System.out.println("O valor está entre o intervalo 50 a 75");
		}
		else if (X > 0 && X <= 100){
			System.out.println("O valor está entre o intervalo 75 a 100");
		}
		else{
			System.out.printf("O valor não está dentro de nenhum intervalo.");
		}
		
		input.close();
		
	}
}