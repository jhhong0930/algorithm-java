package boj.dataStructure;

import java.io.*;
import java.util.*;

public class B18258_큐2 {

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    Integer pop = deque.poll();
                    if (pop == null) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(pop).append("\n");
                    }
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;

                case "front":
                    Integer front = deque.peek();
                    if (front == null) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(front).append("\n");
                    }
                    break;

                case "back":
                    Integer back = deque.peekLast();
                    if (back == null) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(back).append("\n");
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
