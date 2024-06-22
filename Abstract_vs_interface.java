interface Ab{
    void a();
    void b();
    void c();
    void d();
}

//Creating abstract class that provides the implementation of one method of A interface
abstract class Ba implements Ab{
    public void c(){System.out.println("I am C");}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends Ba{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

public class Abstract_vs_interface {
    public static void main(String[] args) {
        Ab a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }

}
