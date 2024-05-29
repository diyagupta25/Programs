import java.util.Scanner;

public class calculate_percentage {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Calculating the percentage of student");
        System.out.println("----Please enter your marks----");

        System.out.println("Enter your 1st subject marks: ");
        int a = marks.nextInt();
        System.out.println("Enter your 2nd subject marks: ");
        int b = marks.nextInt();
        System.out.println("Enter your 3rd subject marks: ");
        int c = marks.nextInt();
        System.out.println("Enter your 4th subject marks: ");
        int d = marks.nextInt();
        System.out.println("Enter your 5th subject marks: ");
        int e = marks.nextInt();
        int sum = a + b + c + d + e;

        System.out.println("Total marks: ");
        System.out.println(sum);

        System.out.println("Percentage is: ");
        float percentage = sum*100/500;
        System.out.println(percentage);
    }
}
