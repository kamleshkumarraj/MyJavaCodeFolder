package JAVA;

import java.util.Scanner;

public class practicearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,column,i,j,k;
        
        System.out.println("enter the value of the row : ");
        row=sc.nextInt();
        System.out.println("enter the value of the column : ");
        column=sc.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("print Our Pattern : ");
        int toprow=0,bottomrow=row-1,leftcolumn=0,rightcolumn=column-1;
        int il=0;
        k=1;
        while(il<row*column){
            for(j=leftcolumn; j<=rightcolumn && il<row*column; j++){
                arr[toprow][j]=k;
                il++;
            }
            toprow++;
            for(j=toprow; j<=bottomrow && il<row*column; j++){
                arr[j][rightcolumn]=k;
                il++;
            }
            rightcolumn--;
            for(j=rightcolumn; j>=leftcolumn && il<row*column; j--){
                arr[bottomrow][j]=k;
                il++;
            }
            bottomrow--;
            for(j=bottomrow; j>=toprow && il<row*column; j--){
                arr[j][leftcolumn]=k;
                il++;
            }
            leftcolumn++;
            k++;
        }
        matrixmultiplication.printarray(arr,row,column);
    }
    

    }
    

