public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 24));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)) ? true : false;
    }

    public static boolean isTeen(int ageTeen) {

        return (ageTeen >= 13 && ageTeen <= 19) ? true : false;
    }
}
