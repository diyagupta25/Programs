import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = "Diya";
        System.out.print("My name is: ");
        System.out.println(name);

        int a = 56;
        float  b = 78.45f;
        System.out.printf("The value of a is %d and value of b is %f", a, b);
        System.out.format("\nThe value of a is %d and value of b is %f\n", a, b);

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

    }
}
