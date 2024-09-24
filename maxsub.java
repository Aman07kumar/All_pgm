import java.util.*;

public class maxsub {
    public static int maxvalue(int arr[]) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = maxvalue(arr);
        System.out.println("The maximum subarray sum is: " + result);

    }
}
