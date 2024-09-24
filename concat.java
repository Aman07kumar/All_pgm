import java.util.*;

public class concat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String");
        String s1 = sc.nextLine();

        System.out.println("Enter the SECONDA String");
        String s2 = sc.nextLine();

        String str = s1.concat(s2);

        System.out.println("the result: " + str);

    }
}
