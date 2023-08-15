package curso_programacao;

import java.util.Scanner;

public class ModeloScanner{
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int x,y;
			x = input.nextInt();
			for (y=0;y<x;y++) {
				
			}
			input.close();
		}
	}
}