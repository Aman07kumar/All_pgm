import java.util.ArrayList;

public class PrimeTwins {

    public static void main(String[] args) {
        int L = 10;
        int R = 33;

        int[] result = findTwinPrimes(L, R);

        if (result.length == 0) {
            System.out.println("No twin primes found within the specified range.");
        } else {
            System.out.println("Twin primes within the specified range:");
            for (int i : result) {
                System.out.print(i + " ");
            }
        }
    }

    public static int[] findTwinPrimes(int L, int R) {
        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> twinPrimes = new ArrayList<>();

        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == 2) {
                twinPrimes.add(primes.get(i));
                twinPrimes.add(primes.get(i + 1));
            }
        }

        int[] result = new int[twinPrimes.size()];
        for (int i = 0; i < twinPrimes.size(); i++) {
            result[i] = twinPrimes.get(i);
        }

        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
