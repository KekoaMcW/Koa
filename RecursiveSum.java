public class RecursiveSum {

    public static void main(String[] args) {
        int number = 50;

        // Demonstrate the method
        int result = sum(number);
        System.out.println("Sum of integers from 1 to " + number + ": " + result);
    }

    public static int sum(int n) {
        // Start the recursion with the given number
        return sumRecursive(n);
    }

    private static int sumRecursive(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }

        // Recursive case: add the current number to the sum of the previous numbers
        return n + sumRecursive(n - 1);
    }
}
