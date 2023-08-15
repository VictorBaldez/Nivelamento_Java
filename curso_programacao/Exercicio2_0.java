package curso_programacao;

import java.util.Scanner;

public class Exercicio2_0{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		if (x > 0){
			System.out.printf("O valor %d não é negativo.",x);
		}
		else {
			System.out.printf("O valor %d é negativo.",x);
		}
		input.close();
	}
}