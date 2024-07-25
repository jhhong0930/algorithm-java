package boj.manage4.week2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1417
 */
public class Day3_2_1417_국회의원선거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 50 사이의 후보 수를 입력하세요: ");
        int n = sc.nextInt();
        System.out.print("득표 수를 입력하세요: ");
        int myVote = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0; i<n-1; i++) {
            pq.add(sc.nextInt());
        }

        int count = 0;

        while (!pq.isEmpty() && pq.peek() >= myVote) {
            int maxVote = pq.poll(); // 제일 큰 득표수를 꺼내서
            maxVote--;               // 1 감소시키고
            myVote++;                // 그 득표수를 내 득표수에 더하고
            count++;                 // 몇 번 득표수를 가져왔는지 기록하고
            pq.add(maxVote);         // 감소시킨 득표수를 다시 큐에 넣는다
        }

        System.out.println(count);
    }
}
