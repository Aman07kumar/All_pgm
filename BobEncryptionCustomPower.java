import java.util.*;
public class BobEncryptionCustomPower {

    public static long power(long base , long exp , long mod){

        long res = 1;
        base = base % mod;
        while (exp > 0){
            if((exp & 1 )== 1){
                res = (res*base ) % 100;
            }
            
                exp = exp >>1;
                base = (base*base)% mod;
            
        }
        return res;
    }

    public static long encryptCode(long s, long n , long m){
        long MOD = 1000000007;

        long lastDigit = power(s, n, 10);

        long encryptedCode = power(lastDigit, m, MOD);

        return encryptedCode;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter the secret code (S): ");
        long S = sc.nextLong();

        System.out.print("Enter the first key value (N): ");
        long N = sc.nextLong();

        System.out.print("Enter the second key value (M): ");
        long M = sc.nextLong();

        long result = encryptCode(S, N, M);

        System.out.println("Encrypted Code: " + result);
    }
}
