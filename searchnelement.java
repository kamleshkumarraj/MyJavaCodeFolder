package JAVA;

import java.util.Scanner;

public class searchnelement {
    static int [] makefreq(int[] arr){
        int freq[]=new int[100005];
        int n=arr.length;
        int i;
        for(i=0; i<n; i++){
            freq[arr[i]]++;
        }
        return freq;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,n,q,x;
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        System.out.println("enter the value of the array : ");
        int arr []=new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();

        }
        int freqarr[]=makefreq(arr);
        System.out.println("enter the number of the quarries : ");
        q=sc.nextInt();
        for(i=0; i<q; i++){
            System.out.println("enter the number for search");
            x=sc.nextInt();
            if(freqarr[x]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }

    }
    
}
