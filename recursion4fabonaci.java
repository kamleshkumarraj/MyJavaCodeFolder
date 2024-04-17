package JAVA;

import java.util.Scanner;

public class recursion4fabonaci {
   
    static int fabonaci(int n){
        if (n==0 || n==1){
            return n;
        }
        return fabonaci(n-1)+fabonaci(n-2);
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number till find the fabonaci series : ");
        n=sc.nextInt();
        for(int i=0; i<n; i++){
        System.out.print(" "+fabonaci(i)+" ");
        }
        
        
    }
    
}
