public class Method_object_creation {
    int sum(int a , int b){
        int c;
        if(a>b){
            c = a + b;
        }else{
            c = (a + b) * 2;
        }
        return c;
    }

    //method invocation using object creation
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        Method_object_creation obj = new Method_object_creation();
        int p = obj.sum(m, n);
        System.out.println(p);
    }
}
