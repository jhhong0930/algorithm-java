package boj.manage4.week2;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1927
 */
public class Day4_2_1027_최소힙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.print("1 ~ 100,000 사이의 연산 개수를 입력하세요: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(x);
            }
        }
    }
}
