public class p8 {
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        String sp = "";

        // *********
        //  *******
        //   ***** 
        //    ***  
        //     *   

        for (int i = 0; i < n-1; i++) {
            s+="**";
        }
        s+="*";

        for (int i = 0; i < n; i++) {
            System.out.println(sp+s);
            sp+=" ";
            if (s.length()>1)
            s= s.substring(0, s.length()-2);
        }

    }
}
