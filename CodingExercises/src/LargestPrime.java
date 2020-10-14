public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrime = 0;
        int numFactors = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0){
                        numFactors++;
                    }
                }

                if (numFactors == 1) {
                    if (largestPrime < i) {
                        largestPrime = i;
                    }
                }
                numFactors = 0;
            }
        }

        return largestPrime;
    }
}
