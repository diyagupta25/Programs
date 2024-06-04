import java.util.Scanner;
public class Do_while_loop {
    public static void main(String[] args) {
        //print 1 to 6 number
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a<6);

        //print first n natural number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
