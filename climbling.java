import java.util.*;

public class climbling {

    public static int climb(int n) {

        if (n == 0 || n == 1)
            return 1;

        int curr = 1;
        int prev = 1;

        int temp;

        for (int i = 2; i <= n; i++) {
            temp = curr;
            curr = prev + curr;
            prev = temp;
        }

        return curr;
    }

    public static void main(String[] args) {

        int n = 2;

        int ans = climb(n);
        System.out.println(ans);
    }
}
