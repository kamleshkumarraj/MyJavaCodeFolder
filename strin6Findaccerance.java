package JAVA;

import java.util.Scanner;

public class strin6Findaccerance {
    static String find(String str){
        String ans="";
        int count;
        int i=0;
        int p=0;
        for(i=0; i<str.length(); i=i+count){
            char k= str.charAt(i);
            count=0;
            for(int j=i; j<str.length(); j++){
                if(k==str.charAt(j)){
                count=count+1;
                }
                else{
                    break;
                }
            }       
            p=count+p;
            ans=ans+(k+""+count+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your atring like as (aaaammmmkkjjj) : ");
        String str = sc.nextLine();
       String p= find(str);
       System.out.println(p);
    }
}
