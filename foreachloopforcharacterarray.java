package JAVA;

import java.util.Scanner;

public class foreachloopforcharacterarray {
     static void print(char[] arr, int n){
        System.out.print("print our string is : ");
        for(char k : arr){
            System.out.print(k);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the string : ");
        n=sc.nextInt();
        System.out.println("enter your character : ");
        char arr[] = new char[n];
        for(int i=0; i<n; i++){
                arr[i]=sc.next().charAt(0);
        }
        print(arr,n);
    }
}
