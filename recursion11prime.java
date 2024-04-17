package JAVA;

import java.util.Scanner;

public class recursion11prime {
    static boolean  check(int n,int p){
        if(n==p){
            return true;
        }
        else if(n%p==0){
            return false;
        }
         return check(n,p+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number for check the prime or not : ");
        n=sc.nextInt();
        boolean k=check(n,2);
        if (k==true){
            System.out.println("given number is prime number ");
        }
        else{
            System.out.println("given number is not a prime number ");
        }
    }
}
