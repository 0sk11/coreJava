package com.company;

public class Product {
    private int id;
    private String name;
    public Product(){}
    public Product(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public int hashCode(){
        return getId()*10;
    }

    @Override
    public boolean equals(Object obj) {
        Product p = null;
        if(obj instanceof Product){
            p = (Product)obj;
        }
        if(this.getId()==p.getId()){
            return true;
        }
        return false;
    }
}
