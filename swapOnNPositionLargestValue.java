//write a programm to swap the maximum value of given index;
package JAVA;

import java.util.Scanner;

public class swapOnNPositionLargestValue {
    public static void findLargest(int [] arr , int n , int p){
        int max = Integer.MIN_VALUE;
        int maxIndex=0;
        int temp;
        //first we find the maximum value
        for(int i=0; i<n; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        // then we find the index of maximum value 
        for(int i=0; i<n; i++){
            if(arr[i] == max){
                maxIndex = i;
                break;
            }
        }
        //then we swap the maximum value on given position
            p=p-1;
            temp = arr[p];
            arr[p] = arr[maxIndex];
            arr[maxIndex] = temp;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.println("Enetr your array element : ");
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            arr[i]  = sc.nextInt();
        }
        int position;
        System.out.println("Enter the position for insert largest Value : ");
        position = sc.nextInt();
        findLargest(arr,n,position);
        System.out.println("Print our array after change position : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    
    }
}
