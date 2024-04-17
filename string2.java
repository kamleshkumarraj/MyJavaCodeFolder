package JAVA;

import java.util.Scanner;

public class string2 {
    static String findvowel(String str){
        String k="";
        for(int i=0; i<str.length(); i++){
            char k1=str.charAt(i);
            if(k1=='a'||k1=='e'||k1=='i'||k1=='o'||k1=='u'||k1=='A'||k1=='E'||k1=='I'||k1=='O'||k1=='U'){
                k=k+k1;
            }
        }
        return k;
    }
    static String findconsonant(String str){
        String k="";
        for(int i=0; i<str.length(); i++){
            char k1=str.charAt(i);
            if(k1=='a'||k1=='e'||k1=='i'||k1=='o'||k1=='u'||k1=='A'||k1=='E'||k1=='I'||k1=='O'||k1=='U'){ 
            }
            else{
                k=k+k1;
            }
        }
        return k;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("enter your string : ");
        str=sc.nextLine();
        String p= findvowel(str);
        String p1=findconsonant(str);
        System.out.println("Only Vowel Character IS : "+p);
        System.out.println("Only Consonant Character Is : "+p1);
    }
}
