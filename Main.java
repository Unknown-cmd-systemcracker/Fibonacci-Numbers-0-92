public class Main {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        // ( 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 )

        int n = 1; // <-- Put here the numbers of how many fibonacci-arrays should be iterated.

        fibonacciCache = new long[n+1];

        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i) + " ");
        }

    }
    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}