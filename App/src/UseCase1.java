
import java.util.ArrayDeque;
import java.util.Deque;


        class UseCase7 {


            public static void main(String[] args) {

                // Define the input string
                String input = "refer";

                // Create a Deque to store characters
                Deque<Character> deque = new ArrayDeque<>();

                // Add each character to the deque
                for (char c : input.toCharArray()) {
                    deque.addLast(c);
                }

                // Flag to track palindrome result
                boolean isPalindrome = true;

                // Continue comparison while more than one element exists
                while (deque.size() > 1) {
                    // Remove from front and back and compare
                    char first = deque.removeFirst();
                    char last = deque.removeLast();

                    if (first != last) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Display the result
                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }