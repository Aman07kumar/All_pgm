public class largest {
    public static int le(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if ((arr[i]) > max) {
                max = arr[i];
            }
        }

        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1 && arr[i] != max) {
                max1 = arr[i];
            }
        }
        return max1;
    }

    public static void main(String[] args) {
        int arr[] = { 45, 1, 9, 3, 6, 4 };
        int maxi = le(arr);
        System.out.println(maxi);
    }
}
