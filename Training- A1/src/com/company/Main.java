package com.company;
import java.util.Scanner;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here
//        for (int i = 1; i < 1000; i++) {
//            int t = isPalindrome(i);
//            if(t==i){
//                System.out.println(t);
//            }
//        }
//        System.out.println("Insert P,R,T");
//        double p = scanner.nextDouble();
//        double r = scanner.nextDouble();
//        double t = scanner.nextDouble();
//        System.out.println(si(p,r,t));
//        System.out.println(ci(p,r,t));
//        int marks1 = scanner.nextInt();
//        int marks2 = scanner.nextInt();
//        int marks3 = scanner.nextInt();
//        System.out.println(result(marks1,marks2,marks3));
//        System.out.println("Enter your income");
//        int income = scanner.nextInt();
//        System.out.println(calcIncomeTax(income));
//        String userName = "Shubham";
//        String password = "0sk11";
//        int attempts=1;
//        while(attempts<3){
//            if(login(userName,password)){
//                System.out.println("Welcome");
//                break;
//            }
//            System.out.println("Try again");
//            attempts++;
//        }
//        if(attempts==3){
//            System.out.println("Contact Admin");
//        }
        int [] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println(search(arr,19));
        bubbleSort(arr);
        for (int x=0;x<arr.length;x++) {
            System.out.print(arr[x]+" ");
        }
    }

    public static int isPalindrome(int x){
        int n;
        int answer=0;
        int  digits=x;
        int y=0;
        while(digits!=0){
            y++;
            digits/=10;
        }
        while(x!=0){
            answer += Math.pow(x%10,y);
            x/=10;
        }
        return answer;
    }
    public static double si(double p,double r,double t){
        return (p*r*t)/100;
    }
    public static double ci(double p,double r,double t){
        r = r/100;
        return round(p*(Math.pow(1+r,t))-p);
    }
    public static String result(int mark1,int mark2,int mark3){
        if(mark1>60 && mark2>60 && mark3>60){
            return "PASSED";
        }else if((mark1>60 && mark2>60)||
                (mark1>60 && mark3>60)||
                ((mark2>60 && mark3>60))
        ){
            return "Promoted";
        }
        return "Failed";
    }
    public static double calcIncomeTax(int salary){
        if(salary>=0 && salary <=180000){
            return 0;
        }else if(salary>=180001 && salary<=300000){
            return 0.1*salary;
        }else if(salary>=300001 && salary<=500000){
            return 0.2*salary;
        }
        return 0.3*salary;
    }
    public static boolean login(String userName,String password){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Enter password ");
        String ps = scanner.nextLine();
        if(userName.equals(name)&& password.equals(ps)){
            return true;
        }
        return false;
    }
    public static boolean search(int[]arr,int n){
        for(int i:arr){
            if(i==n) return true;
        }
        return false;
    }
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
