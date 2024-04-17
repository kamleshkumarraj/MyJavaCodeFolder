package JAVA;
import java.util.Scanner;

public class findsecondlargest {
    static int arraymax(int[] arr, int n){
        int i,max=0;
        arr[0]=max;
        for(i=1; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int Findsecondlargest(int[] arr ,int n){
       int p,x=0;
        p= arraymax(arr,n);
        int i;
        for(i=0; i<n; i++){
            if(arr[i]==p){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        x = arraymax(arr, n);
        return x;

    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("enter n=");
    n=sc.nextInt();
    int arr [] =new int[n];
    System.out.println("enter your element");
    for(i=0; i<n; i++){
    arr[i]=sc.nextInt();}
   int p= Findsecondlargest(arr,n);
   System.out.println("Second largest number ="+p);
    }
}
