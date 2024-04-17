package JAVA;
import java.util.*;

public class recursion29PalindromWithoutReverse {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your String For Check Palindrom : ");
      String str= sc.nextLine();
      boolean k=palindrom(str,0,str.length()-1); 
      if(k==true){
        System.out.println("Given String Is Palindrom : ");
    }
    else{
        System.out.println("given String Is Not Palindrom : ");
    } 
    }
    static boolean palindrom(String str,int i,int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
         return palindrom(str, i=i+1, j=j-1);
    }
}
