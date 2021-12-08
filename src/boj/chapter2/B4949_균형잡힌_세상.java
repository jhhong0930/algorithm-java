package boj.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949_균형잡힌_세상 {

    public static String solution(String str) {

        Stack<Character> stack = new Stack<>();
//        str = str.replaceAll("[a-zA-Z]", "");
//        str = str.replaceAll(" ", "");
//        str = str.replace(".", "");
//
//        for (char x : str.toCharArray()) {
//            if (x == '(' || x == '[') stack.push(x);
//            else {
//                if (stack.isEmpty()) return "no";
//                else if (x == ')' && stack.peek() == '[') return "no";
//                else if (x == ']' && stack.peek() == '(') return "no";
//                else stack.pop();
//            }
//        }

        for (char x : str.toCharArray()) {
            if (x == '(' || x == '[') stack.push(x);
            else if (x == ')')
                if (stack.isEmpty() || stack.peek() != '(') return "no";
                else stack.pop();
            else if (x == ']')
                if (stack.isEmpty() || stack.peek() != '[') return "no";
                else stack.pop();
        }

        if (!stack.isEmpty()) return "no";
        else return "yes";
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            System.out.println(solution(str));
        }
    }
}
