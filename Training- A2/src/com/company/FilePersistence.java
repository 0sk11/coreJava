package com.company;

public class FilePersistence extends Persistence{
    @Override
    public void persists() {
        System.out.println("Inside File");
    }
}
