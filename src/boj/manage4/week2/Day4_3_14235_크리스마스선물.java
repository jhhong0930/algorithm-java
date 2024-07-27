package boj.manage4.week2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/14235
 */
public class Day4_3_14235_크리스마스선물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print("1 ~ 5,000 사이의 방문 횟수를 입력하세요:");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                if (pq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                for (int j=1; j<=a; j++) {
                    pq.add(sc.nextInt());
                }
            }
        }
    }
}
