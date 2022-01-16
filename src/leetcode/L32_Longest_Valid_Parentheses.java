package leetcode;

import java.util.Stack;

public class L32_Longest_Valid_Parentheses {

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        stack.push(-1);

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.empty()) stack.push(i);
                else answer = Math.max(answer, i - stack.peek());
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";
        String s4 = "()(()";

        System.out.println(longestValidParentheses(s1));
        System.out.println(longestValidParentheses(s2));
        System.out.println(longestValidParentheses(s3));
        System.out.println(longestValidParentheses(s4));
    }
}
