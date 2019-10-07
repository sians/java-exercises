package palindrome;

public class Application {
    public static void main(String[] str) {
        System.out.println(palindrome("hello"));
        System.out.println(palindrome("whaahw"));
        System.out.println(palindrome("what dO You uoy od tahw"));
    }

    public static boolean palindrome(String str) {
        String formatted = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(formatted).reverse().toString();
        if (formatted.equals(reversed)) return true;
        return false;
    }
}
