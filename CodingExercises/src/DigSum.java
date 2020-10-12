public class DigSum {

    public static void main(String[] args) {

        System.out.println(sumDigits(9));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(123456789));
    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sumDig = 0;
        while (number > 0) {
            sumDig = sumDig + number % 10;
            number = number / 10;
        }

        return sumDig;
    }
}
