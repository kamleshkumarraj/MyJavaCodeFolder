package JAVA;

import java.util.Scanner;

public class transposeofmatrix {
    static void transpose(int [][] arr,int row,int column ){
        int i,j;
        for(i=0; i<row; i++){
            System.out.print("[");
                for(j=0; j<column; j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println("]");
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,row,column;
        System.out.println("enter the value of row : ");
        row=sc.nextInt();
        System.out.println("enter the value of th ecolumn : ");
        column=sc.nextInt();
        int arr[][]=new int [row][column];
        System.out.println("enter the element in array ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr,row,column);

    }
    
}
