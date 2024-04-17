package JAVA;

import java.util.Scanner;

public class REcursion22FabonacciSEries {
    static int  fabonaci(int n, int a, int b,int c){
        if(n==2){
            return n;
        }
        c=a+b;
        a=b; b=c;
        System.out.print(c+" ");
        return fabonaci(n=n-1, a, b, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n : ");
        n=sc.nextInt();
        System.out.print("Our Fabonaci Series Is : 0 1 ");
        fabonaci(n,0,1,0);
    }
    
}
