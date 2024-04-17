package JAVA;

import java.util.Scanner;

public class searchelement {
    static void searcharray(int[] arr, int n,int k){
        int i,j=0;
        for(i=0; i<n; i++){
            if(arr[i]==k){
                j++;
                break;
            }
                else{
                    j=0;
                }
            }
            if(j==1){
                System.out.println("Search is found element is present in this array");
            }
            else{
                System.out.println("Search is not  found element is not present in this array");
            }
            }
        
        
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,k;
        System.out.println("enter the size of the array : ");
        n=sc.nextInt();
        System.out.println("enter the number for search : ");
        k=sc.nextInt();
        System.out.println("enter your element : ");
        int arr [] = new int[n];
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        searcharray(arr,n,k);
    }
    
}
