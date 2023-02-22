public class zs11 {

    // 1
    // 2 6
    // 3 7 10
    // 4 8 11 13
    // 5 9 12 14 15
    public static void main(String[] args) {
        final int n = 5;
        for (int i = 1; i < n + 1; i++) {
            int s = i;

            for (int j = n; j > 0; j--) {

                System.out.print(s + " ");
                s += j - 1;
                if (j + i == n + 1)
                    break;
            }
            System.out.println("");
        }
    }
}