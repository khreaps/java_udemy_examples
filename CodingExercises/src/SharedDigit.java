public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        while (true) {

            int lastDigit1 = number1 % 10;
            if (number1 == 0) {
                break;
            }

            int number2Loop = number2;
            while (true) {

                int lastDigit2 = number2Loop % 10;
                if (lastDigit1 == lastDigit2) {
                    return true;
                }

                if (number2Loop == 0) {
                    break;
                }
                number2Loop /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}
