public class NumeroPrimo {

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

    public static int sumOfPrimes(int n) {
        int sum = 0;
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }
        return sum;
    }
}