package Exercise;

public class Exercise2 {

    public static void main(String[] args) {
        runPowerCheck();  // Quick trigger for the test cases
    }

    private static void runPowerCheck() {
        // A bunch of numbers to see if they're powers of two
        int[] numsToTest = {1, 2, 3, 4, 8, 15, 16, 31, 32, 64, 127, 128, 129};

        // Going through each number one by one
        for (int number : numsToTest) {
            boolean check = checkPowerOfTwo(number);
            System.out.printf("Is %d a power of 2? %s\n", number, check);
        }

        // Maybe add edge cases later, like negative numbers or zero
    }

    // Checks if a number is a power of 2 using a bitwise trick
    // Note: this still trips me up sometimes
    private static boolean checkPowerOfTwo(int num) {
        if (num <= 0) {
            return false;  // zero and negatives aren't powers of two
        }

        // The classic bitwise trick — surprisingly efficient
        return (num & (num - 1)) == 0;

        // Alternate (less efficient) way, just for kicks:
        // while (num % 2 == 0) num /= 2;
        // return num == 1;
    }
}
