import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        // TODO: study this for Java Basics

        // this is a comment

        /*
        this is also
        a comment
         */

        System.out.println("Hello World");  // print to screen (console)


        // variables
        int var = 1;    // int : type
        // var : name
        // 1 : value

        String str = "seattle";     // String :?
        // str : ?
        // "seattle" : ?

        System.out.println(var);

        // change variable values
        var = var + 1;
        System.out.println(var);

        System.out.println(str + " rains a lot");

        int[] arr;  // define an array
        // int[] : type
        // arr : name
        // value : ?

        arr = new int[10];  // new : "allocate memory to store this array"
        // int[10] :  an array of 10 elements of type int

        arr[0] = 1; // setting the first element (0) to 1
        arr[2] = 3; // setting ?

        System.out.println("first element is " + arr[0]);

        System.out.println("second element is " + arr[1]);

        System.out.println("third element is " + arr[2]);

        System.out.println("all elements of arr: " + Arrays.toString(arr));

        String[] strArr = new String[5];
        strArr[0] = "programming";
        strArr[1] = "is";
        strArr[2] = "fun";

        System.out.println("all elements of strArr: " + Arrays.toString(strArr));
        // [programming, is, fun, null, null]
        // null means the String variable does not have a storage space yet

        System.out.println("arr has " + arr.length + "elements");   // arr.length the size of array arr
        System.out.println("strArr has " + strArr.length + "elements");

        for (int i = 0; i < arr.length; i++) {   // loop with variable i from value 0,
            // continue as long as i < arr.length
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        for (int v : arr) {     // also a loop of all elements in array arr
            System.out.println(v);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
        System.out.println(Arrays.toString(arr));

        for (int v : arr) {     // also a loop of all elements in array arr
            v = v + 1;
        }
        System.out.println(Arrays.toString(arr));   // what should be the output

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }

        System.out.println(Arrays.toString(arr));

        // print an array's elements in reverse order
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]); // arr index is from 0 to arr.length - 1
        }

        boolean isRaining = true;   // boolean : variable type, boolean, only 2 possible value true and false

        if (isRaining) {
            System.out.println("I won't go biking");
        } else {    // else can be omitted if no ops
            System.out.println("I'm going biking");
        }

        // print all elements of even index
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {       // % is called mod operator
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }

        int numOfEvenNumber = numberOfEvenNumber(arr);
        System.out.println(numOfEvenNumber);

        if (testNumberOfEvenNumber() &&
                testNumberOfEvenNumberNoneExist()) {
            System.out.println("function is correct");
        } else {
            System.out.println("function is not correct");
        }
    }

    public static int numberOfEvenNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result = result + 1;
            }
        }
        return result;
    }

    private static boolean testNumberOfEvenNumber() {
        int[] inputs = new int[]{5, 6, 7, 2, 3};
        int expect = 2;
        int actual = numberOfEvenNumber(inputs);

        if (expect == actual) {
            return true;        // 'true' indicates test has PASSED
        } else {
            return false;       // 'false' indicates test has FAILED
        }
    }

    private static boolean testNumberOfEvenNumberNoneExist() {
        int[] inputs = new int[]{-1, 3, 89, 17};
        int expect = 0;
        int actual = numberOfEvenNumber(inputs);

        if (expect == actual) {
            return true;        // 'true' indicates test has PASSED
        } else {
            return false;       // 'false' indicates test has FAILED
        }
    }
}