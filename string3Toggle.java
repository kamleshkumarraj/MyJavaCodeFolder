package JAVA;

import java.util.Scanner;

public class string3Toggle {
    static String  convert(String str){
        String newstr="";
        for(int i=0; i<str.length(); i++){
            char k= str.charAt(i);
            if(k>='a'&&k<='z'){
                int k1=(int)k;
                k1=k1-32;
                k=(char)k1;
                newstr=newstr+k;
            }
            else if(k>='A'&&k<='Z'){
                int k1=(int)k;
                k1=k1+32;
                k=(char)k1;
                newstr=newstr+k;

            }
            else{
                newstr=newstr+k;
            }   
        }
        return newstr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        String str1=convert(str);
        System.out.println("String after Convert : "+str1);
    }
}
