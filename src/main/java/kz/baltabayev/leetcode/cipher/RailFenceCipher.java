package kz.baltabayev.leetcode.cipher;

public class RailFenceCipher {

    public static void main(String[] args) {
        String input = "NOT FOUND";
        String message = input.replaceAll("\\s+", "");
        String encodedString = encode(message);
        System.out.println(encodedString); // NTONOFUD
    }

    public static String encode(String secretMesage) {
        char[] mesageCharArray = secretMesage.toCharArray();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < mesageCharArray.length; i++) {
            char c = mesageCharArray[i];
            if (i % 2 == 0) {
                sb1.append(c);
            } else {
                sb2.append(c);
            }
        }

        return sb1.append(sb2).toString();
    }
}