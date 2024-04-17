package JAVA;

import java.util.Scanner;

public class recursion2 {
    static void print(int n){
        if (n==0){
      
            return;
        }
        else{
        print(n-1);
        System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        print(n);
    }
    
}
