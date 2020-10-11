public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megaBytes = 0;
        int remainderKiloBytes = 0;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        megaBytes = kiloBytes / 1024;
        remainderKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");

    }
}
