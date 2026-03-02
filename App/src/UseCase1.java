import java.util.LinkedList;
    class UseCase8 {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // Remove from both ends and compare
            Character first = list.removeFirst();
            Character last = list.removeLast();

            if (!first.equals(last)) {
                isPalindrome = false;
                break;
            }
        }

        // Display the results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}