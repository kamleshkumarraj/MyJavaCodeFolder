package JAVA;

import java.util.Scanner;

public class arrayreversesecondmethod {
    static void reverse(int [] arr, int n){
        int ans[]=new int[n];
        int j=0;
        int i;
        for(i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        printarry(ans, n);
    
    }
    static void  printarry(int[] arr, int n){
        int i;
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int i,n;
        System.out.println("enter The Size Of The Array=");
        n=sc.nextInt();
        System.out.println("Enter Your Element : ");
        int arr [] = new int[n];
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr,n);

    }
    
}
