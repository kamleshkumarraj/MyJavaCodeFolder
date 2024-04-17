package JAVA;

import java.util.Scanner;

public class arrayclass {
    static void printArray(String [] arr,int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k=sc.nextLine();
        System.out.println("'"+k+"'");
    }
}
