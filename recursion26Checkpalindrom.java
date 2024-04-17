package JAVA;

import java.util.Scanner;

public class recursion26Checkpalindrom {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("enter the number for check palindrom or not : ");
         n=sc.nextInt();
         int rev=recursion24ReverseFind.reverse(n, 0);
         if(rev==n){
            System.out.println("Given number is a palindrom number. ");
         }
         else{
            System.out.println("Given number is not a palindom number. ");
         }
         
    }
    
}
