package kz.baltabayev.leetcode;

public class ValidPalindrom {

    public static void main(String[] args) {
        ValidPalindrom check = new ValidPalindrom();
        boolean palindrome = check.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome); // true
    }

    public boolean isPalindrome(String s) {
        String originalString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuffer = new StringBuilder(originalString);
        StringBuilder reversedString = stringBuffer.reverse();

        return originalString.equals(new String(reversedString));
    }
}
