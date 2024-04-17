package JAVA;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;



public class newarray1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
            int T;
             T = sc.nextInt();
            for(int k=0; k<T; k++){
                int row,column;
                int[][] arr = new int[10][10];
                row = sc.nextInt();
                column = sc.nextInt();
                for(int i=0; i<row; i++){
                    for(int j=0; j<column; j++){
                        arr[i][j] = sc.nextInt();
                    }
                }
                int[][] newarr = new int[10][10];
                for(int i=0; i<row; i++){
                    for(int j=0; j<column; j++){
                        newarr[i][j] = arr[j][i];
                    }
                }
                for(int i=0; i<row; i++){
                    for(int j=0; j<column; j++){
                        if(newarr[i][j] == 0){
                            newarr[i][j] =1;
                        }
                        else{
                            newarr[i][j] = 0;
                        }
                    }
                }
                for(int i=0; i<row; i++){
                    for(int j=0; j<column; j++){
                        System.out.print(newarr[i][j]+" ");
                    }
                    System.out.println();
                }
                
            }
        }
    }

