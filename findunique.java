package JAVA;

import java.util.Scanner;

public class findunique {
    static  int unique(int[] arr, int n){
        int i,j,p=0;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(i=0; i<n; i++){
            if(arr[i]>0){
                p= arr[i];
            }
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,n;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("enter your element=");
        int arr []=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       int k= unique(arr,n);
       System.out.println("Unique element="+k);
    }
    
}
