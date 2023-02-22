public class p10 {
    public static void main(String[] args) {
        String s = "";
        int n = 5;
        
        // *
        // **   
        // ***  
        // **** 
        // *****
        // **** 
        // ***  
        // **   
        // * 

        for (int i = 0; i < n; i++) {
            System.out.println(s+="*");
        }
        for (int i = 0; i < n-1; i++) {
            if (s.length() > 0)
            s = s.substring(0, s.length()-1);
            System.out.println(s);
        }
    }
}
