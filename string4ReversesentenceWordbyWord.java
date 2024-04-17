package JAVA;

import java.util.*;

public class string4ReversesentenceWordbyWord {
    static String convert(String str){
        String k ="";
        String ans="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
               String  k1=reverse(k);
                ans=ans+k1+" ";
                k="";
            }
            else{
                k=k+str.charAt(i);
            }       
        }
        System.out.println(ans+" "+reverse(k));
        return ans;
    }
    static String reverse(String str){
        String k="";
        for(int i=str.length()-1; i>=0; i--){
            k=k+str.charAt(i);
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Sentence Is : ");
        String str=sc.nextLine();
        String rev=convert(str);
        // System.out.println("Our String After Reverse Word By Word : "+rev);
    }
}
