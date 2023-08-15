package curso_programacao;

import java.util.Scanner;

public class Exercicio4_0{
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int primeira,segunda,terceira,x,y;
			x = input.nextInt();
			for (y=1;y<x+1;y++) {
				primeira = (int)Math.pow(y, 1);
				segunda = (int)Math.pow(y, 2);
				terceira = (int)Math.pow(y, 3);
				System.out.printf("%d %d %d \n",primeira,segunda,terceira);
			}
			input.close();
		}
	}
}