package JAVA;

import java.util.Scanner;


public class copyarray {
    public static void printarray(int arr[],int n) {
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int arr_2[]=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print our elememnt as it is");
        printarray(arr, n);
        arr_2=arr;
        System.out.println("array of second element ");
        printarray(arr_2, n);
        arr_2[0]=10;
        arr_2[1]=89;
        System.out.println("print our before array");
        printarray(arr, n);
        System.out.println("print our changing array");
        printarray(arr_2, n);
    }
    
}
