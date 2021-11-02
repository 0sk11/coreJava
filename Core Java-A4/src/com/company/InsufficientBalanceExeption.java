package com.company;

public class InsufficientBalanceExeption extends Exception{
    public InsufficientBalanceExeption(){
        super("Insufficient Balance in your account");
    }
}
