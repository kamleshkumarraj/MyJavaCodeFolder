package JAVA;

import java.util.Scanner;

public class rotationMatrixPractice {
    public static void printArray(int[] arr, int n){
        System.out.println("Print our array after changing : ");
        System.out.print("[ ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ]");
    }
    public static void rotateArraym1(int arr[] ,int n , int t){
        int newarr[] = new int[100];
        int a=0;
        t=t%n;
        for(int i=n-t; i<n; i++){
            newarr[a] = arr[i];
            a++;
        }
        for(int i=0; i<n-t; i++){
            newarr[a] = arr[i];
            a++;
        }
        printArray(newarr,a);

    }
    public static void swapArr(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void arrReverse(int[] arr, int n){
        int j=n-1;
        for(int i=0; i<n/2; i++){
        swapArr(arr, i, j);
        j--;
    }
}

    public static void rotateArraym2(int arr[] , int n, int t){
        int j=n-1;
        t = t%n;
        for(int i=n-t; i<j; i++){
            swapArr(arr,i,j);
            j--;
        }
        int k= (n-t)-1;
        for(int i=0; i<k; i++){
            swapArr(arr, i, k);
            k--;
        }
        arrReverse(arr,n);
        printArray(arr, n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the turn for rotate the array : ");
        int t = sc.nextInt();
        rotateArraym1(arr,n,t);
        rotateArraym2(arr,n,t);

    }
}
