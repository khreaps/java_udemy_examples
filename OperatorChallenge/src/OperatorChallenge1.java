public class OperatorChallenge1 {
    
    public static void main(String[] args) {
        
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myResult = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("Step 3 result = " + myResult);

        double myRemainder= myResult % 40.00d; 
        System.out.println("Step 4 result = " + myRemainder);
    
        boolean isZero = myRemainder == 0 ? true : false;
        System.out.println("Step 5 result = " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder!");
        }
    }
}
