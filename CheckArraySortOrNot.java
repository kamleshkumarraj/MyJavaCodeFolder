package JAVA;

import java.util.Scanner;

public class CheckArraySortOrNot {
    static int checkarray(int[] arr,int n){
        int i,j=1,k=0;
        for(i=0; i<n-1; i++){
            if(arr[i]<=arr[j]){
                k=1;
            }
            else{
                k= 0;
                break;
            }
            j++;
        }
        return k;

        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,i,p;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("enter your element=");
        int arr[]=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        p=checkarray(arr,n);
        if(p==1){
            System.out.println("Given array is Sorted");

        }
        else{
            System.out.println("Given array is not Sorted");
        }
    }
    
}
