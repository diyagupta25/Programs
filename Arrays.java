public class Arrays {
    public static void main(String[] args) {
        //storing marks of 5 students
        //using single line
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 80;
        marks[3] = 90;
        marks[4] = 98;
//        marks[5] = 95; (this will give error because we are storing 5 student data so it will be till 4 index
        System.out.println(marks[3]);
        //using multiple line
        int [] Marks;
        Marks =  new int[5];
        Marks[0] = 100;
        Marks[1] = 70;
        Marks[2] = 80;
        Marks[3] = 90;
        Marks[4] = 98;
        System.out.println(Marks[0]);

        //declare and initialization both
        int [] MARKS = {98, 97, 95, 90, 89};
        System.out.println(MARKS[4]);
        System.out.println(MARKS.length);
    }
}
