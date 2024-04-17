package JAVA;
import java.util.*;


public class string5WordReverseusingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String As A Sentence : ");
    StringBuilder str= new StringBuilder(sc.nextLine());
    StringBuilder store= new StringBuilder(" ");
    StringBuilder ans= new StringBuilder("");
    for(int i=0; i<str.length(); i++){
        if(str.charAt(i)==' '){
            store.reverse();
            ans.append(store);
            ans.append(" ");
            store.delete(0, store.length());
        }
        else{
            store.append(str.charAt(i));
        }
    }
    System.out.println(ans+""+store.reverse());
}
}
