package JAVA;

import java.util.Scanner;

public class recursion7pow2 {
    static int po(int p,int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int ans=po(p,q/2);
            return ans*ans;
        }
        else{
            int ans=po(p,q/2);
            return p*ans*ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p,q;
        System.out.println("enter the value of p : ");
        p=sc.nextInt();
        System.out.println("enter the value of q : ");
        q=sc.nextInt();
        int k=po(p,q);
        System.out.println("power : "+k);

    }
    
}
