package curso_programacao;

import java.util.Scanner;

public class Exercicio1_8{
	public static void main (String[]args) {
		Scanner diferenca = new Scanner(System.in);		
		System.out.println("Esse programa irá fazer a seguinte operação:(A * B) - (C * D)");
	
		float A,B,C,D,result,result2;
		System.out.println("Insira o valor de A:");
		A = diferenca.nextFloat();
		System.out.println("Insira o valor de B:");
		B = diferenca.nextFloat();
		System.out.println("Insira o valor de C:");
		C = diferenca.nextFloat();
		System.out.println("Insira o valor de D:");
		D = diferenca.nextFloat();
		
		result = A*B;
		result2 = C*D;
		
		System.out.println("O resultado é " + (result-result2));
		diferenca.close();
	}
}