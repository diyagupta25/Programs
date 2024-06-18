import java.util.Scanner;

public class Largest_among3 {
    public static void main(String[] args) { 
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if(a>b)
            System.out.println("a is greater than b and c.");
        else if(b>c)
            System.out.println("b is greater than a and c.");
        else
            System.out.println("c is greater than a and b");

    }
}
