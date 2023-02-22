public class p17 {
    public static void main(String[] args) {
        String s = "", t = "";
        int n = 5;
        String sp = " ".repeat(n-1);

    //      A
    //     ABA   
    //    ABCBA  
    //   ABCDCBA 
    //  ABCDEDCBA

        for (int i = 1; i <= n; i++) {
            s+=(char)(64+i);
            System.out.println(sp+s+t);
            t=(char)(64+i) + t;
            if (sp.length()>0)
            sp = sp.substring(0, sp.length()-1);
        }
    }
}
