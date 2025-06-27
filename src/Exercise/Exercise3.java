package Exercise;

import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {
        runFibSequenceChecks();  // kicking things off
    }

    private static void runFibSequenceChecks() {
        // Trying out different arrays to see which ones follow Fibonacci pattern
        int[][] fibCandidates = {
                {},
                {0, 1, 1, 2, 3},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 611}, // tiny tweak at the end
                {1},
                {0, 2, 1, 2, 3},
                {1, 1, 2, 3, 5, 8, 13, 21},
                {2, 3, 5, 8, 13}, // hmm... close, but doesn’t start with 0 or 1
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610}
        };

        for (int[] fibArr : fibCandidates) {
            // Printing out each array with the result
            boolean isFibo = looksLikeFibonacci(fibArr);
            System.out.println(Arrays.toString(fibArr) + ": " + isFibo);
        }
    }

    // Checks if an array follows Fibonacci rule (a[n] = a[n-1] + a[n-2])
    private static boolean looksLikeFibonacci(int[] sequence) {
        if (sequence.length < 3) {
            return false;  // too short to decide anything
        }

        for (int i = 2; i < sequence.length; i++) {
            int expected = sequence[i - 1] + sequence[i - 2];
            if (sequence[i] != expected) {
                // early exit if something looks fishy
                return false;
            }
        }

        // passed all checks — probably Fibonacci
        return true;

        // NOTE: not checking for valid starting values like 0, 1
        //       maybe should, maybe not — depends on how picky we are
    }
}
