package com.company;

public class UnsupportedOperationException extends RuntimeException{
    private int n1;
    private  int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int divide() throws ArithmeticException{
        return n1/n2;
    }
}
