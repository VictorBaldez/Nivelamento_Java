package curso_programacao;

import java.util.Scanner;

public class Exercicio2_9 {

	public static void main(String[]args) {	
		Scanner input = new Scanner(System.in);
		int y;
		y = input.nextInt();
		
		while (y != 2002) {
			System.err.println("Senha Incorreta");	
			y = input.nextInt();
		}
		System.out.println("Acesso Permitido");
		input.close();	
	}
}