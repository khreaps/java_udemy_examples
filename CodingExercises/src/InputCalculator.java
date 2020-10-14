import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt = true;
        int number = 0;
        int numSum = 0;
        int cntNumber = 0;
        long numAvg = 0;

        while (true) {

            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                numSum += number;
                cntNumber++;
            } else {
                numAvg = (long) (Math.round((double) numSum / (double) cntNumber));
                break;
            }
            scanner.nextLine();
        }

        System.out.println("SUM = " + numSum + " AVG = " + numAvg);

        scanner.close();
    }
}
