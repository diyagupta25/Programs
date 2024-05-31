public class Precedence_associativity {
    public static void main(String[] args) {
        int a = 6 * 5 - 20/4;
        // * and / are together so we did this calculation from left to right
        // 30 - 5 = 25
        System.out.println(a);

        int b = 60/5 - 40 * 2;
        // 12 - 80 = -68
        System.out.println(b);

        int e = 2;
        int f = 5;
        int g = 3;
        int v = e * e - (4 * g * f)/(2 * g);
        /*      2*2-(4*3*5)/(2*3)
                2*2-(60)/(2*3)
                2*2-(60)/(6)
                2*2-(60)/(6)
                4-(60)/(6)
                4-10
                -6      */
        System.out.println(v);
    }
}
