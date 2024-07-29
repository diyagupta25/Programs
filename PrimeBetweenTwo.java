import java.util.Scanner;
public class PrimeBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Prime numbers between " + a + " and " + b + ":");

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so the number is not prime
            }
        }

        return true; // No divisors found, so the number is prime
    }
}
