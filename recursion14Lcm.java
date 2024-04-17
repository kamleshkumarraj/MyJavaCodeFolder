package JAVA;

import java.util.Scanner;

public class recursion14Lcm {
    static int findlcm(int a, int b, int c, int k){
        if(k%a==0&&k%b==0&&k%c==0){
            return k;
        }
        return findlcm(a, b, c, k+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a : ");
        a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        b=sc.nextInt();
        System.out.println("Enter the value of C : ");
        c=sc.nextInt();
        int k=a;
        int p=findlcm(a,b,c,k);
        System.out.println("LCM of given number is : "+p);
    }
    
}
