public class NumberToWords {

    public static void main(String[] args) {
    }

    public static void numberToWords(int number) {

        int digitCount = getDigitCount(number);
        if (digitCount < 0) {
            System.out.println("Invalid Value");
        }

        int numReversed = reverse(number);
        for (int i = 1; i <= digitCount; i++) {
            switch (numReversed % 10) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }

            numReversed /= 10;
        }
    }

    public static int reverse(int number) {

        int numReversed = 0;
        while (true) {
            if (number == 0) {
                break;
            }
            numReversed = numReversed * 10 + (number % 10);
            number /= 10;
        }

        return numReversed;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int digitCount = 0;
        while (true) {

            digitCount++;
            number /= 10;
            
            if (number == 0) {
                break;
            }
        }

        return digitCount;
    }
}
