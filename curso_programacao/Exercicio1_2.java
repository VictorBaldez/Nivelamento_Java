package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ITALY);
		Scanner entrada1 = new Scanner(System.in);
		
		float x;
		x = entrada1.nextFloat();
		Locale.setDefault(Locale.US);
		System.out.printf("Você digitou: %.2f%n",x);
		
		
		
		Scanner entrada2 = new Scanner(System.in);
		
		char y;
		y = entrada2.next().charAt(0);
		System.out.println("Você digitou: " + y);
		
		entrada1.close();
		entrada2.close();
		
	}

}
