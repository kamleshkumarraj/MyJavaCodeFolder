package JAVA;
import java.util.Arrays;

import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        int n,count=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        System.out.println("Enter the element of the array : ");
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int freqArr[] = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!=Integer.MIN_VALUE){
                
            
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j+1]){
                    count+=1;
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            freqArr[i] = count;
        }
    }
    System.out.println("Frequency is : ");
    for(int i=0; i<freqArr.length; i++){
        if(arr[i]!=0){
        System.out.println(freqArr[i]);
        }
    }
    }
}
