package curso_programacao;

import java.util.Scanner;

public class Exercicio3_3 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int x,y;
			y = 0;
			x = input.nextInt();
			if (1 <= x && x <= 1000) 
				for (y = 0;x >= y; y++){
					y += 1;
					System.out.println(y);
				}
			else {
				System.out.println("Digite um valor entre 1 e 1000");
				
			}
		input.close();
		}
			
	}
}