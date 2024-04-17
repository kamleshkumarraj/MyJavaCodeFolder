package JAVA;

import java.util.Scanner;

public class countaccerance {
    static int countarr(int[] arr,int n,int t){
       int i,k=0;
        for(i=0; i<n; i++){
            if(arr[i]==t){
                k=k+1;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,t,i,p;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("Enter target for search");
        t=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter your Element");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        p=countarr(arr,n,t);
        System.out.println("Total number of Accerance="+p);
    }
    
}
