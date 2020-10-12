public class TheForStat1 {

    public static void main(String[] args) {

        // for (int i = 2; i < 6; i++) {

        // System.out.println(calculateInterest(10000.0, i));

        int cntMax = 0;
        for (int i = 1001; i < 1101; i++) {
            if (isPrime(i)) {
                System.out.println("Prime found: " + i);
                cntMax++;
            }
            if (cntMax == 3) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
