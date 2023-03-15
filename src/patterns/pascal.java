package patterns;

public class pascal {

    /**
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * 1 5 10 10 5 1
     * 
     * @param args
     */

    public static void main(String[] args) {
        int n = 100;
        long startTimeNanoSecond = System.nanoTime();
        long startTimeMilliSecond = System.currentTimeMillis();

        printPascal(n);

        long endTimeNanoSecond = System.nanoTime();
        long endTimeMilliSecond = System.currentTimeMillis();

        System.out.println("Time Taken in " + (endTimeNanoSecond - startTimeNanoSecond) + " ns");
        System.out.println("Time Taken in " + (endTimeMilliSecond - startTimeMilliSecond) + " ms");

    }

    public static void printPascal(int n) {
        for (long line = 1; line <= n; line++) {

            long C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    /**
     * 
     * @param n - number of row of pascal's triangle
     */
    public static void pascalTriangleNCR(int n) {
        long s;
        for (int i = 0; i < n; i++) {
            // System.out.print(i + " ");
            for (int j = 0; j <= i; j++) {
                s = fac(i) / (fac(j) * fac(i - j));
                // System.out.print (fac(i)/(fac(j)*fac(i-j))+" ");
            }
            // System.out.println();
        }

    }

    public static long fac(int n) {

        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void recPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                recursivePascal(i, j);
                // System.out.print(recursivePascal(i,j)+" ");
            }
            // System.out.println();
        }
    }

    public static int recursivePascal(int i, int j) {
        if (j == 0 || i == j)
            return 1;
        return recursivePascal(i - 1, j) + recursivePascal(i - 1, j - 1);
    }

    //66
    public static void pascalTriangle(int n) {

        long[] arr = new long[n];
        long[] temp = new long[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp[j] = 1;
                } else {
                    temp[j] = arr[j] + arr[j - 1];
                }
            }
            for (int j = 0; j <= i; j++) {
                arr[j] = temp[j];
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
