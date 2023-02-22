public class p7 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int n = 5;
        String s = "*";
        String sp = "";

    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    //  2ms

        for (int i = 0; i < n-1; i++) {
            sp+=" ";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sp + s);
            s+="**";
            if (sp.length()>0)
            sp = sp.substring(0, sp.length()-1);
        }

        long end = System.currentTimeMillis();
        System.out.println(
                (end - start) + "ms");
    }
}
