import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> current = new ArrayList<>();
        printSubsequences(arr, 0, current);
    }

    // Recursive function to print all subsequences
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> current) {
        // Base case: if we've gone through all elements, print the current subsequence
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include the current element
        current.add(arr[index]);
        printSubsequences(arr, index + 1, current);

        // Exclude the current element
        current.remove(current.size() - 1);
        printSubsequences(arr, index + 1, current);
    }
}
