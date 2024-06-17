import java.util.Scanner;
public class Swap_2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swap a is " + a +" and b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap a is " + a +" and b is " + b);
    }
}
