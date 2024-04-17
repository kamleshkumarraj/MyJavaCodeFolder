package JAVA;
import java.util.*;

public class recursion28RemoveAccerance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str=sc.nextLine();
        System.out.println("enter the character for remove : ");
        char  p= sc.next().charAt(0);
        String k="";
        k=removeAccerance(str,k,p,0);
        System.out.println("After remove "+"'"+p+"'"+" in this string : "+k);
        
    }
    static String  removeAccerance(String str,String k,char p,int idx){
        if(idx==str.length()){
            return k;
        }
        if(str.charAt(idx)!=p){
            k=k+str.charAt(idx);
        }
        return removeAccerance(str, k, p, idx=idx+1);
  }    
}
