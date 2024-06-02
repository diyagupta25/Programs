import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to be adult.");
                break;
            case 23:
                System.out.println("You are going to be get a job.");
                break;
            case 60:
                System.out.println("You are going to be retired.");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
