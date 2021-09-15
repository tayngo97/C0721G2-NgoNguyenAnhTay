package bai11_stack_queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Queue;
import java.util.Stack;

public class ReverseArrayStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        // LastIn FiestOout   1,2,3,4   pop 4,3,2,1
        int[] n = {1,2,3,4};
        for (int i=0;i<n.length;i++){
            integerStack.push(n[i]);
        }

        System.out.println(integerStack);

        for (int i = 0; i < n.length; i++) {
            n[i] = integerStack.pop();
        }
        System.out.println("Array affer reverse is " + Arrays.toString(n));

        System.out.println("-----------------------------");
        System.out.println("ReverseString");
        String str = "GoodNight";
        System.out.println(str);
        System.out.println(ReverseString(str));
    }

    public static String ReverseString(String str)
    {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }

        int i = 0;
        while (!stack.empty()) {
            reverseString[i++] = stack.pop();
        }
        return new  String(reverseString);
    }

}
