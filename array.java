package JAVA;

import java.util.Scanner;

public class array {
    Scanner sc = new Scanner(System.in);
    public static void fun(){
        Scanner sc = new Scanner(System.in);
        int n,k=0;
        System.out.println("enter n=");
        n=sc.nextInt();


        int age [] = new int [n];
        for(int i=0; i<n; i++){
            age[i]=sc.nextInt();
            k=k+1;
        }
        System.out.println("length of array="+k);
        for(int i=n-1; i>=0; i--){
            System.out.println(age[i]);
        }
    }
    public class arraysum{
        Scanner sc = new Scanner(System.in);
        public static void ram(){
        int n=5;
        int age [] = new int[n];
        for(int i=0; i<n; i++){
            age[i]=sc.nextInt();
        }
    }
    }
        public static void main(String[] args) {
            fun();
        }
    }
    

