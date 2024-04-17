package JAVA;
import java.util.*;

public class recursion27stringpalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string for check palindrom or not : ");
        String str=sc.nextLine();
        checkPalindrom(str);
    }
    static void checkPalindrom(String str){
        String rev="";
       rev=stringReverse(str,rev,str.length()-1);
       boolean k1=Compare(rev,str,0);
       if(k1==true){
        System.out.println("Given String Is Palindrom : ");
    }
    else{
        System.out.println("given String Is Not Palindrom : ");
    }
    }
    static String stringReverse(String str,String rev,int idx){
        if(idx==-1){
            return rev;
        }
         rev=rev+str.charAt(idx);
         return stringReverse(str, rev, idx=idx-1); 
        
           
    }
    static boolean Compare(String Strrev,String str,int idx){
        if(idx==str.length()){
            return true;
        }
        if(Strrev.charAt(idx)!=str.charAt(idx))
        {
        return false; 
        }
        return Compare(Strrev, str, idx=idx+1); 
    }
    
}
