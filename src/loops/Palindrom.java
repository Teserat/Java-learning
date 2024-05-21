package loops;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPalindrom("kajak"));
        System.out.println(isPalindrom("owocowo"));
        System.out.println(isPalindrom("potop"));
        System.out.println(isPalindrom("inni"));
        System.out.println(isPalindrom("radar"));
        System.out.println(isPalindrom("kucyk"));
    }

    public static boolean isPalindrom(String word) {
        int n = word.length();
        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
