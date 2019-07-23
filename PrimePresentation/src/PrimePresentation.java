import java.util.Scanner;
import java.lang.Math;

public class PrimePresentation {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        System.out.println("Enter max number: ");

        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );

        System.out.println("List of the prime number between 1 - " + maxNumber);
        long startTime = System.currentTimeMillis();
        for (int num = 2; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i <=Math.sqrt(num) ; i++)
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            if (isPrime == true)
                System.out.println(num);
        }
        long endTime = System.currentTimeMillis();
        String totalTime = ((endTime - startTime)/1000.0+"s");
        System.out.println(totalTime);
    }
}