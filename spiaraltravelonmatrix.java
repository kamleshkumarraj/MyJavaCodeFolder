package JAVA;

import java.util.Scanner;

public class spiaraltravelonmatrix {
    static void printspiralorder(int[][] arr,int row, int column){
        int toprow=0,bottomrow=row-1,leftcolumn=0,rightcolumn=column-1;
        int il=0,j;
        while(il<row*column){
            for(j=leftcolumn; j<=rightcolumn && il<row*column; j++){
                System.out.print(arr[toprow][j]+", ");
                il++;
            }
            toprow++;
            for(j=toprow; j<=bottomrow && il<row*column; j++){
                System.out.print(arr[j][rightcolumn]+", ");
                il++;
            }
            rightcolumn--;
            for(j=rightcolumn; j>=leftcolumn && il<row*column; j--){
                System.out.print(arr[bottomrow][j]+", ");
                il++;
            }
            bottomrow--;
            for(j=bottomrow; j>=toprow && il<row*column; j--){
                System.out.print(arr[j][leftcolumn]+", ");
                il++;
            }
            leftcolumn++;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row,column,i,j;
        System.out.println("enter the value of row : ");
        row=sc.nextInt();
        System.out.println("enter the value of the column : ");
        column=sc.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter the element in the array : ");
        for(i=0; i<row; i++){
            for(j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printspiralorder(arr,row,column);
    }
    
}
