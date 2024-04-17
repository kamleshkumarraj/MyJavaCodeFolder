package JAVA;

import java.util.Scanner;

public class rotationofmatrix {
    static void transpose(int[][] arr, int row, int column){
     int i,j,temp;
        for(i=0; i<row; i++){
            for(j=0; j<i; j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // int arr1[][]=new int[row][column];
        // for(i=0; i<row; i++){
        //     for(j=0; j<column; j++){
        //         arr1[i][j]=arr[j][i];
        //     }
        // }
        
    }
    static void rowreverse(int[] arr,int row){
        int i,j,temp;
        j=row-1;
        for(i=0; i<j; i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;

        }
        
    }
    static void rotate(int[][] arr,int row, int column){
        int i;
         transpose(arr,row,column);
         for(i=0; i<row; i++){
            rowreverse(arr[i],row);
         }
        print(arr,row,column);
    }
    static void print(int [][] arr,int row,int column ){
        int i,j;
        for(i=0; i<row; i++){
            System.out.print("[");
                for(j=0; j<column; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("]");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,row,column;
        System.out.println("enter the value of the row : ");
        row=sc.nextInt();
        System.out.println("enter the value of the column : ");
        column=sc.nextInt();
        int [][]arr=new int[row][column];
        System.out.println("enter your element in matrix : ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        rotate(arr,row,column);
    }
    
}
