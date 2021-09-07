package boj.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10799_쇠막대기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = br.readLine();
        int result = 0;

        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {

                stack.pop();

                if (str.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result ++;
                }

            }

        }

        System.out.println(result);
    }

}
