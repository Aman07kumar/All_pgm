import java.util.*;
public class Removepara {
    public static String checkPara(String s){
        StringBuilder sc = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()){
            if ( ch == '('){
                if(depth > 0){
                    sc.append(ch);
                }
                depth++;
            }
            else if (ch == ')') {
                depth--;
                if(depth > 0){
                    sc.append(ch);
                }
            }
        }
        return sc.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(checkPara(s));
    }
}
