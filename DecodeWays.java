public class DecodeWays {
    public static int numcoder(String s){
        if(s.length() == 0 || s.charAt(0) == '0' ){
            return 0;
        }
        int n = s.length();
        int dp[] = new int[10];
        dp[0] = 1;
        dp[1] =s.charAt(0) != 0 ? 1:0;

        for (int i  = 2 ; i <= n ; i++){

            int od = Integer.parseInt(s.substring(i-1,i));

            if(od >= 1 && od <=9){
                dp[i] +=dp[i-1];
            }

            int td = Integer.parseInt(s.substring(i-2 ,i));

            if(td >= 10 && td <=26){
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        String s = "12345";
        System.out.println("Number of ways to decode " + s + " is: " + numcoder(s));
    }
}
