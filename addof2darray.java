package JAVA;

import java.util.Scanner;

public class addof2darray {
    static int[][] addarray(int[][] arr ,int [][] arr1 ,int row,int column){
        int arr2[][]=new int[row][column];
        int i,j;

        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        return arr2;
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
        Scanner sc =new Scanner(System.in);
        int i,j,row,column;
        System.out.println("Please Enter The Value of Row");
        row=sc.nextInt();
        System.out.println("Enter The Value of The Column = ");
        column=sc.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Please enter the element in First array= ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[][]=new int[row][column];
        System.out.println("PLease Enter the element in Second Array = ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        // int arr3[][]=new int[row][column];
        int arr3[][]= addarray(arr,arr1, row,column);
       printarray(arr3,row,column);
    }
    
}
