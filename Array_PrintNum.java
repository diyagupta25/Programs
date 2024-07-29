import java.util.Scanner;
public class Array_PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter numbers you want in array: ");

        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        System.out.print("Enter a number you want to find: ");
        int x = sc.nextInt();

        for (int i=0; i< num.length; i++){
            if (num[i] == x){
                System.out.println(x +" found at index: "+i);
            }
        }

    }
}
