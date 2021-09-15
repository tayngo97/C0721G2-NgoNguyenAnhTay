package bai11_stack_queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "12321";
        checkPalindrome(str);
    }

    public static void checkPalindrome(String str) {
        String input = str.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<Character>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        System.out.println(stack);
        for (int i = 0; i < input.length(); i++) {
            queue.add(input.charAt(i));
        }
        System.out.println(queue);
        boolean flag = true;
        while (!queue.isEmpty()) {
            if (queue.poll().equals(stack.pop())) {
                continue;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(input +" is a Palindrome");
        } else {
            System.out.println(input + " is Not a Palindrome");
        }
    }
}
