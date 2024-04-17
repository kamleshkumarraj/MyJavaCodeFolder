package JAVA;

import java.util.Scanner;

public class matrixmultiplication {
    static int[][] multiply(int[][] arr1,int[][]arr2,int row,int column){
        int arr3[][]=new int[row][column];
        int i,j,k;
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr3[i][j]=0;
                for(k=0; k<column; k++){
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }
        return arr3;

    }
    static void printarray(int [][] arr,int row,int column ){
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
        int arr1[][]=new int[row][column];
        System.out.println("enter the element in first matrix : ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[row][column];
        System.out.println("enter the element in Second  matrix : ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
     int arr3[][]=   multiply(arr1,arr2,row,column);
     printarray(arr3,row,column);
    }
    
}
