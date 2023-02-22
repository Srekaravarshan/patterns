public class p5 {
    public static void main(String[] args) {
        String s = "";
        int n = 5;

        // *****
        // ****
        // ***
        // **
        // *
        // 2ms
        // *****
        // ****
        // ***
        // **
        // *
        // 3ms

        // method 1

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            s += "*";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s);
            s = s.substring(0, s.length() - 1);
        }

        long end = System.currentTimeMillis();
        System.out.println(
                (end - start) + "ms");

        // method 2

        long s2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        long e2 = System.currentTimeMillis();
        System.out.println((e2 - s2) + "ms");
    }
}
