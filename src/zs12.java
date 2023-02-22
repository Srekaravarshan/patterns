public class zs12 {

    //         1 
    //       2 2 
    //     3 3 3 
    //   4 4 4 4 
    // 5 5 5 5 5 

    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<n+1;i++) {
            for (int j=1; j<n+1; j++) {
                if (i+j < n+1) System.out.print("  ");
                else System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
