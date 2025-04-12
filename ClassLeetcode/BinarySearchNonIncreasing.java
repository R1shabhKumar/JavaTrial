public class BinarySearchNonIncreasing {

    // Iterative Binary Search for a non-increasing array
    public static int binarySearchIterative(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle empty or null array
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent potential overflow

            if (arr[mid] == target) {
                return mid; // Target found at mid
            } else if (arr[mid] < target) {
                right = mid - 1; // Search in the left half (since it's non-increasing)
            } else {
                left = mid + 1; // Search in the right half
            }
        }

        return -1; // Target not found
    }

    // Recursive Binary Search for a non-increasing array
    public static int binarySearchRecursive(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle empty or null array
        }
        return binarySearchRecursiveHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursiveHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: Target not found
        }

        int mid = left + (right - left) / 2; // Prevent potential overflow

        if (arr[mid] == target) {
            return mid; // Target found at mid
        } else if (arr[mid] < target) {
            return binarySearchRecursiveHelper(arr, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearchRecursiveHelper(arr, target, mid + 1, right); // Search in the right half
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,6,-5,-10,-11,-15,-20,-20};
        int target1 = -20;
        int target2 = -5;

        int iterativeResult1 = binarySearchIterative(arr, target1);
        int iterativeResult2 = binarySearchIterative(arr, target2);

        int recursiveResult1 = binarySearchRecursive(arr, target1);
        int recursiveResult2 = binarySearchRecursive(arr, target2);

        System.out.println("Iterative Search:");
        System.out.println("Target " + target1 + " found at index: " + iterativeResult1);
        System.out.println("Target " + target2 + " found at index: " + iterativeResult2);

        System.out.println("\nRecursive Search:");
        System.out.println("Target " + target1 + " found at index: " + recursiveResult1);
        System.out.println("Target " + target2 + " found at index: " + recursiveResult2);

    }
}