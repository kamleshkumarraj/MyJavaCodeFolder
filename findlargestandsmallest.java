package JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class findlargestandsmallest {
    static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;

    }
     int[] smalllargest(int[] arr,int n){
        sort(arr);
        int [] ans={arr[0],arr[arr.length-1]};
            return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findlargestandsmallest kam=new findlargestandsmallest();
        int n,i;
        System.out.println("enter n=");
        n=sc.nextInt();
        int arr [] =new int[n];
        System.out.println("enter your element");
        for(i=0; i<n; i++){
        arr[i]=sc.nextInt();}

        int k[]=kam.smalllargest(arr,n);
        System.out.println("smallest="+k[0]+"\nlargest="+k[1]);

    }
    
}
