package org.example.sumary.DesafiosDIOJava.Desafio1;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de usuário:");
        int userNumber = input.nextInt();
        input.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        String agencyNumber = input.next();
        System.out.println("Qual o seu nome?");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String lastName = input.nextLine();
        System.out.println("Digite seu saldo atual:");
        double bankBalance = input.nextDouble();

        input.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque.",name+" "+lastName,agencyNumber,userNumber,bankBalance);


    }
}

