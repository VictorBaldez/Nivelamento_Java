package curso_programacao;

import java.util.Scanner;

public class Exercicio1_7{
	public static void main(String[]args) {
		
		Scanner circulo = new Scanner(System.in);
		
		float raio,area;
		System.out.println("Essa calculadora ira calcular  a área de um circulo pelo raio fornecido."
				+ "\nDigite o valor do raio:");
		
		raio = circulo.nextFloat();
		area = (float) ((float) Math.pow(raio, 2) * Math.PI);
		
		System.out.printf("O valor da área é %.2f",area);
		
		circulo.close();
	}
}