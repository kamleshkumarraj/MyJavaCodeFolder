package JAVA;

import java.util.Scanner;

public class firstpair {
    static int  Firstpair(int[] arr,int n){
        int j,i , p;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    p=arr[i];
                    return p;
                
            }
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("enter element=");
        int arr[]=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
      int t=  Firstpair(arr,n);
      System.out.println("First pair="+t);
    }
    
}
