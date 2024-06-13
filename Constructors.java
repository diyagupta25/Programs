class myMainEmployee{
    private int id;
    private String name;
    public myMainEmployee(){
        id = 56;
        name = "Your-Name-Here";
    }
    public myMainEmployee(String myName, int myId){
            id = myId;
        name = myName;
    }
    public myMainEmployee(String myName){
        name = myName;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        myMainEmployee diya = new myMainEmployee("Diyaaa", 12 );
//        diya.setName("Diya gupta");
//        diya.setId(30);
        System.out.println(diya.getId());
        System.out.println(diya.getName());
    }
}
