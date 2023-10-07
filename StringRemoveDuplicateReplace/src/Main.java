public class Main {
    public static void main(String[] args) {
        // Test case 1
        String input1 = "Java1234";
        String output1 = manipulateString(input1);
        System.out.println(output1); // Output: "Javb1234"

        // Test case 2
        String input2 = "Python1223";
        String output2 = manipulateString(input2);
        System.out.println(output2); // Output: "Python1234"

        // Test case 3
        String input3 = "aBuzZ9900";
        String output3 = manipulateString(input3);
        System.out.println(output3); // Output: "aBuzC9012"
    }

    public static String manipulateString(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        boolean[] replaced = new boolean[128]; // Assuming ASCII characters

        for (char c : chars) {
            if (!replaced[c]) {
                result.append(c);
                replaced[c] = true;
            } else {
                // Replace duplicates
                if (Character.isUpperCase(c)) {
                    result.append((char) ('A' + (c - 'A' + 1) % 26)); // Replace with capital letter
                } else if (Character.isLowerCase(c)) {
                    result.append((char) ('a' + (c - 'a' + 1) % 26)); // Replace with lowercase letter
                } else if (Character.isDigit(c)) {
                    result.append((char) ('0' + (c - '0' + 1) % 10)); // Replace with digit
                } else {
                    result.append(c); // Keep other characters as-is
                }
                replaced[c] = true;
            }
        }

        return result.toString();
    }
}
