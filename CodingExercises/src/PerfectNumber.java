public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int divNumber = 1;
        int sumDigit = 0;
        while (true) {
            if (number % divNumber == 0) {
                sumDigit += divNumber;
            }
            divNumber++;
            if (divNumber == number) {
                break;
            }
        }
        return ((number == sumDigit) ? true : false);
    }
}
