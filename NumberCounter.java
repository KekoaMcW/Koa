public class NumberCounter {

    public static void main(String[] args) {
        int[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3};
        
        // Demonstrate the method
        System.out.println("Number of occurrences of 0: " + numberCount(test, 0));
        System.out.println("Number of occurrences of 3: " + numberCount(test, 3));
        System.out.println("Number of occurrences of 6: " + numberCount(test, 6));
        System.out.println("Number of occurrences of 7: " + numberCount(test, 7));
    }

    public static int numberCount(int[] array, int target) {
        // Start the recursion from the beginning of the array
        return numberCountRecursive(array, target, 0);
    }

    private static int numberCountRecursive(int[] array, int target, int index) {
        // Base case: if the index goes beyond the array length, return 0
        if (index == array.length) {
            return 0;
        }

        // Recursive case: check if the current element is equal to the target
        // If true, increment count by 1 and continue with the rest of the array
        int count = (array[index] == target) ? 1 : 0;

        // Recursively call the function with the next index
        return count + numberCountRecursive(array, target, index + 1);
    }
}
