import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
//        sum of 2 integer and float by user input
        System.out.println("Enter num 1: ");
        int a = sc.nextInt();
        float ab = sc.nextFloat();
        System.out.println("Enter num 2: ");
        int b = sc.nextInt();
        float ba = sc.nextFloat();
        int sum = a + b;
        float sum2 = a + b;
        System.out.println("Sum of these number is: " +sum);
//        checking that the entered digit is integer or not
        boolean b1 = sc.hasNextInt();
        System.out.println(ab);
//        printing line's 1st word
        String str = sc.next();
        System.out.println(str);
//        printing the whole line
        String st = sc.nextLine();
        System.out.println(st);
    }
}
