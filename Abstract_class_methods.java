abstract class Base{
    public Base(){
        System.out.println("I am a constructor of base");
    }
    public void Hello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Derived extends Base{
    @Override
    public void greet() {
        System.out.println("Good evening");
    }
}
abstract class Derived2 extends Base{
    public void greet2(){
        System.out.println("Good morning");
    }
}
public class Abstract_class_methods {
    public static void main(String[] args) {
//        Base b = new Base(); not posiible because it an abstract class
        Derived d = new Derived();
    }
}
