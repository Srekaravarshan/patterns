public class zs110 {
    public static void main(String[] args) {
        
        // zohocor
        //      p 
        //     o  
        //    r   
        //   a    
        //  t     
        // ionteam

        final String s = "zohocorporationteam";
        int matsize = (s.length()+2)/3;

        // top
        System.out.println(s.substring(0,matsize));

        // middle
        for (int i=0; i<matsize-2; i++) {
            for (int j=0; j<matsize; j++) {
                if (i+j < matsize-2) System.out.print(" ");
                else if (i+j > matsize-2) System.out.print(" ");
                else if (j==0) System.out.print(" ");
                else System.out.print(s.charAt(i+matsize));
            }
            System.out.println("");
        }

        // top
        System.out.println(s.substring(matsize*2-2,s.length()));
    }
}
