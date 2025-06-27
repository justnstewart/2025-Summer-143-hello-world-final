package Exercise;

// Just playing with number swapping
public class Exercise1 {

    public static void main(String[] args) {
        // Trying out a few combinations
        runTestCases(123, 567);
        runTestCases(0, 0);
        runTestCases(-5, 10);
        runTestCases(Integer.MAX_VALUE, Integer.MIN_VALUE);
        runTestCases(42, 42);
    }

    // Function to perform and print swap operation
    public static void runTestCases(int firstVal, int secondVal) {
        System.out.println("Before swap: x = " + firstVal + ", y = " + secondVal);

        // Okay, here's the swap trick (no temp variable used)
        // Though honestly, this might look confusing on a tired day 😅
        firstVal = firstVal + secondVal;
        secondVal = firstVal - secondVal;
        firstVal = firstVal - secondVal;

        // Final result post-swap
        System.out.println("After swap:  x = " + firstVal + ", y = " + secondVal);
        System.out.println("-----------------------------");

        // Note: I once forgot this trick when asked in an interview. Go figure.
    }

    // Hmm... maybe later I'll try this with XOR swap, just for fun
    // public static void xorSwap(int a, int b) { ... }
}
