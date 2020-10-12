public class EvenDigitSum {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sumEvenNumbers = 0;
        int digNumber = 0;

        
        while (true) {

            digNumber = number % 10;
            if (digNumber % 2 == 0) {
                sumEvenNumbers += digNumber;
            }

            number /= 10;
            if (number < 1) {
                break;
            }
        }

        return sumEvenNumbers;
    }
}
