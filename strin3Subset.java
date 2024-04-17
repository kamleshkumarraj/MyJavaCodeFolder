package JAVA;
import java.util.*;

public class strin3Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        // System.out.println(str.substring(str.length()-1,0,-1));
        for(int i=0; i<=str.length()-1; i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
    
}
