package JAVA;

import java.util.Scanner;

public class sortarray {
    // static void swap(int[] arr,int i, int j){
    // int temp;
    // temp=arr[i];
    // arr[i]=arr[j];
    // arr[j]=temp;
    // }
    static void arraysort(int[] arr, int n){
        int i,count=0;
        for(i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(i=0; i<n; i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
            
        
        System.out.println("print our array after sorting");
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        System.out.println("enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("enter the element of the array : ");
        int arr [] = new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        arraysort(arr,n);
    }
    
}
