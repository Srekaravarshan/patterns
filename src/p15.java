public class p15 {
    public static void main(String[] args) {
        int n = 5;
        String s = "";

        // ABCDE
        // ABCD
        // ABC 
        // AB  
        // A   

        for (int i = 0; i < n; i++) {
            s+=(char)(65+i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s);
            if (s.length()>0)
            s=s.substring(0, s.length()-1);
        }
    }
}
