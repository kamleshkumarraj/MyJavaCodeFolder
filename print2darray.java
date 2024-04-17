package JAVA;

import java.util.Scanner;

public class print2darray {
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
        Scanner sc = new Scanner(System.in);
        int i,j,row,column;
        System.out.println("enter your rows = ");
        row=sc.nextInt();
        System.out.println("enter your column = ");
        column=sc.nextInt();
        int arr[] [] = new int [row][column];
        System.out.println("Enter your array element = ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printarray(arr,row,column);

    }
    
}
