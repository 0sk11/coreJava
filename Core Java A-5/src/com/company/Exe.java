package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Exe {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface execute{
        int sequence() default 0;
    }

    @execute(sequence = 1)
    public void method1(){
        System.out.println("Method 1");
    }
    @execute(sequence = 2)
    public void method2(){
        System.out.println("Method 2");
    }
    @execute(sequence = 3)
    public void method3(){
        System.out.println("Method 3");
    }
}
