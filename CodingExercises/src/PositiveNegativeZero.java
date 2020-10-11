public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(10);
        checkNumber(0);
        checkNumber(-10);
    }

    public static void checkNumber(int number) {

        String result = "zero";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        }

        System.out.println(result);
    }

}
