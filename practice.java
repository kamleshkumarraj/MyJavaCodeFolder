package JAVA;
import java.util.*;
    public class practice{

      public static int[] arrayreverse(int[] arr , int n){
        int a= n-1,temp;
        for(int i=0; i<n/2; i++){
          temp = arr[i];
          arr[i] = arr[a];
           arr[a] =temp;

           a--;
        }
        return arr;
       

      // System.out.println("Print our array after reverse : ");
      // for(int i=0; i<n; i++){
      //   System.out.println(arr[i]);
      // }
      }


      
    public  static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    //   System.out.println("Enter the size of the string : ");
    //   int n= sc.nextInt();
    //   System.out.println("Enter Your Character : ");
    //   char str[]=new char[n];
    //   for(int i=0; i<n; i++){
    //     str[i]=sc.next().charAt(0);
    //   }
    //   reverse(str,n);
    //   System.out.println("print our array after reverse : ");
    //   for(int i=0; i<n; i++){
    //     System.out.print(str[i]);
    //   }
    // }
    // static void reverse(char[] str, int n){
    //   int j=n-1;
    //   char temp;
    //   for(int i=0; i<j; i++){
    //     temp=str[i];
    //     str[i]=str[j];
    //     str[j]=temp;
    //     j--;
    //   }

      int n;
      System.out.println("Enter the size of the arrya : ");
      n= sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the element of the array : ");
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
     int[] arr1 =  arrayreverse(arr,n);
      System.out.println("Print our array after reverse : ");
      for(int i=0; i<n; i++){
        System.out.println(arr1[i]);
      }


    }

     }

     

    

