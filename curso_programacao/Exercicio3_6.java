package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3_6{
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		try (Scanner input = new Scanner(System.in)) {
			int x,y;
			float a,b,c,media;
			x = input.nextInt();
			for (y = 0; y <= x; y ++) {
				a = input.nextFloat();
				b = input.nextFloat();
				c = input.nextFloat();
				media = (a*2+b*3+c*5)/10;
				System.out.println(media);
			}
			input.close();
		}
	}
}