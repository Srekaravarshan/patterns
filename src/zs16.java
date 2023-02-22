public class zs16 {
    public static void main(String[] args) {

        // 1 3 6 10 15  
        // 2 5 9 14 20  
        // 4 8 13 19 26 
        // 7 12 18 25 33
        // 11 17 24 32 41

        final int n = 5;
        int k = 1;
        for (int i = 1; i < n + 1; i++) {
            int s = k;
            for (int j = 1; j < n + 1; j++) {
                System.out.print(s + " ");
                s += j + i;
            }
            k+=i;
            System.out.println("");
        }
    }
}
