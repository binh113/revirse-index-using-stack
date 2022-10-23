import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        reverseIntegers();
        reverseString();
    }

    private static void reverseIntegers() {
        Stack<Integer> reverse = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            reverse.push(arr[i]);
        }
        int[] newArr = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            newArr[j] = reverse.pop();
        }
        System.out.println(" arr reversed is: " + Arrays.toString(arr) + "\n" + Arrays.toString(newArr));

    }

    private static void reverseString() {
        Stack<String> wStack = new Stack();
        Stack<String> newWStack = new Stack();

        String string = "ABCDEF";
        String[] arrList = string.split("");
        for (String mWord : arrList) {
            wStack.push(mWord);
        }
        System.out.println("Array before-sorted");
        System.out.println(wStack);

        int stackSize = wStack.size();
        for (int i = 0; i < stackSize; i++) {
            String el = wStack.pop();
            newWStack.push(el);
        }

        System.out.println("Array after-sorted");
        System.out.println(newWStack);
    }
}