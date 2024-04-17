package JAVA;

import java.util.Scanner;

public class recursio25StrongnumgerCheck {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1);

    }
    static int checkStrong(int n, int sum){
        int a;
        if(n==0){
            return sum;
        }
            a=n%10;
        return checkStrong(n=n/10, sum=sum+fact(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value for checking strong or not : ");
        n=sc.nextInt();
        int str=checkStrong(n,0);
        if(str==n){
            System.out.println("Given number is a strong number : ");
        }
        else{
            System.out.println("Given number is not a strong number : ");
        }
    }
}
