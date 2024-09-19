import java.util.*;

public class pd {

    public static boolean palindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal, Panama";
        System.out.println(palindrome(s));
    }
}
