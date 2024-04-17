

import java.util.Scanner;

public class recursion5sumofdigit {
    static int sum(int n){
        int a;
        if(n<10){
            return n;
        }
        else{
            a=n%10;
            return a+sum(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number for calculate the sum : ");
        n=sc.nextInt();
        int k=sum(n);
        System.out.println("sum of given digit= "+k);
    }
    
}
