public class stock {

    public static int maxprofit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;

        }

        int min = prices[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - min;
            max = Math.max(max, cost);
            min = Math.min(min, prices[i]);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };

        int Maxprofit = maxprofit(arr);

        System.out.println("the maxprofit is : " + Maxprofit);
    }
}
