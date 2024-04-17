package JAVA;

import java.util.Scanner;

public class findUniqueValueIn2Array {
    public static void printArray(int[] arr, int n){
        System.out.println("Print our array after changing : ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the element in first array : ");
        int arr1 [] = new int[100];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the size of the second array : ");
        int n1 = sc.nextInt();
        System.out.println("Enter element in second array : ");
        int arr2[] = new int[100];
        for(int i=0; i<n1; i++){
            arr2[i] = sc.nextInt();
        }
//         //first copy our second array in first array;
//         int a=0;
//         for(int i=n; i<n1+n; i++){
//             arr1[i] = arr2[a];
//             a++;
//         }
//         //Then we find only unique value
//         for(int i=0; i<n+n1; i++){
//             if(arr1[i] != Integer.MIN_VALUE){
//             int a1=0;
//             for(int j=i+1; j<n+n1; j++){
//                 if(arr1[i] == arr1[j] ){
//                     arr1[j] = Integer.MIN_VALUE;
//                     a1=1;
//                 }
//             }
//             if(a1==1){
//                 arr1[i] =Integer.MIN_VALUE;
//             }
//         }
//     }
//     //then store our all unique value in a new array 
// int newarr[] = new int[100];
// int index = 0;
//     for(int i=0; i<n+n1; i++){
//         if(arr1[i] != Integer.MIN_VALUE){
//             newarr[index] = arr1[i];
//             index++;
//         }
//     }
    // for(int i=0; i<n; i++){
    //     int a1=0;
    //     for(int j=0; j<n1; j++){
    //         if(arr1[i] == arr2[j]){
    //             arr2[j] = Integer.MIN_VALUE;
    //             a1=1;
    //         }
    //     }
    //     if(a1==1){
    //         arr1[i] = Integer.MIN_VALUE;
    //     }
    // }
    // int newarr[] =  new int[100];
    // int a=0;
    // for(int i=0; i<n; i++){
    //     if(arr1[i] != Integer.MIN_VALUE)
    //     {
    //         newarr[a] = arr1[i];
    //         a++;
    //     }

    // }
    // for(int i=0; i<n1; i++){
    //     if(arr2[i] != Integer.MIN_VALUE){
    //         newarr[a] = arr2[i];
    //         a++;
    //     }
    // }

    //     for(int i=0; i<n; i++){
    //     int a1=0;
    //     for(int j=0; j<n1; j++){
    //         if(arr1[i] == arr2[j]){
    //             arr2[j] = Integer.MIN_VALUE;
    //             a1=1;
    //         }
    //     }
    //     if(a1==1){
    //         arr1[i] = Integer.MIN_VALUE;
    //     }
    // }
    // int newarr[] =  new int[100];
    // int a=0;
    // for(int i=0; i<n; i++){
    //     if(arr1[i] != Integer.MIN_VALUE)
    //     {
    //         newarr[a] = arr1[i];
    //         a++;
    //     }

    // }
    // for(int i=0; i<n1; i++){
    //     if(arr2[i] != Integer.MIN_VALUE){
    //         newarr[a] = arr2[i];
    //         a++;
    //     }
    // }
    int b=0;
    int ansarr[] = new int[100];
    for(int i=0; i<n; i++){
        int a=0;
        for(int j=0; j<n; j++){
            if(arr1[i] == arr2[j]){
                arr2[j] = Integer.MIN_VALUE;
                a=1;
            }
            
       
        }
             if(a==1){
                ansarr[b] = arr1[i];
                b++;

            }
    }
    int newarr[] = new int[100];
    int c=0;
    for(int i=0; i<n1; i++){
        if(arr2[i] != Integer.MIN_VALUE){
            newarr[c] =arr2[i];
            c++;
        }
    }
    printArray(newarr, c);
    for(int i=0; i<c; i++){
        int a=0;
        if(newarr[i] != Integer.MIN_VALUE){
        for(int j=i+1; j<c; j++){
            if(newarr[i] == newarr[j]){
                a=1;
                newarr[j] = Integer.MIN_VALUE;

            }
        }
        if(a==1){
            ansarr[b] =newarr[i];
            b++;
        }
    }
}
        printArray(ansarr,b);
    }
}
