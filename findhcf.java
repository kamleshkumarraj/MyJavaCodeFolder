package JAVA;

import java.util.Scanner;

public class findhcf {
    static int findHcf(int a,int b, int c){
        int i;
        for(i=a; i>0; i--){
            if(a%i==0&&b%i==0&&c%i==0){
                break;
            }
        }
        return i; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a : ");
        a=sc.nextInt();
        System.out.println("enter the value of b : ");
        b=sc.nextInt();
        System.out.println("Enter the value of  c : ");
        c=sc.nextInt();
        int k=findHcf(a,b,c);
        System.out.println("HCF of given number is : "+k);
    }
    
}
