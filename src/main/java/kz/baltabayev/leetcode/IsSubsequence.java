package kz.baltabayev.leetcode;

public class IsSubsequence {

    // TODO: Implement the two-pointer approach for this problem
    public boolean isSubsequence(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int k = 0;
        for (int i = 0; i < tCharArray.length; i++) {
            if (tCharArray[i] == sCharArray[k]) {
                k++;
            }
        }
        return k == sCharArray.length;
    }
}
