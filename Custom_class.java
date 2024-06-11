class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is a custom class!");
        Employee diya = new Employee();//Initiating a new object
        Employee siya = new Employee();
        //setting attributes
        diya.id = 12;
        diya.name = "DiyaGupta";
        diya.salary = 15000;

        siya.id = 21;
        siya.name = "SiyaPandey";
        siya.salary = 10000;
        //printing the attributes
        diya.printDetails();
        siya.printDetails();
        
        int salary = siya.getSalary();
        System.out.println(salary);
    }
}
