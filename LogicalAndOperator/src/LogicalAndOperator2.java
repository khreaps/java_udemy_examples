public class LogicalAndOperator2 {
    
    public static void main(String[] args) {

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not a car");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
