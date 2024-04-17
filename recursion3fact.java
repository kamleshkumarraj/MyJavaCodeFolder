package JAVA;

import java.util.Scanner;

public class recursion3fact {
    static int fact(int n){
        if (n==1|| n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value ofr find the facorial : ");
        n=sc.nextInt();
       int k=fact(n);
       System.out.println("factorial of given no. = "+k);
    }
    
}
