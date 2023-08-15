package curso_programacao;

import java.util.Scanner;

public class Exercicio3_9{
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int x,y;
			x = input.nextInt();
			for (y=x;y>0;y--) {
				if (x%y == 0) {
					System.out.println(x/y);
				}
				else {
					
				}
			}
			input.close();
		}
	}
}