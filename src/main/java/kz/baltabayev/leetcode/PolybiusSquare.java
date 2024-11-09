package kz.baltabayev.leetcode;

public class PolybiusSquare {

    public static final char[][] SQUARE = new char[][] {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'}
    };

    public static void main(String[] args) {
        PolybiusSquare polybiusSquare = new PolybiusSquare();
        String cipher = polybiusSquare.encodeMessage("BALTABAEV");
        System.out.println(cipher);
    }

    public String encodeMessage(String secretMessage) {
        StringBuilder encodedMessage = new StringBuilder();
        secretMessage = secretMessage.toUpperCase().replace("J", "I");

        for (char c : secretMessage.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                continue;
            }

            for (int row = 0; row < 5; row++) {
                for (int col = 0; col < 5; col++) {
                    if (SQUARE[row][col] == c) {
                        char replacementChar = (row < 4) ? SQUARE[row + 1][col] : SQUARE[0][col];
                        encodedMessage.append(replacementChar);
                    }
                }
            }
        }

        return encodedMessage.toString();
    }
}
