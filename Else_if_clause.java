import java.util.Scanner;
public class Else_if_clause {
    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        int age = ag.nextInt();

        if(age>50)
            System.out.println("You are expeienced!");
        else if(age>35)
            System.out.println("You are semi-experienced.");
        else
            System.out.println("You are not experienced.");
    }
}
