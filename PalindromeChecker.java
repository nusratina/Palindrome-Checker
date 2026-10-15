import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push each character to the stack and enqueue it to the queue
        for (char ch : word.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        // Compare elements from stack and queue
        while (!stack.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();
            System.out.println("Comparing: " + stackChar + " (from stack) and "
                    + queueChar + " (from queue)");

            if (stackChar != queueChar) {
                return false; // not a palindrome
            }
        }

        return true; // is a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
