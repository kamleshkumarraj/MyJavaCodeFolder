package JAVA;

import java.util.Scanner;


public class hacker7series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,n,k=0;
        System.out.println("Enter the value of n = ");
        n = sc.nextInt();
        System.out.println("Enter the value of a = ");
        a = sc.nextInt();
        System.out.println("Enetr the value of b = ");
        b = sc.nextInt();
        // System.out.println(2*5);
        // System.out.println);
         int p = a+(int)(Math.pow(2, 0))*b;
        for(int i=1; i<=n; i++){
            // p = (int)p;
            System.out.print(p+" ");
            p = p+(int)Math.pow(2,i)*b;
            
           


            

            
            
        } 
    }
}
