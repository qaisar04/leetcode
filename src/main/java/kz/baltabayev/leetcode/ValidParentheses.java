package kz.baltabayev.leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Map<Character, Character> brackets = Map.of('(', ')', '[', ']', '{', '}');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                stack.push(brackets.get(c));
            } else {
                if (stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (!pop.equals(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
