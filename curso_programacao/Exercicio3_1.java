package curso_programacao;

import java.util.Scanner;

public class Exercicio3_1{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		int alcool,gasolina,diesel;
		alcool= 0;
		gasolina = 0;
		diesel = 0;
		
		int x = input.nextInt();
		while ((x >= 1) && (x <= 4)) {
	
			if (x == 1) 
				alcool += 1;
			else if (x == 2) 
				gasolina += 1;
			else if (x == 3) 
				diesel += 1;
			else if (x == 4) 
				break;
			else 
				System.out.println("Voto inválido.");
			
			System.out.printf("Alcool: %s\nGasolina: %s\nDiesel: %s",alcool,gasolina,diesel);
			
			x = input.nextInt();
		}
		System.out.println("MUITO OBRIGADO PELA PARTICIPAÇÃO.");
		input.close();
	}
}