class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am setting y now");
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(6);
        System.out.println(b.getX());

        derived d = new derived();
        d.setX(4);
        System.out.println(d.getX());
        d.setY(9);
        System.out.println(d.getY());
    }
}
