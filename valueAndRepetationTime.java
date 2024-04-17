package JAVA;
//write a programm for find the each value and repetated time
import java.util.Scanner;

public class valueAndRepetationTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array element : ");
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]!=Integer.MIN_VALUE){
                int count =1;
                for(int j=i+1; j<n; j++){
                    if(arr[i] == arr[j]){
                        count += 1;
                        arr[j] = Integer.MIN_VALUE;
                    }
                }
                System.out.println("Value = "+arr[i]+"   Repetation Time = "+count);
            }
        }
    }
}
