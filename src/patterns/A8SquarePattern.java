package patterns;

public class A8SquarePattern {
        //  * * * * * * * * *
        //  *   *   *   *   *
        //  * * *   *   *   *
        //  *       *   *   *
        //  * * * * *   *   *
        //  *           *   *
        //  * * * * * * *   *
        //  *               *
        //  * * * * * * * * *


        public static void main(String[] args) {
            int n = 4;

            int s = n*2+1;

            for (int i = 0; i < s; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i%2==0||  j==0)
                    System.out.print("* ");
                    else System.out.print("  ");
                }
                for (int j = 0; j < s-i-1; j++) {
                    if((j+i+1)%2==0 || i==0 )
                    System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();
            }
        }

}
