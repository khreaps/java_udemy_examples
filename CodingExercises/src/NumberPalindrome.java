public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int originNumber = 0;

        if (number < 0) {
            number = number * (-1);
        }

        originNumber = number;
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        if (reverse == originNumber) {
            return true;
        }

        return false;
    }
}
