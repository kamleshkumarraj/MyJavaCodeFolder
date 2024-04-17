package JAVA;

import java.util.Scanner;

public class findlastaccerance {
    static int countlastaccerance(int[] arr,int n, int ac){
        int i,lastindex=0;
        for(i=0; i<n; i++){
            if(arr[i]==ac){
                lastindex=i;
            }
        }
        return lastindex;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac,n,i,k;
        System.out.println("enter n=");
        n=sc.nextInt();
        System.out.println("enter accerance for search");
        ac=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter element=");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        k=countlastaccerance(arr,n,ac);
        System.out.println("last accerance index ="+k);
    }
    
}
