public class p19 {
    public static void main(String[] args) {
        int n=5;
        String s = "*".repeat(n);
        String sp = "";

        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********

        for (int i = 0; i < n; i++) {
            System.out.println(s+sp+s);
            s = s.substring(0, s.length()-1);
            sp += "  ";
        }
        s+="*";
        sp = sp.substring(0, sp.length()-2);
        for (int i = 0; i < n; i++) {
            System.out.println(s+sp+s);
            if(sp.length()>0)
            sp = sp.substring(0, sp.length()-2);
            s += "*";
        }
    }
}
