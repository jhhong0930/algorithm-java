package boj.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B18258_큐2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                    if (pop == null) sb.append("-1").append("\n");
                    else sb.append(pop).append("\n");
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;

                case "front":
                    Integer front = deque.peek();
                    if (front == null) sb.append("-1").append("\n");
                    else sb.append(front).append("\n");
                    break;

                case "back":
                    Integer back = deque.peekLast();
                    if (back == null) sb.append("-1").append("\n");
                    else sb.append(back).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
