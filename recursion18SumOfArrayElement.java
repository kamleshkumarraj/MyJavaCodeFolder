package JAVA;

public class recursion18SumOfArrayElement {
    static int add(int[] arr, int idx,int sum){
        if(idx==arr.length){
            return sum;
        }
        sum=sum+arr[idx];
        return add(arr, idx=idx+1, sum);
    }
    public static void main(String[] args) {
        int arr[]=recursion15arrayprint.inputarray();
        int sum=add(arr,0,0);
        System.out.println("Sum of total array element is : "+sum);

    }
    
}
