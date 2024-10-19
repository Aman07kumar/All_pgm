import java.util.*;

public class p {
    public static boolean checker(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }

            else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '(' && s.charAt(i) == ')')
                        || (st.peek() == '{' && s.charAt(i) == '}')
                        || (st.peek() == '[' && s.charAt(i) == ']')) {
                    st.pop();
                } else {
                    return false;
                }

            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{()}[]";
        if (checker(s))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
