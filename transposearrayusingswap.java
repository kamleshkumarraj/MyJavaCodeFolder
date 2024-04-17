package JAVA;

import java.util.Scanner;

public class transposearrayusingswap {
    static int[][] transpose(int [][] arr, int row, int column){
        int i,j,temp;
        // int arr1[][]=new int[row][column] ;
        for(i=0; i<row; i++){
            for(j=0; j<i; j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                // arr1[i][j]=arr[j][i];
            }
        }
        return arr;
        
    }
    static void print(int [][]arr,int row,int column){
        int i, j;
        for(i=0; i<row; i++){
            System.out.print("[");
            for(j=0; j<column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("]");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, row, column;
        System.out.println("enter the value of row");
        row=sc.nextInt();
        System.out.println("enter the value of the column" );
        column=sc.nextInt();
        int arr[][]=new int [row][column];
        //int arr1[][]=new int[row][column];
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
       arr= transpose(arr,row,column);
        print(arr,row,column);
    }
    
}
