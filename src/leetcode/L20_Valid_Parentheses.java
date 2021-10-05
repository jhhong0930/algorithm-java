package leetcode;

import java.util.Stack;

public class L20_Valid_Parentheses {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {

            // 여는 괄호일 때
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {

                if (stack.isEmpty()) return false;

                switch(s.charAt(i)) {

                    case ')':
                        if (stack.peek() == '[' || stack.peek() == '{') {
                            return false;
                        } else {
                            stack.pop();
                        }
                        break;

                    case ']':
                        if (stack.peek() == '(' || stack.peek() == '{') {
                            return false;
                        } else {
                            stack.pop();
                        }
                        break;

                    case '}':
                        if (stack.peek() == '[' || stack.peek() == '(') {
                            return false;
                        } else {
                            stack.pop();
                        }
                        break;
                }

            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));
    }

}
