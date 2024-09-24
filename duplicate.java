import java.util.*;

public class duplicate {
    public static int removeduplicate(int arr[]) {
        int n = arr.length;

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 4 };
        int k = removeduplicate(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}