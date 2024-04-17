package JAVA;

import java.util.Scanner;

public class pascaltriangle {
    static int fact(int n){
        int f=1,i;
        for(i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    static int ncr(int n, int r ){
        int k;
        k=fact(n)/(fact(r)*fact(n-r));
        return k; 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i,j;
        System.out.println("enter n=");
        n=sc.nextInt();
        // System.out.println("enter the value of n : ");
        // n=sc.nextInt();
        // System.out.println("enter the value ot the r=");
        // r=sc.nextInt();
        for(i=0; i<n; i++){
            for(j=0; j<n-i; j++){
                System.out.print(" ");
            }
                for(j=0; j<=i; j++){
                    
                
                System.out.print(ncr(i,j)+" ");
            }
            System.out.println();
        }
        
    }
    
}
