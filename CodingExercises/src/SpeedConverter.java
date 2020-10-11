public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(10.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long milesPerHour = 0;

        if (kilometersPerHour < 0) {
            return -1;
        }

        milesPerHour = Math.round(kilometersPerHour / 1.609d);
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
