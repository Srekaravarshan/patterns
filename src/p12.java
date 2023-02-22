public class p12 {
    public static void main(String[] args) {
        int n = 4;
        String sp = " ".repeat(4*2-2);
        String l = "";
        String r = "";

        // 1      1
        // 12    21
        // 123  321
        // 12344321

        for (int i = 1; i <= n; i++) {
            l+=i;
            r=i+r;
            System.out.println(l+sp+r);
            if (sp.length()>0)
            sp = sp.substring(0, sp.length()-2);
        }

    }
}
