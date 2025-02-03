import java.util.*;

public class Generate_binaryStrings {
    public static void main(String[] args) {
        int n = 3;
        generateBinaryStrings(n);
    }

    public static List<String> generateBinaryStrings(int n) {
    List<String> result = new ArrayList<>();
    backtrack("", n, result);
    return result;
  }
    // public static void generateBinaryStrings(int n, int[] arr, int i) {
    //     if (i == n) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(arr[j]);
    //         }
    //         System.out.println();
    //         return;
    //     }

    //     arr[i] = 0;
    //     generateBinaryStrings(n, arr, i + 1);

    //     arr[i] = 1;
    //     generateBinaryStrings(n, arr, i + 1);
    // }

    private static void backtrack(String current, int N, List<String> result) {
        // Base case: if the current string's length is N, add it to the result
        if (current.length() == N) {
            result.add(current);
            return;
        }

        // Always try to append '0'
        backtrack(current + '0', N, result);

        // Append '1' only if the last character is not '1'
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            backtrack(current + '1', N, result);
        }
    }
}