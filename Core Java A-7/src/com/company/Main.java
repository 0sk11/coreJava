package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String s = "Hello World";
//        System.out.println(s.length()); // gives length
//        String s1 = "Hello ";
//        String s2 = "How are you";
//        String s3 = s1.concat(s2); // joins two string
//        System.out.println(s3);
//        String test = "Java String pool refers to collection og String which are " +
//                "stored in heap memory";
//        System.out.println(test.toLowerCase());
//        System.out.println(test.toUpperCase());
//        System.out.println(test.replaceAll("a","\\$"));
//        System.out.println(test.contains("collection"));
//        System.out.println(test.contentEquals("Java String pool refers to collection og " +
//                "String which are stored in heap memory"));
        StringBuilder builder = new StringBuilder("String builder");
        builder.append(" is a peer class of String");
        builder.append(" that provides much of");
        builder.append(" the functionality of string");
        System.out.println(builder);
        var s = new StringBuilder();
        s.append("insert text ");
        s.append("It is used to");
        s.append(s.length());
        s.append("at specified index position");
        System.out.println(s);
        var sr = new StringBuilder();
        sr.append("This method calls reversed object on which it has called");
        sr.reverse();
        System.out.println(sr);
    }
}
