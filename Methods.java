public class Methods {
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = a + b;
        }else{
            c = (a + b) * 2;
        }
        return c;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        int p = logic(m,n);
        System.out.println(p);

        int x = 2;
        int y = 1;
        int z = logic(x,y);
        System.out.println(z);
    }
}
