package JAVA;

import java.util.Scanner;

public class findEvenOddInArray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter the array element : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] evenArr = new int[100];
        int[] oddArr = new int[100];
        int a=0, b=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                evenArr[a] = arr[i];
                a++;
            }
            else{
                oddArr[b] = arr[i];
                b++;
            }
        }
        System.out.println("Print our even element : ");
        for(int i=0; i<a; i++){
            System.out.println("Even = "+evenArr[i]);
        }
        System.out.println("Print Our odd element : ");
        for(int i=0; i<b; i++){
            System.out.println("Odd = "+oddArr[i]);
        }
    }
}
