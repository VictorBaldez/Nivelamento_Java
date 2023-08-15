package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_7{
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)){ 
			int x,y;
			float divisor,denominador,resultado;
			x = input.nextInt();
			for (y = 0; y <= x; y ++) { 
				divisor = input.nextInt();
				denominador = input.nextInt();
				if (denominador != 0) {
					resultado = divisor/denominador;
					System.out.print(resultado);
				}
				else if (denominador == 0){
					System.out.println("divisão impossível");
				}
		
				System.out.println();
				
			}
		}
	}
}
