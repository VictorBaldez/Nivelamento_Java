package curso_programacao;

import java.util.Scanner;

public class Exercicio2_2{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa ira calcular a duração de um jogo.");
		
		float X,Y,Z;
		
		System.out.println("Insira o horário de início:");
		X = input.nextFloat();
		System.out.println("Insira o horário de termino:");
		Y = input.nextFloat();
		
		if (X > Y) {
			Z = X - Y;
		}
		else if (Y > X) {
			Z = Y - X;
		}
		else {
			Z = 24;
		}
		System.out.printf("O tempo de duração do jogo foi de %.0f Horas",Math.abs(Z));
		
				
		input.close();
	}
}