package JAVA;

import java.util.Scanner;

public class recursion6power {
    static int power(int p, int q){
        if (q==0){
            return 1;
        }
        return p*power(p,q-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int p,q;
        System.out.println("enter the value for find the power : ");
        p=sc.nextInt();
        System.out.println("enter the value for range the power : ");
        q=sc.nextInt();
        int k=power(p,q);
        System.out.println("power= "+k);

    }
    
}
