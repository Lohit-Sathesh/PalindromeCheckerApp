    class UseCase2 {
    public static void main(String[] args) {
        // Step 1: Store a predefined string
        String input = "madam";

        // Step 2: Determine if it is a palindrome
        boolean isPalindrome = true;

        // Loop only till half of the string length as per instructions
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare characters from both ends
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display the result on the console
        System.out.println("Input   text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}