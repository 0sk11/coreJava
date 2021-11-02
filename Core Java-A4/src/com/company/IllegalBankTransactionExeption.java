package com.company;

public class IllegalBankTransactionExeption extends Exception{
    public IllegalBankTransactionExeption(){
        super("You are not allowed to withdraw negative amount");
    }
}
