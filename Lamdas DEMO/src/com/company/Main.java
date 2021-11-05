package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printable p = DemoReferencing::display;
        p.printing("Hello");
        DemoReferencing add = new DemoReferencing();
        Addable a = add::add;
        System.out.println(a.add(5,5));

        List<String> words = new ArrayList(Arrays.asList("Apple","Banana","Cameron","Doge","Etherium"));
        StringBuilder s = new StringBuilder();
        words.forEach(word-> s.append(word.charAt(1)));
        System.out.println(s);
        words.replaceAll(String::toLowerCase);
        System.out.println(words);

    }
}
