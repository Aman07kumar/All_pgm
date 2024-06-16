import java.util.*;

public class sa1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) {
            count += number & 1;

            number = number >> 1;

        }

        System.out.println(count);

    }

}
