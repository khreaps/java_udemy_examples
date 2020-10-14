import java.util.Scanner;

public class ReadingUserInput1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth's year: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + ", and your age is " + (2020 - yearOfBirth));
        
        scanner.close();
    }
}