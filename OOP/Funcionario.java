package OOP;

import java.util.Locale;
import java.util.Scanner;

import entities.DataFuncionario;

public class Funcionario {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		DataFuncionario x;
		
		x = new DataFuncionario();
		System.out.println("Name:");
		x.Name = input.nextLine();
		System.out.println("Gross Salary: ");
		x.GrossSalary = input.nextDouble();
		System.out.println("Tax: ");
		x.Tax = input.nextDouble();
		System.out.println(x.ToString());
		System.out.println("Which percentage to increase salary:");
		x.percentage = input.nextDouble();
		System.out.println("Updated data, R$"+x.IncreaseSalary());
		
		
		input.close();
	}
}
