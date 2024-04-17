package JAVA;

import java.util.Scanner;

public class Recursion21SearchAllIndex {
    static int[] search(int[] arr,int[] ans,int idx,int n,int k){
        if(arr.length==idx){
            return ans;
        }
        if(n==arr[idx]){
             ans[k]=idx;
            
        }
        return search(arr, ans, idx=idx+1, n, k=k+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for search : ");
        int a= Recursio19BinarySearch.inputn();
        int n;
        System.out.println("Enter the value of n : ");
        n=sc.nextInt();
        int arr [] =recursion15arrayprint.inputarray(n);
        int ans[] = new int[n];
         ans = search(arr,ans,0,a,0);
       System.out.println("Our element is present on index :");
    //    recursion15arrayprint.printarray(ans, ans.length);
        for(int i=0; i<ans.length; i++){
        //   ans[i]=new int[i+1];
            System.out.println(ans[i]);
        }
    }
}
