package JAVA;

import java.util.Scanner;

public class Recursio19BinarySearch {
    static boolean search(int[] arr, int idx,int s){
        if(idx==arr.length){
            return false;
        }
        if(s==arr[idx]){
            return true;

        }
        return search(arr, idx=idx+1, s );
    }
    static int inputn(){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
        System.out.println("enter the value for search : ");
        int n=inputn();
        int arr[] = recursion15arrayprint.inputarray();
       boolean p= search(arr, 0,n);
       if (p==true){
        System.out.println(n+" is present in this array : ");
       }
       else{
        System.out.println(n+" is not present in this array : ");
       }   
    }
}
