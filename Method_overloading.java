public class Method_overloading {
    static void ab(){
        System.out.println("Good Morning!!");
    }
    static void ab(int a){
        System.out.println("Good Morning it's " + a + "am wake up!!");
    }
    static void change(int a){
        a = 9;
    }
    static void change2(int [] arr){
        arr[1] = 93;
    }
    static void joke(){
        System.out.println("I created a new world!");
    }

    public static void main(String[] args) {
        //method overloading
        ab();
        ab(8);

        //case 1: change the integer
        int y = 8;
        change(y);
        System.out.println("Value of y after change - " + y);

        //case 2: changing in array
        int [] marks = {85,86,87,88,89,90};
        change2(marks);
        System.out.println("Value after changes - " + marks[1]);

        joke();
    }
}
