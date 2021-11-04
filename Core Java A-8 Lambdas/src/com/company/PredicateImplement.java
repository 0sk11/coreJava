package com.company;
import java.util.function.Predicate;

public class PredicateImplement {
    Predicate <Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return (integer&1)==0;
        }
    };
}
