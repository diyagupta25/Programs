public class Array_with_loops {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 80;
        marks[3] = 90;
        marks[4] = 98;

        //displaying array using naive way
        System.out.println("Printing using naive way: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //displaying using for loop
        System.out.println("Printing using for loop: ");
        for (int i=0; i< marks.length;i++){
            System.out.println(marks[i]);
        }

        //displaying in reverse order
        System.out.println("Printing in reverse order: ");
        for(int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }

        //displaying using for each loop
        System.out.println("Printing using for each loop: ");
        for (int element: marks){
            System.out.println(element);
        }
    }
}
