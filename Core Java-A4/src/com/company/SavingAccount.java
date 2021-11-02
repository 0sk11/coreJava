package com.company;

public class SavingAccount {
    private long id;
    private double balance;
    private double withdraw;
    private double diposit;

    public SavingAccount(){
        id = 0;
        balance = 0;
        withdraw = 0;
        diposit = 0;
    }
    public void setId(long id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdraw(int amount) throws InsufficientBalanceExeption, IllegalBankTransactionExeption {
        if(amount > balance) throw new InsufficientBalanceExeption();
        if(amount<0) throw new IllegalBankTransactionExeption();
        return withdraw;
    }

    public double getDiposit() {
        return diposit;
    }

    public void setDiposit(double diposit) {
        this.diposit = diposit;
    }
}
