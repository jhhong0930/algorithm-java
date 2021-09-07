package boj.dataStructure;

import java.io.*;
import java.util.Stack;

public class B1874_스택수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int start = 0;

        int n = Integer.parseInt(br.readLine());

        while (n --> 0) {

            int item = Integer.parseInt(br.readLine());

            if (item > start) {

                for (int i=start+1; i<=item; i++) {
                    stack.push(i);
                    sb.append("+").append(("\n"));
                }

                start = item;

            } else if (stack.peek() != item) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

}
