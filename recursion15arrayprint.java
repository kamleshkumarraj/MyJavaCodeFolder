package JAVA;

import java.util.Scanner;


public class recursion15arrayprint {
   


    static void printarray(int [] arr,int a){
        if(a==-1){
            return;
        }
        System.out.println(arr[a]);
        printarray(arr, a-1);     
    }
    static int []  inputarray(int n){
        Scanner sc1 = new Scanner(System.in);
        int i;
        // System.out.println("enter the number of element : ");
        // n=sc1.nextInt();
        System.out.println("enter your element : ");
        int arr[] = new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc1.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       int arr[] = inputarray(n);
        System.out.println("print our array as it is : ");
        printarray(arr,arr.length-1);


    
    }
   

    
}
