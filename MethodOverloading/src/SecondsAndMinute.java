public class SecondsAndMinute {

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    private static String getDurationString(int minutes, int seconds) {

        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            return ((int) (minutes / 60d) + "h " + (int) (minutes % 60d) + "m " + seconds + "s");
        }
        return "Invalid value";
    }

    private static String getDurationString(int seconds) {

        if (seconds >= 0) {
            return getDurationString((int) (seconds / 60), (int) (seconds % 60));
        }

        return "Invalid value";
    }
}
