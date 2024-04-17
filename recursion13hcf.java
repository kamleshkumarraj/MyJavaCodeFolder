package JAVA;

import java.util.Scanner;

public class recursion13hcf {
    static int findhcf(int a, int b, int c , int k){
        if (a%k==0&&b%k==0&&c%k==0){
            return k;
        }
        return findhcf(a, b, c, k-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a : ");
        a=sc.nextInt();
        System.out.println("enter the value of b : ");
        b=sc.nextInt();
        System.out.println("enter the value of c : ");
        c=sc.nextInt();
        int k=a;
        int p=findhcf(a,b,c,k);
        
        System.out.println("HCF of given number is : "+p);

        
    }
    
}
