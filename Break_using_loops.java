public class Break_using_loops {
    public static void main(String[] args) {
        //break using loops
        //for loop
        for(int i=0; i<=5; i++){
            System.out.println(i);
            System.out.println("Java is great!");
            if(i==3){
                System.out.println("Loop ended here!!");
                break;
            }
        }
        System.out.println("For loop ended here!!");

        //while loop
        int a = 0;
        while(a<10){
            System.out.println(a);
            System.out.println("Java is great!");
            if(a==7){
                System.out.println("Loop ended here!!");
                break;
            }
            a++;
        }
        System.out.println("While loop ended here!!");

        //do while loop
        int b = 0;
        do {
            System.out.println(b);
            System.out.println("Java is great!");
            if(b==5){
                System.out.println("Loop ended here!!");
                break;
            }
            b++;
        }while(b<8);
        System.out.println("Do-While loop ended here!!");
    }
}
