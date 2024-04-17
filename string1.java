package JAVA;

import java.util.*;

public class string1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //  String str;
        //  System.out.println("please enter your string : ");
        //  str=sc.nextLine();
        //  System.out.println(str.charAt(3));
        //  System.out.println(str); 
        //  System.out.println(str.length());
    //     for(int i=0; i<10; i++){}
    //     System.out.println(str.charAt(7));
    // System.out.println("enter your Second string : ");
    //     String str2= sc.nextLine();
    //     String str3=str+str2;
    //     str3=str3+" krr";
    //     System.out.println(str3);
    System.out.println("please enter your string : ");
    String k=sc.nextLine();
    String rev="";
    // int i=0;
    // char  p = k.charAt(i);
    // System.out.println(p);
    for(int i=k.length()-1; i>=0; i--){
        rev=rev+k.charAt(i);
    }
    int k1=checkstr(k,rev);
    if(k1==0){
        System.out.println("given string is palindrom : ");
    }
    else{
        System.out.println("given string is not palindrom : ");
    }

     }
     static int checkstr(String k, String rev){
        int k1= k.compareTo(rev);
        return k1;
     }
}
