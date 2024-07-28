public class Try_Catch {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e ){
            System.out.print("we are not able to divide this. \nReason: ");
            System.out.println(e);
        }
    }
}
