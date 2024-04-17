package JAVA;

import java.util.Scanner;

public class rotationarraysecondmethod {
    static void swap(int [] arr,int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int[] arr,int i, int j){
    
        while(i<j){
            swap(arr,i,j);
            j--;
            i++;

        }
    }
    static void rotatearr(int [] arr ,int n, int k){
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        printarr(arr,n);
    }
    static void printarr(int[] arr,int n){
        int i;
        System.out.println("print our array after rotation : ");
        for(i=0; i<n; i++){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n,i,k;
        System.out.println("enter the number of element");
        n=sc.nextInt();
        System.out.println("enter the number you want to rotate the array");
        k=sc.nextInt();
        int arr [] = new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        rotatearr(arr,n,k);
    }
    
}
