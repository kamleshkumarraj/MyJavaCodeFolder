package JAVA;
class stk{
    String Name;
    stk(String Name){
        this.Name = Name;
    }
    void show(){
        System.out.println("My Name Is "+Name);
    }
}

public class newouter {
    public static void main(String[] args) {
        stk obj = new stk("Kamlesh Kumar");
        obj.show();
    }
    
}
