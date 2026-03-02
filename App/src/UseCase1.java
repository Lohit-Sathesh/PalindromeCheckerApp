
    class UseCase9 {
    public static void main(String[] args) {
        String input = "madam"; //
        boolean result = check(input, 0, input.length() - 1); //

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    private static boolean check(String s, int start, int end) {
        // Base case: All characters matched or single character left
        if (start >= end) {
            return true;
        }
        // Base case: Mismatch found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}