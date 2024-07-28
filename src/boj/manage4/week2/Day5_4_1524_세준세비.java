package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1524
 */
public class Day5_4_1524_세준세비 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 100 사이의 테스트 케이스 개수를 입력하세요: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            sc.nextLine();
            int n = sc.nextInt();
            int m = sc.nextInt();

            int maxS = 0;
            for (int j = 0; j < n; j++) {
                int strength = sc.nextInt();
                if (strength > maxS) {
                    maxS = strength;
                }
            }

            int maxB = 0;
            for (int j = 0; j < m; j++) {
                int strength = sc.nextInt();
                if (strength > maxB) {
                    maxB = strength;
                }
            }

            // 서로 동등하면 세비의 병사가 죽는다.
            if (maxS >= maxB) {
                System.out.println("S");
            } else {
                System.out.println("B");
            }
        }
    }
}
