package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        var contact = new Contact(3342,"shu","s@gmail");
//        var contact1 = new Contact(9842,"su","sio@gmail");
//        var contact2 = new Contact(8932,"dev","soip@gmail");
//        var contactTreeMap = new TreeMap<Long, Contact>(Collections.reverseOrder());
//        contactTreeMap.put(contact.getPhoneNo(),contact);
//        contactTreeMap.put(contact1.getPhoneNo(),contact1);
//        contactTreeMap.put(contact2.getPhoneNo(),contact2);
//        var keySet = contactTreeMap.keySet();
//        var valueSet = contactTreeMap.values();
//        System.out.println(contactTreeMap);
//        System.out.println(keySet);
//        System.out.println(valueSet);
        // 2
//        HashSet<Product> treeSet = new HashSet();
//        var p1 = new Product(1, "sh");
//        var p2 = new Product(2, "sh");
//        var p3 = new Product(3, "sh");
//        var p4 = new Product(4, "sh");
//        var p5 = new Product(1, "sh");
//        var product = new Product();
//        treeSet.add(p1);
//        treeSet.add(p2);
//        treeSet.add(p3);
//        treeSet.add(p4);
//        System.out.println(treeSet);
///--- 3rd
//        TreeSetComparator treeSetComparator = new TreeSetComparator();
        var treeSet = new TreeSet<Employee>();
        var e1 = new Employee(1,"Shubham","CSE",40_000);
        var e2 = new Employee(2,"Ritesh","Mech",35_000);
        var e3 = new Employee(3,"Riya","IT",45_000);
        var e4 = new Employee(4,"Mayank","Chem",75_000);
        var e5 = new Employee(5,"Piyush","Biotech",10_000);

        Employee.field = "dept";

        treeSet.add(e1);
        treeSet.add(e4);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e5);
        Employee e = null;
        for(var h : treeSet){
            e = h;
            System.out.println(e.getDept());
        }
//
//        // 4th
//        Scanner scanner = new Scanner(System.in);
//        String DOB;
//        var list = new LinkedList();
//        int cont = 1;
//        while(cont!=-1){
//            System.out.println("Add your date of birth ");
//            System.out.println("Year");
//            int yyyy = scanner.nextInt();
//            System.out.println("MM");
//            int mm = scanner.nextInt();
//            System.out.println("DD");
//            int dd = scanner.nextInt();
//            LocalDate localDate = LocalDate.of(yyyy,mm,dd);
//            list.add(localDate);
//            System.out.println("Do you want to continue?");
//            cont = scanner.nextInt();
//        }
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate date;
//        for(var l:list){
//            date = (LocalDate) l;
//            System.out.println(date.format(formatter));
//            System.out.println(date.isLeapYear());
        }

    }

