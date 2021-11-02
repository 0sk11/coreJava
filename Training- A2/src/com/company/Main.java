package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var candy = new Candy();
        var iceCream = new IceCream();
        var cookie = new Cookie();
        candy.owner();
        candy.owner();
        candy.owner();
        System.out.println(candy.customer(5));

    }
}
