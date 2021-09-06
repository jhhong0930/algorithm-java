package boj.dataStructure;

import java.io.*;
import java.util.Stack;

public class B9012_괄호 {


    static String solution(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) == ('(')) { // '(' 일 때

                stack.push(str.charAt(i));

            } else { // ')' 일 때

                if (stack.isEmpty()) { // 대응되는 닫는 괄호가 없을 때
                    return "NO";
                } else {
                    stack.pop();
                }

            }

        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            sb.append(solution(br.readLine())).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

}
