public class p4 {
    public static void main(String[] args) {

        // 1
        // 22   
        // 333  
        // 4444 
        // 55555

        int n = 5;
        for (int i = 1; i <= n; i++) {
            String s = i+"";
            System.out.println(s.repeat(i));
        }
    }
}
