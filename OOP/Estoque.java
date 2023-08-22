package OOP;

import java.util.Locale;
import java.util.Scanner;

import entities.DataEstoque;

public class Estoque{
	public static void main(String[]args){
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		DataEstoque product = new DataEstoque();
		System.out.println("Enter product data.\nName:");
		product.name = input.next();
		System.out.println("Price:");
		product.price = input.nextDouble();
		System.out.println("Quantity:");
		product.quantity = input.nextInt();
		System.out.println("Product data:\n"+product);
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = input.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated product data:\n"+product);
		System.out.println("Enter the number of products to be removed in stock:");
		quantity = input.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated product data:\n"+product);
		input.close();
	}
}