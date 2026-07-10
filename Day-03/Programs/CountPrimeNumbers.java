public class CountPrimeNumbers {
    public static void main(String[] args) {

        int count = 0;

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Count of Prime Numbers = " + count);
    }
}