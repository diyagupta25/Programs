public class Continue_using_loops {
    public static void main(String[] args) {
        //continue using loops
        //for loop
        for(int i=0; i<=10; i++){
            if(i==3){
                System.out.println("Loop ended here!!");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great!");
        }
        System.out.println("For loop ended here!!");

        //while loop
        int a = 0;
        while(a<10){
            a++;
            if(a==7){
                System.out.println("Loop ended here!!");
                continue;
            }
            System.out.println(a);
            System.out.println("Java is great!");
        }
        System.out.println("While loop ended here!!");

        //do while loop
        int b = 0;
        do {
            b++;
            if(b==5){
                System.out.println("Loop ended here!!");
                continue;
            }
            System.out.println(b);
            System.out.println("Java is great!");
        }while(b<8);
        System.out.println("Do-While loop ended here!!");
    }
}
