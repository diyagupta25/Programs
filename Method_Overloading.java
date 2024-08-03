class Student4 {
    String name;
    int age;
    //Method Overloading
     public void printInfo(String name){
         System.out.println(name);
     }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age ){
        System.out.println(name+ " "+age);
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        Student4 s4 = new Student4();
        s4.name = "Diya";
        s4.age = 20;

        s4.printInfo(s4.name,s4.age);
    }
}
