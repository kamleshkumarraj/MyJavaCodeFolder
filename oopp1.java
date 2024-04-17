import java.io.OutputStream;
import java.util.Scanner;

class teacher{
    String name,email_id,phnumber;
    teacher(){
        name="kamlesh";
        email_id="kamlesh@";
        phnumber="8603416388";
    }
}
class student extends teacher{
    int roll,marks;
    String name,email_id,phnumber;
    student(){
        name="pintu";
        email_id="pintu@";
        phnumber="6203582892";
        roll=12;
        marks=400;
    }
    void printinfostudent(){
        System.out.println("print the student 1 details : ");
        System.out.println(name);
        System.out.println(email_id);
        System.out.println(marks);
        System.out.println(phnumber);
        System.out.println(roll);
    }
    void teacherinfo(){
        System.out.println("print the teacher details : ");
        System.out.println(super.name);
        System.out.println(super.email_id);
        System.out.println(super.phnumber);
    }
}

class student2 extends student{
    int roll,marks;
    String name,email_id,phnumber;
    student2(){
        name="Bittu";
        email_id="Bittu@";
        phnumber="9999999999";
        roll=12;
        marks=400;
    }
        void printinfostudent2(){
            System.out.println("print the student2 details : ");
            System.out.println(name);
            System.out.println(email_id);
            System.out.println(marks);
            System.out.println(phnumber);
            System.out.println(roll);
        }

}

public class oopp1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        student2 info = new student2();
        // student info1= new student();
        // oopp1 call= new oopp1();
        info.printinfostudent();
        info.printinfostudent2();
        info.teacherinfo();

    }
    
}
