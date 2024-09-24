import java.util.*;

public class rs {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] > nums[(i + 1) % n]) ? 1 : 0;

            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        boolean result = check(nums);

        System.out.println("Is the array a rotated sorted array? " + result);
    }
}
