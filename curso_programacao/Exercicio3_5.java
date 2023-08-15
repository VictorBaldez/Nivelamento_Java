package curso_programacao;

import java.util.Scanner;

public class Exercicio3_5{
	public static void main(String[]args) {
		try (Scanner input = new Scanner(System.in)) {
			int outRange,inRange,x,y,z;
			inRange = 0;
			outRange = 0;
			x = input.nextInt();
			
			for (y = 0; y < x; y ++) {
				z = input.nextInt();
				if (z >= 10 && z <=20) 
					inRange += 1;
				else 
					outRange += 1;				
			}
			System.out.printf("%s in\n%s out",inRange,outRange);	
			input.close();
		}
	}
}	