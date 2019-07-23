import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Max number: ");//Takes the input
        String input = sc.nextLine();
        int maxNumber = Integer.parseInt(input);
        System.out.println("The list of the Prime numbers between 1 to " + maxNumber);
        long startTime = System.currentTimeMillis();
        for (int num = 2; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i<= Math.sqrt(num);i++) {
                if (num%i == 0)
                    isPrime = false;

            }


            if ( isPrime == true) {
                System.out.println(num);
            }
        }
        long endTime = System.currentTimeMillis();
        long totalTime = ((endTime - startTime)/1000);
        System.out.println(totalTime + "s");

    }
}