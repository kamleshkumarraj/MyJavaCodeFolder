package JAVA;

import java.util.Scanner;

public class hacker8 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
            System.out.println("range in integer");
        }
        if(n>=Short.MIN_VALUE && n<=Double.MAX_VALUE){
            System.out.println("range in double");
        }
        if(n>=Character.MIN_VALUE && n<=Character.MAX_VALUE){
            System.out.println("Range in character");
        }
        else{
            System.out.println("never");
        }
    }
    
}
