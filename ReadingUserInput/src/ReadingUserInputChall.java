import java.util.Scanner;

public class ReadingUserInputChall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = true;

        int cntNumberValid = 0;
        int sumNumberValid = 0;
        int number = 0;

        while (true) {
            cntNumberValid++;

            System.out.println("Enter number #" + cntNumberValid);
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                sumNumberValid += number;
            } else {
                cntNumberValid--;
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

            if (cntNumberValid == 10) {
                break;
            }
        }

        System.out.println("Sum of numbers = " + sumNumberValid);
        scanner.close();
    }
}
