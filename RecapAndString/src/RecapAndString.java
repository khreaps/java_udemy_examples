public class RecapAndString {
    
    public static void main(String[] args) {
        
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString+ ", and this is more.";
        System.out.println("My string is equal to " + myString);
        myString = myString+ ", and this is more. \u00A9 2020";
        System.out.println("My string is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("My string is equal to " + numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("My last string is equal to " + lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("My last string is equal to " + lastString);

    }
}
