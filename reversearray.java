package JAVA;

import java.util.Scanner;

public class reversearray {
    static void reverse(int[] arr ,int n){
        int i;
        System.out.println("print Our Array after reverse : ");
        for(i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter the size of array=");
        n=sc.nextInt();
        int arr [] = new int[n];
        System.out.println("enter your element : ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,n);
    }
    
}
