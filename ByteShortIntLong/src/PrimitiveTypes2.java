public class PrimitiveTypes2 {
    
    public static void main(String[] args) {
        
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE ;
        int myMaxIntValue = Integer.MAX_VALUE ;
        System.out.println("Integer Minimun Value = " + myMinIntValue);
        System.out.println("Integer Maximun Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimun Value= " + myMinByteValue);
        System.out.println("Byte Maximun Value= " + myMaxByteValue);
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimun Value= " + myMinShortValue);
        System.out.println("Short Maximun Value= " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimun Value= " + myMinLongValue);
        System.out.println("Long Maximun Value= " + myMaxLongValue);

        long bitLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bitLongLiteralValue);

        short bigShortLiteralValue = 32767;
    }
}

