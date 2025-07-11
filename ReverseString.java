public class ReverseString {
    public static void main(String[] args) {
        // The string given
        String stringToReverse = "TONI says ice cream PER scoop";

        // The string to contain the reversed string
        String reversed = "";

        // Reverse the string
        for (int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
            char ch = stringToReverse.charAt(indexPosition);
            reversed = reversed + ch;
        }

        // Check for palindrome (optional: ignore case and spaces if needed)
        if (stringToReverse.equals(reversed)) {
            System.out.println(stringToReverse + " is a palindrome");
        } else {
            System.out.println(stringToReverse + " is NOT a palindrome");
        }

        // Print the reversed string
        System.out.println("The reverse of \"" + stringToReverse + "\" is: \"" + reversed + "\"");
    }
}
