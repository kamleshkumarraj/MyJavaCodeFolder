package JAVA;

import java.util.Scanner;

public class recursion17primesecondmethod {
    static int check(int n, int a, int b){
        if(n==a){
            return ++b;
        }
        if(n%a==0){
            b=b+1;
        }
        return check(n,a= a+1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number for check prime or not! : ");
        n=sc.nextInt();
        int k=check(n,1,0);
        if(k==2){
            System.out.println("Given number is a prime number : ");
        }
        else{
            System.out.println("Given number is not a prime number :  ");
        }

    }
    
}
