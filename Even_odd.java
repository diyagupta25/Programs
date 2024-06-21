import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = num.nextInt();
        if(a==2)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
