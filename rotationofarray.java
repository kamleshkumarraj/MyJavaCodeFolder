package JAVA;

import java.util.Scanner;

public class rotationofarray {
    static void rotatearr(int[] arr,int n, int k){
        int i,j=0;
         k=k%n;
         int ans[]=new int[n];
        for(i=n-k; i<n; i++){
            ans[j++]=arr[i];

        }
        for(i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }

        printarr(ans,n);
    }
    static void printarr(int[] ans, int n){
        int i;
        System.out.println("print array after the rotation");
        for(i=0; i<n; i++){
            System.out.println(ans[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,n,k;
        System.out.println("enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("enter the value for you want to rotate the array");
        k=sc.nextInt();
        System.out.println("enter the element of the array : ");
        int arr[] = new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        rotatearr(arr,i,k);
    }
    
}
