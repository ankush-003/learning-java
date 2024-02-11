package methods;

import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to display primes: ");
        int n = in.nextInt();
        printPrimes(n);
        System.out.println("Enter a number to check if it is prime: ");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n) {
        // time complexity: O(sqrt(n))
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n; // if the number is not divisible by any number less than its square root, then it is prime
    }
    static void printPrimes(int n) {
        // time complexity: O(n log log n)
        boolean[] primes = new boolean[n + 1];
        primes[0] = primes[1] = false;
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }
        for(int p = 2; p * p <= n; p++) {
            if(primes[p]) {
                for(int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
