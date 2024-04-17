package JAVA;

import java.util.Scanner;

public class findgcdusingdivider {
    static int  gcd(int a, int b){
        while(a%b!=0){
        int c=a%b;
        a=b;
        b=c;
        }
        return b;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter te value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
        // System.out.println("Eneter the value of c: ");
        // c=sc.nextInt();
        int p=gcd(a,b);
        System.out.println("GCD="+p);

    }
    
}
