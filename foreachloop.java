package JAVA;

import java.util.Scanner;

public class foreachloop {
    public static void print(int [] arr, int n){
        System.out.println("Print our element as it is : ");
        for(int element : arr){
            System.out.println(element);

        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the size of the array : ");
    n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter in your array element : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        print(arr,n);
    }
}
