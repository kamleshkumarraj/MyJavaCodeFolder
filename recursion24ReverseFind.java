package JAVA;

import java.util.Scanner;

public class recursion24ReverseFind {
    static int reverse(int n,int sum){
        int a;
        if(n==0){
            return sum;
        }
        a=n%10;
        return reverse(n=n/10, sum=sum*10+a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number For Reverse : ");
        n=sc.nextInt();
        int rev=reverse(n,0);
        System.out.println("Reverse Of Given Number Is : "+rev);

    }
}
