public class MethodOverloading2 {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchestoCentimeters(6, 13));
        System.out.println(calcFeetAndInchestoCentimeters(18));
        System.out.println(calcFeetAndInchestoCentimeters(-1));
        System.out.println(calcFeetAndInchestoCentimeters(1, -6));
    }

    public static double calcFeetAndInchestoCentimeters(double feet, double inches) {

        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (feet * 30.48 + inches * 2.54);
        }

        return -1;
    }

    public static double calcFeetAndInchestoCentimeters(double inches) {

        if (inches >= 0) {
            return (calcFeetAndInchestoCentimeters((int) (inches / 12d), (int) (inches % 12d)));
        }

        return -1;
    }
}
