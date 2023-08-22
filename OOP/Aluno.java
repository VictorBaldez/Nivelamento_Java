package OOP;

import java.util.Locale;
import java.util.Scanner;

import entities.DataAluno;

public class Aluno {
	public static void main(String[]args) {
	Locale.setDefault(Locale.US);
	Scanner input = new Scanner(System.in);
	DataAluno x;
	x = new DataAluno();
	System.out.println("Insira seu nome:");
	x.Name = input.nextLine();
	System.out.println("Insira suas notas:");
	x.a = input.nextDouble();	
	x.b = input.nextDouble();	
	x.c = input.nextDouble();	
	
	System.out.printf("FINAL GRADE = %.2f\n",x.FinalGrade());
	System.out.println(x.Status());
	
	
	input.close();
	}
}
