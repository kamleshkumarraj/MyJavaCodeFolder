package JAVA;
import java.util.*;

public class findArrayOfDuplicateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter your array element : ");
        int [] arr = new int[100];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int[] duplicateArr = new int[10];
        int a=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=Integer.MIN_VALUE){
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(arr[i] == arr[j]){
                        duplicateArr[a] = arr[i];
                        a++;
                        arr[i]=Integer.MIN_VALUE;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
            }
        }
    }
    System.out.println("Print the array of duplicate value : ");
    for(int i=0; i<a; i++){
        System.out.println(duplicateArr[i]);
    }
    }
}
