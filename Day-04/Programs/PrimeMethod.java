public class PrimeMethod {
    static boolean primeMethod(int num){
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
       return isPrime;
    }
    public static void main(String[] args){
        boolean res=primeMethod(27);
        System.out.println(res);
    }
}
