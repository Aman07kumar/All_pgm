import java.util.*;

public class movezero {

    public static void zero(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        for (int i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        zero(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
}
