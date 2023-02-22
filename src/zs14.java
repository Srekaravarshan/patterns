public class zs14 {
    public static void main(String[] args) {
        
        // 1       5 
        //   2   4   
        //     3     
        //   2   4   
        // 1       5 

        final String x = "12345";
        for (int i=0; i<x.length(); i++) {
            for (int j=0; j<x.length(); j++) {
                if (i==j) System.out.print(x.charAt(i) + " ");
                else if (i+j==x.length()-1) System.out.print(x.charAt(x.length()-1-i) + " ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
        // for (int i=0; i<x.length(); i++) {
        //     for (int j=0; j<x.length(); j++) {
        //         if (i==j) System.out.print(x.charAt(i) + " ");
        //         else if (i+j==x.length()-1) System.out.print(x.charAt(i) + " ");
        //         else System.out.print("  ");
        //     }
        //     System.out.println("");
        // }
    }
}
