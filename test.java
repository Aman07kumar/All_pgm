import java.util.*;

public class test {

    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<Integer>();

        randomFun(h1, 1);

        ArrayList<Integer> a1 = new ArrayList<Integer>();

        randomFun(a1, 2);

        TreeSet<Integer> t1 = new TreeSet<Integer>();

        randomFun(t1, 3);

        LinkedList<Integer> l1 = new LinkedList<Integer>(); // '11' is not a valid variable name, corrected to 'l1'

        randomFun(l1, 5);

        h1.removeAll(a1); // Correcting the method call 'hi' to 'h1'

        a1.addAll(t1);

        l1.addAll(a1);

        h1.removeAll(l1);

        System.out.println(h1);
    }

    // Corrected the method definition by removing spaces in the name and fixing the
    // loop
    static void randomFun(Collection<Integer> c, int n) {
        for (int i = n * 2; i <= 25; i += n) {
            c.add(i); // Changed '1' to 'i' to add different integers
        }
    }
}
