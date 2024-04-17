package JAVA;

public class Recursion20SearchReturnIndex {
    static int search(int[] arr, int idx, int n){
        if(idx==arr.length){
            return -1;
        }
        if(n==arr[idx]){
            return idx;
        }
        return search(arr, idx=idx+1, n);
    }
    public static void main(String[] args) {
        System.out.println("enter the value for search");
        int  n=Recursio19BinarySearch.inputn();
        int arr[]=recursion15arrayprint.inputarray();
        int k=search(arr,0,n);
        if(k==-1){
            System.out.println(n+" is not present in this array so return -1 : ");
        }
        else{
            System.out.println(n+" is present on the index number "+k+" :");
        }

    }
}
