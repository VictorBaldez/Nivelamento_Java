package org.example.sumary.SegundoProjetoOOP;

public class Login {
    private int accountNumber;
    private float balanceAccount;
    private float accountDeposit;
    private float accountWithdraw;
    private String accountHolder;
    public void Login(int accountNumber, int balanceAccount,float accountDeposit, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balanceAccount = balanceAccount;
        this.accountHolder = accountHolder;
        this.accountDeposit = accountDeposit;
    }

    public float getAccountDeposit() {
        return accountDeposit;
    }

    public float getAccountWithdraw() {
        return accountWithdraw;
    }

    public void setAccountWithdraw(float accountWithdraw) {
        this.accountWithdraw = accountWithdraw;
    }

    public void setAccountDeposit(float accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(float balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "Account "+ accountNumber+
                ", Holder: "+ accountHolder+
                ", Balance: $"+ (balanceAccount+accountDeposit-accountWithdraw);
    }
}
