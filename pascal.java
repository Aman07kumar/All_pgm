import java.util.*;

public class pascal {

    public static void paascal(int n) {
        for (int line = 0; line < n; line++) {
            long ans = 1;
            System.out.print(ans + " ");
            for (int i = 1; i <= line; i++) {
                ans = ans * (line - i + 1) / i;
                System.out.print(" " + ans + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        paascal(n);
    }
}
