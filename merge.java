import java.util.*;

public class merge {

    public static int[] merge_array(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merge = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merge[k++] = arr1[i++];
        }

        while (j < n2) {
            merge[k++] = arr2[j++];
        }
        return merge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n1 and n2:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter the values in arr1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the values in arr2:");
        for (int j = 0; j < n2; j++) {
            arr2[j] = sc.nextInt();
        }
        int[] merged_arr = merge_array(arr1, arr2);
        System.out.println("The values in the merged array: " + Arrays.toString(merged_arr));
    }
}
