package boj.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11866_요세푸스_문제0 {

    public static void solution(int n, int k) {

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        sb.append('<');

        for (int i=1; i<=n; i++) q.add(i);

        while (q.size() > 1) {
            for (int i=0; i<k-1; i++) q.offer(q.poll());
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        solution(n, k);
    }
}
