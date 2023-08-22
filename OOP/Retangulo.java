package OOP;

import java.util.Locale;
import java.util.Scanner;

import entities.DataRetangulo;

public class Retangulo{
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DataRetangulo x;
		x = new DataRetangulo();
		
		System.out.println("Esse programa ira apresetar os dados de um retangulo desejado:");
		
		x.altura= input.nextDouble();
		x.largura = input.nextDouble();
		
		System.out.printf("Diagonal: %.2f\nPerimetro: %.2f\nÁrea: %.2f",x.area(),x.perimeter(),x.diagonal());
		
		
		input.close();
	}
}