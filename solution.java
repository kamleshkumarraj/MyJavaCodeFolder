package JAVA;

import java.util.Scanner;

public class solution { 
   
    public static int findmaxindex(String s){
        int max = Integer.MIN_VALUE;
        int max_index=0;
        for(int i=0; i<s.length()-1; i++){
            char c1 = s.charAt(i);
            int v = (char)c1;
            if(v>=max){
                max = v;
            }
           
            
            
        }
         char c1 = (char)max;
         for(int i=0; i<s.length()-1; i++){
             if(c1 == s.charAt(i)){
                 max_index = i;
                 break;
             }
         }
     
         return max_index;
    }
    public static int findminindex(String s){
    int min = Integer.MAX_VALUE;
    int min_Index = 0;
        for(int i=0; i<s.length()-1; i++){
            char c1 = s.charAt(i);
            int v = (char)c1;
            if(v<=min){
                min = v;
            }
           
            
            
        }
         char c1 = (char)min;
         for(int i=0; i<s.length()-1; i++){
             if(c1 == s.charAt(i)){
                 min_Index = i;
                 break;
             }
         }
        
         return min_Index;
        
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int maxIndex;
        int minIndex;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
    maxIndex = findmaxindex(s);
    minIndex = findminindex(s);
    System.out.println(minIndex);
    System.out.println(maxIndex);
        // System.out.println(s.charAt(8));
        for(int i=maxIndex; i<=maxIndex+k; i++){
            largest += s.charAt(i);
           
         
        }
        for(int i=minIndex; i<=minIndex+k; i++){
            smallest += s.charAt(i);
            // System.out.println(smallest);
        }
 
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
    

