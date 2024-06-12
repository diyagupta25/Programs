class myEmployee{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class Access_modifiers {
    public static void main(String[] args) {
        myEmployee diya = new myEmployee();
//        diya.id = 45;
//        diya.name = "DiyaGupta";
        diya.setName("Diyaa");
        System.out.println(diya.getName());
        diya.setId(7);;
        System.out.println(diya.getId());
    }
}
