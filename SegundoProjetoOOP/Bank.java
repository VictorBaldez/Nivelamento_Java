package org.example.sumary.SegundoProjetoOOP;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        float balance;
        String name,decision;
        Login user = new Login();

        System.out.println("Enter account number");
        number = input.nextInt();
        System.out.println("Enter account holder:");
        input.nextLine();
        name = input.nextLine();
        System.out.println("Is there an initial deposit (Yes/No)?");
        decision = input.nextLine();
        if (decision.equals("Yes")){
            System.out.println("How much do want deposit?");
            balance = input.nextFloat();
        }
        else{
            balance = 0;
        }
        user.setAccountNumber(number);
        user.setAccountHolder(name);
        user.setBalanceAccount(balance);
        System.out.println("Account data:");
        System.out.println(user);
        System.out.println("Enter a deposit value:");
        user.depositValue(input.nextFloat());
        System.out.println("Update account data: ");
        System.out.println(user);
        System.out.println("Enter a withdraw value:");
        user.withdrawValue(input.nextFloat());
        System.out.println("Update account data:");
        System.out.println(user);
    }
}
