package JAVA;

import java.util.Scanner;

public class checkascendingornot {
     static void check(int[] arr,int n){
        int i,j,a=1;
        for(i=0; i<n-1; i++){
            if(arr[i]<=arr[i+1]){
                a=a+1;
            }

                }
           
                if(n==a){
            System.out.println("given element is in ascending order");
            }
            else{
                System.out.println("given element is not in ascending order");
            }
        }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter n=");
        n=sc.nextInt();
        int ass[] = new int[n];
        System.out.println("enter your array element : ");
        for(i=0; i<n; i++){
            ass[i]=sc.nextInt();
        }
        check(ass,n);

    }
    
}
