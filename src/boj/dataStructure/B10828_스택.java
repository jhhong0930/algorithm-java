package boj.dataStructure;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828_스택 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    if (stack.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }

        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

}
