package JAVA;
import java.util.Scanner;
public class pone {

    static int[] sort(int[] arr,int n){
        int i,j,temp;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(arr[i]>=arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                  }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,k;
        System.out.println("enter the number of element for array : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int max[]=new int[n];
        System.out.println("enter the element of the array : ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        max=sort(arr,n);
        copyarray.printarray(max, n);


    }   
}
