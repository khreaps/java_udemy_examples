public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(2, 1, 1);

    }

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber < 0) || (secondNumber < 0) || (thirdNumber < 0)) {
            System.out.println("Invalid Value");
            return;
        }

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (((firstNumber == secondNumber) || (firstNumber == thirdNumber))
                || ((secondNumber == thirdNumber) || (secondNumber == firstNumber))) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}