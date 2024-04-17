package JAVA;

import java.util.Scanner;

public class recursion10sumofnnumber {
    static int sum(int n){
        if(n==1||n==0){
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number for find the sum : ");
        n=sc.nextInt();
        int k=sum(n);
        System.out.println("sum : "+k);
    }
    
}
