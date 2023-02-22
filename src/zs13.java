public class zs13 {
    public static void main(String[] args) {
        final int n = 5;
        
        int even = 2;
        int odd = 1;

        // 1 
        // 2 4
        // 3 5 7
        // 6 8 10 12
        // 9 11 13 15 17

        for (int i=0;i<n;i++) {
            for (int j=0; j<=i; j++) {
                if (i%2!=0) {
                    System.out.print(even+" ");
                    even+=2;
                } else {
                    System.out.print(odd+" " );
                    odd+=2;
                }
            }
            System.out.println();

        }
    }
}
