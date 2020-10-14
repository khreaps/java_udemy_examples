import java.util.Scanner;

public class ReadingUserInput2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth's year: ");
        
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
    
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
    
            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and your age is " + age);
            } else {
                System.out.println("Invalide year of birth");
            }
        } else {
            System.out.println("Unable to parse your birth's year");
        }

        scanner.close();

    }
}
