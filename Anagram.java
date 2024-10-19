import java.util.*;

public class Anagram {

    public static boolean Anagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> hs = new HashMap<>();

        for (char c : s1.toCharArray()) {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!(hs.containsKey(c))) {
                return false;
            }
            hs.put(c, hs.get(c) - 1);

            if (hs.get(c) == 0) {
                hs.remove(c);
            }
        }
        return hs.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";

        if (Anagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
