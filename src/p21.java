public class p21 {
    public static void main(String[] args) {
        int n = 4;
        String s = "*".repeat(n);
        String sp = " ".repeat(n-2);

        // ****
        // *  *
        // *  *
        // ****

        System.out.println(s);
        for (int i = 1; i < n-1; i++) {
            System.out.println("*"+sp+"*");
        }
        System.out.println(s);

    }
}
