package JAVA;

import java.util.Scanner;

public class findlcm {
    static int findLcm(int a, int b, int c){
        int i;
        for(i=a; i<=Integer.MAX_VALUE; i++ ){
            if(i%a==0&&i%b==0&&i%c==0){
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
        System.out.println("Enter the value of c : ");
        c=sc.nextInt();
        int gcd=findLcm(a,b,c);
        System.out.println("L.C.M of given number is : "+gcd);
    }
    
}
