class base2{
    int a;
    public int getA() {
        return a;
    }
    base2(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class derived2 extends base2{
    derived2(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}

public class This_super_keyword {
    public static void main(String[] args) {
        base2 e = new base2(7);
        derived2 d = new derived2(5);
        System.out.println(e.getA());
    }
}
