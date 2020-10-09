public class PrimitiveTypes4 {

    public static void main(String[] args) {
        
        byte myByteNumber = 100;
        short myShortNumber = 32155;
        int myIntNumber = 2147483;
        long myLongNumber = (long)(50_000L + 10L * (myByteNumber + myShortNumber+ myIntNumber));
 
        System.out.println(myLongNumber);
    }
}
