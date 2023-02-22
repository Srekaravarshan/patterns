public class zs19 {
    public static void main(String[] args) {

    //      0    
    //     101   
    //    21012  
    //   3210123 
    //  432101234

        final int n = 5;
        for (int i=0;i<n;i++) {
            for (int j=n-1;j>=0;j--) {
                if (i<j) System.out.print(" ");
                else System.out.print(j);
            }
            for (int k=1;k<n;k++) {
                if (i>k-1) System.out.print(k);
            }
            System.out.println("");
        }
    }
}
