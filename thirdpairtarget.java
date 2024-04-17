package JAVA;

import java.util.Scanner;

public class thirdpairtarget {
    static int paircount(int[] arr , int n , int target){
        int i,j,k,count=0;
        for(i=0; i<n-2; i++){
            for(j=i+1; j<n; j++){
                for(k=j+1; k<n; k++){

                if(arr[i]+arr[j]+arr[k]==target){
                    count=count+1;
                }
            }
        }
    }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,target;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("enter target=");
        target=sc.nextInt();
        System.out.println("enter your element ");
        int arr[]=new int [n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
      int  k= paircount(arr,n,target);
      System.out.println("pair of element="+k);
    }
    
}