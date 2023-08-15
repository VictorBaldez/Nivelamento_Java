package curso_programacao;
import java.util.Scanner;

public class Exercicio2_6{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("O programa vai classificar os valores X e Y no plano cartesiano."
				+ "Sendo Q1/Q2/Q3/Q4");
		float x,y;
		System.out.println("Insira o valor de X:");
		x = input.nextFloat();
		System.out.println("Insira o valor de Y:");
		y = input.nextFloat();
		
		if (x == 0 && y == 0) {
			System.out.println("O valor está na origem");
		}
		else if (x == 0) {
			System.out.println("O valor está no eixo Y");
		}
		else if (y == 0) {
			System.out.println("O valor está no eixo X");
		}
		else if (x > 0 && y > 0) {
			System.out.println("O valor está em Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("O valor está em Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("O valor está em Q3");	
		}
		else {
			System.out.println("O valor está em Q4");
		}
		input.close();
	}
}