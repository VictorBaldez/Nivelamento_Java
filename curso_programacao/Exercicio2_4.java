package curso_programacao;

import java.util.Scanner;

public class Exercicio2_4{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Esse programa ira receber o número do item e "
				+ "a quantidade para calcular o preço.");
		float X,Y,price;
		System.out.println("Insira o número correspondente ao item do pedido.\n"
				+ "1) Cachorro Quente |R$ 4.00\n2) X-Salada        |R$ 4.50\n3) X-Bacon         |R$ 5.00\n"
				+ "4) Torrada simples |R$ 2.00\n5) Refrigerante    |R$ 1.50");
		X = input.nextFloat();
		System.out.println("Insira a quantidade desejada desse item.");
		Y = input.nextFloat();		
		
		if (X == 1){
			price = (float)4.00 * Y;
		}
		else if (X == 2){
			price = (float)4.50 * Y;
		}
		else if (X == 3){
			price = (float)5.00 * Y;
		}
		else if (X == 4){
			price = (float)2.00 * Y;
		}
		else{
			price = (float)1.50 * Y;
		}
		System.out.printf("Você pagará um total de R$ %.2f.",price);
		
		input.close();
		
	}
}