package  academy.programming;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args){
        int myvalue=10000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum value"+myMinIntValue);
        System.out.println("Integer Minimum value "+myMaxIntValue);
        System.out.println("Busted Maximum Value"+(myMaxIntValue+1));
        System.out.println("Busted Minimum Value"+(myMinIntValue-1));
        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value"+myMinByteValue);
        System.out.println("Byte Maximum Value"+myMaxByteValue);
        int a =Integer.parseInt("1");


        System.out.println(a);



        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Minimum Value"+myMinShortValue);
        System.out.println("Short Maximum Value"+myMaxShortValue);
        long myLongValue=100L;
        long myMinlongValue=Long.MIN_VALUE;
        long myMaxlongValue=Long.MAX_VALUE;
        System.out.println("Long Minimum Value"+myMinlongValue);
        System.out.println("Byte Maximum Value"+myMaxlongValue);
        long bigLongLiteralValue=2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);
        int myTotal=(myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2);
        short myNewShortValue=(short) (myMinShortValue/2);
        byte challengebyte= 100;
        short challengeshort=25000;
        int challengeint=250000;
        long challengelong=234343L;
        challengelong=50000L+10L*((int)challengebyte)+((int)challengeshort);
        System.out.println(challengelong);













    }
}
