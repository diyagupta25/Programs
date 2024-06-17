class one{
    public void greet(){
        System.out.println("Good morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}
class two extends one{
    public void welcome(){
        System.out.println("Welcome home");
    }
    public void name(){
        System.out.println("My name is java");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        one obj = new one();
        two obj2 = new two();
        one obj3 = new two();
        obj3.name();
        obj3.greet();
//        obj3.welcome(); not allowed
    }
}
