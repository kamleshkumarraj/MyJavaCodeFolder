package JAVA;

import java.util.Scanner;

public class recursion23CheckArmstrong {
    static int checkArmstrong(int n, int sum){
        int a;
        if(n==0){
            return sum;
        }
        a=n%10;
        return checkArmstrong(n=n/10, sum=sum+a*a*a);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of check armstrong");
        n=sc.nextInt();
        int ch=checkArmstrong(n,0);
        if(ch==n){
            System.out.println("Given Number Is A Armstrong Number");
    }
    else{
        System.out.println("Given Number Is Not A Armstrong Number : ");
    }
}
}
