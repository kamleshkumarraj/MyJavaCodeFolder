package JAVA;

import java.util.Scanner;

public class pascaltriangleusingarray {
    static int fact(int n){
        int f=1,i;
        for(i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    static int ncr(int n, int r ){
        int k;
        k=fact(n)/(fact(r)*fact(n-r));
        return k; 
    }
    static void printarray(int[][] arr, int row){
        int i, j;
        for(i=0; i<row; i++){
            for(j=0; j<=i; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,row,column;
        System.out.println("enter the row= ");
        row= sc.nextInt();
        // System.out.println("enter the column=");
        // column=sc.nextInt();
        int arr[][]=new int[row][];
        for(i=0; i<row; i++){
            arr[i]=new int[i+1];
            for(j=0; j<=i; j++){
                arr[i][j]=ncr(i,j);
            }
        }
       printarray(arr,row);
    }
}
