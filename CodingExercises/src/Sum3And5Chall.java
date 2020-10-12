public class Sum3And5Chall {

    public static void main(String[] args) {

        int cntMax = 0;
        int sumDiv35 = 0;
        for (int i = 1; i < 1001; i++) {

            // divisible by 3 and 5
            if (i % 5 == 0  && i % 3 == 0) {
                cntMax++;
                sumDiv35 += i;
                System.out.println("Number divisible by 3 and 5 found: " + i);
            }
            if (cntMax == 5) {
                break;
            }
        }
        System.out.println("The sum of the first 5 numbers divisible by 3 and 5 is equal to " + sumDiv35);
    }
}
