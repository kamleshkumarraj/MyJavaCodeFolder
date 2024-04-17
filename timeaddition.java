package JAVA;

import java.util.Scanner;

public class timeaddition {
    int hour, minute, sec;

    timeaddition(int h, int m, int s) {
        hour = h;
        minute = m;
        sec = s;
    }
    timeaddition(){
        
    }

    static void add(timeaddition t1, timeaddition t2, timeaddition t3) {
        
        t3.hour = t1.hour + t2.hour;
        t3.minute = t1.minute + t2.minute;
        t3.sec = t1.sec + t2.sec;
        if (t3.sec >= 60) {
            t3.minute += 1;
            t3.sec = t3.sec - 60;
        }
        if (t3.minute >= 60) {
            t3.hour += 1;
            t3.minute = t3.minute - 60;
        }
        System.out.println(t3.hour + " : " + t3.minute + " : " + t3.sec);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour1, minute1, second1, hour2, minute2, second2;
        System.out.print("Enter your initial hour : ");
        hour1 = sc.nextInt();
        System.out.print("Enter your Initial minute : ");
        minute1 = sc.nextInt();
        System.out.print("Enter your initial Second : ");
        second1 = sc.nextInt();
        System.out.print("Enter your final hour : ");
        hour2 = sc.nextInt();
        System.out.print("Enter your final minute : ");
        minute2 = sc.nextInt();
        System.out.print("Enter your final Second : ");
        second2 = sc.nextInt();
        timeaddition t1 = new timeaddition(hour1, minute1, second1);
        timeaddition t2 = new timeaddition(hour2, minute2, second2);
        timeaddition t3 = new timeaddition();
        add(t1, t2, t3);
        System.out.println("Thanks for using this application ");
       

    }
}
