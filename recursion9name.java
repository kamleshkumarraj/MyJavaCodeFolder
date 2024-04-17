package JAVA;

import java.util.Scanner;

public class recursion9name {
    static void name(int n){
        if(n==1){
            System.out.println(("kamlesh kumar"));
            return;
        }
        else{
            System.out.println("kamlesh kumar");
            name(n-1);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time;
        System.out.println("enter the time for print name : ");
        time=sc.nextInt();
        name(time);
    }
    
}
