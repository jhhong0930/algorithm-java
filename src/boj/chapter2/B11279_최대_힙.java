package boj.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B11279_최대_힙 {

    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    public static void solution(int num) {

        if (num == 0) {
            if (pq.isEmpty()) System.out.println(0);
            else System.out.println(pq.remove());
        } else pq.add(num);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            solution(Integer.parseInt(br.readLine()));
        }
    }
}
