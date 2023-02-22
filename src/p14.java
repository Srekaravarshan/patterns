public class p14 {
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        
        // A
        // AB   
        // ABC  
        // ABCD 
        // ABCDE

        for (int i = 0; i < n; i++) {
            s+=(char)(65+i);

            System.out.println(s);
        }
    }
}
