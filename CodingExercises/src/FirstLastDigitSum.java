public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int sumFLDigit = 0;
        boolean flgFirst = true;
        while (number > 0) {
            if (flgFirst) {
                flgFirst = false;
                sumFLDigit += (number % 10);
            }
            if ((number % 10 < 10) && (number / 10 == 0)) {
                sumFLDigit += number;
            }
            number /= 10;
        }

        return sumFLDigit;
    }
}
