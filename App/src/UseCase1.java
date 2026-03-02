
class UseCase13{

    public static void main(String[] args) {
        // Generate a large string for meaningful benchmarking
        String largeInput = "a".repeat(1000000) + "b" + "a".repeat(1000000);

        System.out.println("--- Benchmarking Palindrome Algorithms ---");
        System.out.println("Input Size: ~2 Million Characters\n");

        // 1. Benchmark Two-Pointer (Optimized)
        long startTwoPointer = System.nanoTime();
        boolean res1 = checkTwoPointer(largeInput);
        long endTwoPointer = System.nanoTime();
        System.out.println("Two-Pointer Method:");
        System.out.println("Time Taken: " + (endTwoPointer - startTwoPointer) / 1_000_000.0 + " ms");
        System.out.println("Result: " + res1 + "\n");

        // 2. Benchmark Stack Method (Higher Memory Overhead)
        long startStack = System.nanoTime();
        boolean res2 = checkStack(largeInput);
        long endStack = System.nanoTime();
        System.out.println("Stack-Based Method:");
        System.out.println("Time Taken: " + (endStack - startStack) / 1_000_000.0 + " ms");
        System.out.println("Result: " + res2);
    }


    private static boolean checkTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    private static boolean checkStack(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        for (char c : s.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}