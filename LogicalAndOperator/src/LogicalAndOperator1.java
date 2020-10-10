public class LogicalAndOperator1 {
    
    public static void main(String[] args) {
        
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highscore!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50 ;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not a car");
        }
    }
}
