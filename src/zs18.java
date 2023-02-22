public class zs18 {

    public static void main(String[] args) {
        int n = 4;
        int N = n;
        n = n*2-1;

        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int m = Math.min(Math.min(i, j), Math.min(n-i-1, n-j-1));
                System.out.print(N-m);
            }
            System.out.println("");
        }
    }
}