import java.util.*;

public class Mains {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rem;
        int rev = 0;
        for (int i = 0; i < num; i++) {
            // rev = 0 ;
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;

    }
}