package JAVA;

public class recursion16greater {
    static int findgreater(int[] arr, int k,int max){
        System.out.println(max);
        if (arr.length==k){
            return max;
        }
        if (arr[k]>max){
            max=arr[k];
            
        }
         return findgreater(arr, k+1,max);
         
         
         
    }
    public static void main(String[] args) {
        int arr[]=recursion15arrayprint.inputarray();
        int k;
        int max=findgreater(arr,k=0,arr[1]);
        System.out.println("max="+max);
    }
    
}
