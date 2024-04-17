package JAVA;

import java.util.Scanner;


public class reversearryusingswap {
    static void swap( int[] arr,int a, int b){
        int temp;
        temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reverse(int[] arr , int n){
        int i,j=n-1;
        System.out.println("print our array after reverse");
        for(i=0; i<n/2; i++){
            swap(arr,i,j);
            j--;
        }
    }
    static void printarry(int[] arr, int n){
        int i;
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("enter your array element");
        int arr[] = new int [n];
        for(i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        reverse(arr,n);
        printarry(arr,n);
    }
    
}
