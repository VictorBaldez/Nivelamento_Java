package curso_programacao;

import java.util.Scanner;

public class Exercicio3_8{
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int x,y,fatorial;
			fatorial = 1;
			x = input.nextInt();
			for (y=x;y!=0;y--) {
				fatorial *= y;
			}
			System.out.println(fatorial);
			input.close();
		}
	}
}