import java.util.*;

public class Countvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        HashSet<Character> Uv = new HashSet<>();
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Uv.add(ch);
                count = count + 1;
            }
        }
        System.err.println(Uv.size());
        System.out.println(Uv);
        System.out.println(count);
    }
}
