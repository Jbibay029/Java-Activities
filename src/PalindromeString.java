public class PalindromeString {
    public static void main(String[] args) {
        String name = "madam";

        String convert = name.replaceAll("\\s", "").toLowerCase();
        // We convert the phrase to a new String to remove all spaces and turning the
        // phrases to lower case
        String cleanConvert = convert.replaceAll("[^a-zA-Z0-9 ]", "");
        // We remove any special characters from the String

        if (isPalindrome(cleanConvert)) {
            System.out.println(name + " is a Palindrome");
        } else {
            System.out.println(name + " is not a Palindrome");
        }

    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
