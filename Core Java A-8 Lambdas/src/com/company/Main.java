package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Addable add = new Addable() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
//        Addable add = (a,b) -> a+b;
//        System.out.println(add.add(6,7));
//        List<Person> people = Arrays.asList(
//                new Person("Charles", "Dickens", 60),
//                new Person("Lewis", "Carrol", 42),
//                new Person("Thomas", "Carlyle", 51),
//                new Person("Charlotte", "Bronte", 45),
//                new Person("Matthew", "Arnold", 38)
//        );

//        1) Sort by LastName
//
//        Sol : Collections.sort(people,(p1,p2)-> {
//            return p1.getLastName().compareTo(p2.getLastName());
//        });
//        Sol : Collections.sort(people,Comparator.comparingInt(Person::getAge));
//              by age
//        2) Create a method that prints all lists
//        people.forEach((o)-> System.out.println(o));
////      3) People whose last name begin with C
//        people.forEach((p)->{
//            if(p.getLastName().charAt(0)=='C') System.out.println(p);
//        });

//        System.out.println(people);
//        <<<1>>>
//        ArithmeticFunctionalInterface arithmetic = new ArithmeticFunctionalInterface() {
//            @Override
//            public int arthmetic(int a, int b) {
//                return a/b;
//            }
//        };
//        System.out.println(arithmetic.arthmetic(10,3));
//        ArithmeticFunctionalInterface arthmetic = (a,b)-> a/b;
//        System.out.println(arthmetic.arthmetic(10,3));
//        List<Order> order = Arrays.asList(
//                new Order(600,"ACCEPTED"),
//                new Order(700,"COMPLETED"),
//                new Order(300,"ACCEPTED"),
//                new Order(15000,"ACCEPTED"),
//                new Order(12000,"REJECTED"),
//                new Order(12000,"REJECTED"),
//                new Order(12000,"INVALID")
//        );
//        order.stream().filter(o -> o.getPrice() > 10_000).forEach(System.out::println);
//        order.stream().filter(o ->{
//                    return (o.getStatus().equals("ACCEPTED")) || o.getStatus().equals("COMPLETED");
//        }).forEach(System.out::println);
//        3
//        SupplierImplement s = new SupplierImplement();
//        System.out.println(s.s.get());
//        ConsumerImplement c = new ConsumerImplement();
//        c.c.accept(6);
//        PredicateImplement p = new PredicateImplement();
//        List<Integer> nums =Arrays.asList(1,2,56,8,9);
//        for(Integer n:nums){
//            System.out.println(p.p.test(n));

//        4))
//        List<String> words = new ArrayList(Arrays.asList("Apple","Banana","Cameron","Doge","Etherium"));


//        words.removeIf(word->(word.length()%2==0));
//        System.out.println(words);
//        5))
//        StringBuilder stringBuilder = new StringBuilder();
//        words.forEach(word-> stringBuilder.append(word.charAt(0)));
//        System.out.println(stringBuilder);
//        6))
//        ArrayList<String> words = new ArrayList(Arrays.asList("Apple","Banana","Cameron","Doge","Etherium"));
//        words.replaceAll( e -> e.toUpperCase());
//        System.out.println(words);
//        7))
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String,Integer> entry:numbers.entrySet()){
            stringBuilder.append(entry.getKey()).append(" ");
            System.out.println(entry);
        }
        System.out.println(stringBuilder);
    }
    }
