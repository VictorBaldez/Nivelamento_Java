package curso_programacao;

import java.util.Locale;

public class Exercicio1_1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which is $ %.2f%n%s, wich price is $ %.2f%n", product1, price1,
				product2,price2);
		System.out.printf("%nRecord:%d year old, code %d and gender:%n",age,code+ gender);
		System.out.printf("%nMensue with eight decimal places: %.8f%nRounded "
				+ "(three decimal places): %.3f%nUS decimal point:",measure,measure);
		Locale.setDefault(Locale.US);
		System.out.printf(" %.3f",measure);		
	}

}
