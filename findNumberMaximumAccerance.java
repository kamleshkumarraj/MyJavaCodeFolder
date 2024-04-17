package JAVA;
//write a programm find the maximum repetated value and repetated time
import java.util.Scanner;

public class findNumberMaximumAccerance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rhe array : ");
        int n = sc.nextInt();
        System.out.println("Enter your array element : ");
        int arr[] = new int[100];
        // take input array from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // we take two new array for store the value with repetation avoid and
        // repetation time
        int darr[] = new int[100];
        int varr[] = new int[100];
        int a = 0, b = 0;
        int max = 0;
        // logic for find the value with avoid the repetation and repetation time
            for (int i = 0; i < n; i++) {
                if (arr[i] != Integer.MIN_VALUE) {
                    int count = 1;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] == arr[j]) {
                            count += 1;
                            arr[j] = Integer.MIN_VALUE;
                        }

                    }
                    // store our all value with one time.
                    varr[a] = arr[i];
                    a++;
                    // store all repetation time.
                    darr[b] = count;
                    b++;
                    // Now we find the maximum repetation time
                    if (count >= max) {
                        max = count;
                    }
                }
            }
        // then we find the index of maximum repetated value
        int mIndex = 0;
        for (int i = 0; i < b; i++) {
            if (darr[i] == max) {
                mIndex = i;
                break;
            }
        }
        // using this index we print maximum repetated value
        System.out.println("Value = " + varr[mIndex]);
        System.out.println("Repetation Time For maximum value = " + max);

    }
}
