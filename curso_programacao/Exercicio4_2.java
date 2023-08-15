package curso_programacao;

import java.util.Scanner;

public class Exercicio4_2{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
			
		int mask = 0b100000; // Mask to confirm if a value has its 6th number == 1
		int n = input.nextInt();
		
		if ((n & mask)!= 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
			input.close();
	}
}	
