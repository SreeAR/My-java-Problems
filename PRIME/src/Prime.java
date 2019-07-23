
/*
 * Sieve of Eratosthenes Algorithms
 */

import java.util.Scanner;

import static sun.security.krb5.internal.LoginOptions.MAX;//No clue about this just got this in error!

public class Prime {

    public static Scanner sc = new Scanner(System.in);






    public static void main(String[] args) {
        boolean[] array = new boolean[MAX];
        System.out.println("Enter the Max number: "); //Takes the input
        int MAX = sc.nextInt();
        String primeNumbers ="";

        double start = System.currentTimeMillis();

        // Find prime
        for (int i = 2; i < MAX; i++) {
            if (!array[i]) {
                int j = (int) 2*i;
                //System.out.println("  "+j);
                while (j < MAX) {
                    array[j] = true;
                    j += i;
                }
            }
        }

        // Display prime
        long pi = 0;
        for (int i = 2; i < MAX; i++) {
            if (!array[i]) {
                //pi++;
                System.out.println(i);
                // primeNumbers = primeNumbers + i + " ";
            }
        }




        double fin = System.currentTimeMillis();

        System.out.println("pi "+pi+" Time  " + (fin - start) / 1000.0+"s");

    }


}
