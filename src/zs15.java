public class zs15 {
    public static void main(String[] args) {
        final int n = 5;
        // for (int i=1; i<n+1; i++) {
        //     for (int j=1; j<n+1; j++) {
        //     System.out.print((i+j+3)%(n)+1+" ");
        //     }
        //     System.out.println("");
        // }

        // 1 2 3 4 5 
        // 2 3 4 5 1
        // 3 4 5 1 2
        // 4 5 1 2 3
        // 5 1 2 3 4
        
        for (int i=1; i<n+1; i++) {
            for (int j=i; j<n+1; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
