package org.example.sumary.SegundoProjetoOOP;

public class Login {
    private int accountNumber;
    private float balanceAccount;
    private String accountHolder;

    public final int tax = -5;
    public void login(int accountNumber, int balanceAccount, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balanceAccount = balanceAccount;
        this.accountHolder = accountHolder;
    }

    public void withdrawValue(float amount) {
        balanceAccount -= amount - tax;
    }

    public void depositValue(float amount) {
        balanceAccount += amount;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalanceAccount(float balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "Account "+ accountNumber+
                ", Holder: "+ accountHolder+
                ", Balance: $"+ (balanceAccount);
    }
}
