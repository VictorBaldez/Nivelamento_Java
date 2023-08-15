package curso_programacao;

import java.util.Scanner;

public class Exercicio2_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float x, y, z;
		x = input.nextFloat();
		y = (x > 6) ? (2) : (3);
		z = 3;
		z += y;
		System.out.println(z);
		input.close();
	}
}