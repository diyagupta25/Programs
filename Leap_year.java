import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        int year = leap.nextInt();
        if(year % 4 == 0)
            System.out.println(year + " is leap year.");
        else
            System.out.println(year + " not a leap year");

    }
}
