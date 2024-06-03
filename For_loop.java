import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        System.out.println("First 10 natural numbers: ");
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }

        //print first 5 odd number
        //2n = even numbers ,  2n+1 = odd numbers
        System.out.println("First 5 odd numbers: ");
        int n = 1;
        for(int a=0; a<5 ; a++){
            System.out.println(2*a+1);
        }

        //Decrementing for loop
        System.out.println("First 5 natural number in reverse order:");
        for(int i=5; i>0; i--){
            System.out.println(i);
        }

        //first n natural number in reverse order
        Scanner sc = new Scanner(System.in);
        System.out.println("First n natural number in reverse order: ");
        System.out.println("Enter a value: ");
        for(int x = sc.nextInt(); x>0; x--){
            System.out.println(x);
        }
    }
}
