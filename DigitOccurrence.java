public class DigitOccurrence {
    public static int[] count (int start , int end){
        int[] digitcount = new int[10];

        for(int i = start ; i <= end ; i++){
            int num = i;

            if( i == 0){
                digitcount[0]++;
            }

            while (num > 0){
                int digit = num %10;
                digitcount[digit]++;
                num /=10;
            }
        }
        return digitcount;
    }
    public static void main(String[] args) {
        int start = 100;
        int end = 105;

        int[] digitOccurrences = count(start, end);

        
        System.out.println("Digit occurrences from " + start + " to " + end + ":");
        for (int i = 0; i < digitOccurrences.length; i++) {
            System.out.println("Digit " + i + ": " + digitOccurrences[i] + " times");
        }
    }
}
