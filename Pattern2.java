public class Pattern2 {
    public static void main(String[] args)
    {
        int k = 5;
        int a, b;

        // 1st loop
        for (a = 0; a < k; a++) {

            // nested 2nd loop
            for (b = 2 * (k - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }
}
