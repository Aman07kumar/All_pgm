import java.util.*;

public class occ {

    public static void occr(int arr[]) {
        int n1 = arr.length;

        HashMap<Integer, Integer> nh = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            int ele = arr[i];

            if (nh.containsKey(ele)) {
                nh.put(ele, nh.get(ele) + 1);
            } else {
                nh.put(ele, 1);
            }
        }
        for (Map.Entry<Integer, Integer> mp : nh.entrySet()) {
            System.err.println("Element" + mp.getKey() + " value" + mp.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 1, 2 };
        occr(arr);
    }
}
