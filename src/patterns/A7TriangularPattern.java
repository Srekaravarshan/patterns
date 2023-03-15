package patterns;

public class A7TriangularPattern {
        // *
        // * *
        // * * *
        // *     *
        // * *   * *
        // * * * * * *
        // *     *     *
        // * *   * *   * *
        // * * * * * * * * *

        public static void main(String[] args) {
            int n = 3;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j<=n; j++) {
                    boolean flag = true;
                    for (int k = 1; k <= i*2; k++) {

                        if (flag) {
                            for (int k2 = 0; k2 < j; k2++) {
                                System.out.print("* ");
                            }
                        }
                        else
                        for (int k2 = 0; k2 < n-j; k2++) {
                            System.out.print("  ");
                        }

                        flag=!flag;
                        // System.out.println();
                    }
                    System.out.println();
                }
                // System.out.println();
            }
        }
}
