package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var savingAccount = new SavingAccount();
        savingAccount.setBalance(2000);
        try {
//            savingAccount.getWithdraw(2010);
            savingAccount.getWithdraw(-2010);
        } catch (InsufficientBalanceExeption e) {
            e.printStackTrace();
        } catch (IllegalBankTransactionExeption e) {
            e.printStackTrace();
        }


    }
}
