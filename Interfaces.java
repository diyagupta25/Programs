interface bicycle{
    int a = 11;
    void brake(int decrement);
    void speedUp(int increment);
}
interface hornBicycle{
    void blowHorn1();
    void blowHorn2();
}
class AvonCycle implements bicycle,hornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee");
    }
    public void brake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speed up");
    }
    public void blowHorn1(){
        System.out.println("Blowing horn for 1");
    }
    public void blowHorn2(){
        System.out.println("Blowing horn for 2");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.brake(1);
        System.out.println(cycle.a);
        cycle.blowHorn1();
        cycle.blowHorn2();
    }
}
