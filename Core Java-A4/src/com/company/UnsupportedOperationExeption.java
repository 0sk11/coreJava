package com.company;

public class UnsupportedOperationExeption {
    private int n1;
    private  int n2;

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int divide() throws ArithmeticException{
        try{
            int x = n1/n2;
        }catch (ArithmeticException e){
            throw e;
        }
        return n1/n2;
    }
}