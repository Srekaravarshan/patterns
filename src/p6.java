public class p6 {
    public static void main(String[] args) {

        // 12345
        // 1234
        // 123 
        // 12  
        // 1   

        String s = "";
        int n = 5;

        for (int i = 1; i <= n; i++) {
            s+=i;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s);
            s = s.substring(0, s.length()-1);
        }
    }
}
