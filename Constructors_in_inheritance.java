class base1{
    base1(){
        System.out.println("I am a contructor");
    }
    base1(int a){
        System.out.println("I am a overloaded contructor with value a as: "+a);
    }
}

class derived1 extends base1{
    derived1(){
        super(0);
        System.out.println("I am a derived class constructor ");
    }
    derived1(int a, int b){
        super(a);
        System.out.println("I am a overloaded contructor of derived  with value b as: "+b);
    }
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am a overloaded contructor of derived  with value c as: "+c);
    }
}

public class Constructors_in_inheritance {
    public static void main(String[] args) {
        base1 b = new base1();
        derived1 d = new derived1(14,9);
        childOfDerived cd = new childOfDerived(2,3,4);
    }
}
