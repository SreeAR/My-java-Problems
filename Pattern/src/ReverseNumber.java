import java.math.BigInteger;
import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String args[])
    {
        int rev=0, rem;



        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        BigInteger num = scan.nextBigInteger();



        while(num.intValue() != 0) {
            System.out.println("int value is  "+num.intValue());
            int digit = (int) (num.intValue() % 10);
            rev = rev * 10 + digit;

            num = BigInteger.valueOf(((num.intValue())/ 10));
        }

        System.out.println("Reverse = " +rev);
    }
}