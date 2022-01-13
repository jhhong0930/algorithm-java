package leetcode;

import java.util.Stack;

public class L20_Valid_Parentheses {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == '(' || x == '[' || x == '{') stack.push(x);
            else { // 닫는 괄호일 때
                if (stack.isEmpty()) return false;
                switch (x) {
                    case ')':
                        if (stack.pop() != '(') return false;
                        break;
                    case ']':
                        if (stack.pop() != '[') return false;
                        break;
                    case '}':
                        if (stack.pop() != '{') return false;
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
