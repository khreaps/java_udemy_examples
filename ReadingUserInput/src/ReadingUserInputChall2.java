import java.util.Scanner;

public class ReadingUserInputChall2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = true;

        int minNumber = 0;
        int maxNumber = 0;
        int number = 0;

        while (true) {

            System.out.println("Enter number ");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                if (number < minNumber || minNumber == 0){
                    minNumber = number;
                }   
                if (number > maxNumber) {
                    maxNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min number = " + minNumber);
        System.out.println("Max number = " + maxNumber);

        scanner.close();        
    }
}
