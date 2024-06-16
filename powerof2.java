import java.util.*;

public class powerof2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int power = n & (n - 1);

        if (power == 0 && n > 0) {
            System.out.println("power of 2");
        } else {
            System.out.println(" not power of 2");
        }
    }

}
