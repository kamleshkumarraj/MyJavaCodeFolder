package JAVA;

import java.util.Scanner;

public class recursion8multiple {
    static void mul(int p,int q){
        if(q==0){
        //    System.out.println(p);
           return;
        }
        else{
       
         mul(p,q-1);
         System.out.println(p+"*"+q+"="+p*q);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q;
        System.out.println("enter the value of p : ");
        p=sc.nextInt();
        System.out.println("enter the value of q: ");
        q=sc.nextInt();
        System.out.println("print our factor : ");
        mul(p, q);
        
    }
    
}
