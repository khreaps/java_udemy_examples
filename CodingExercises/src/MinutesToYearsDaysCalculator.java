public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(minutes + " min = " + (int) (minutes / (60 * 24 * 365)) + " y and "
                + (int) ((minutes % (60 * 24 * 365) / (60 * 24))) + " d");
    }
}
