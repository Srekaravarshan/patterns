public class p20 {
    public static void main(String[] args) {
        int n = 5;
        String sp = " ".repeat(n*2-2);
        String s = "";

        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *

        for (int i = 0; i < n; i++) {
            s+="*";
            System.out.println(s+sp+s);
            if (sp.length()>1)
            sp = sp.substring(0, sp.length()-2);
        }
        for (int i = 0; i < n-1; i++) {
            sp+="  ";
            if (s.length()>1)
            s = s.substring(0, s.length()-1);
            System.out.println(s+sp+s);
        }
    }
}
