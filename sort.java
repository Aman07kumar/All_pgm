import java.util.*;

public class sort {

    public static int[] sortcolor(int arr[]) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        for (int j = 0; j < count0; j++) {
            arr[j] = 0;
        }
        for (int j = count0; j < count0 + count1; j++) {
            arr[j] = 1;
        }
        for (int j = count0 + count1; j < count0 + count1 + count2; j++) {
            arr[j] = 2;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 0, 2, 1, 0, 2, 1, 0 };
        sortcolor(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
