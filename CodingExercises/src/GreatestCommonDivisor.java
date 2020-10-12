public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10){
            return -1;
        }

        int valueGCD = 0;
        int indexMax = (first > second ? (int) (first / 2) : (int) (second / 2));

        while (true) {
            
            if (first % indexMax == 0 && second % indexMax == 0) {
                return indexMax;
            }
            
            indexMax--;
        }
    }
}
