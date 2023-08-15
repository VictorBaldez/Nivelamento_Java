package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_1{
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)) {
			float x,y;
			String z;
			do {
				System.out.print("Digite a temperatura em Celsius: ");
				x = input.nextFloat();
				y = (9*x/5)+32;
				System.out.println("Equivalente em Fahrenheit: "+y);
				System.out.print("Deseja repetir (yes/no)?");
				z = input.next();
			}while(z != "no");
			input.close();
		}
	}
}