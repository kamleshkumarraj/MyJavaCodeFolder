package JAVA;

import java.util.Scanner;

public class recursion12alternate   {
    static int add(int n){
        if (n==0||n==1) {
            return n;
        }
        if(n%2==0){
           return  add(n-1)-n;}
        else{
           return  add(n-1)+n;
        }
        
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n : ");
        n= sc.nextInt();
        int p=add(n);
        System.out.println("add of alternate sum : "+p);
    }    
}
