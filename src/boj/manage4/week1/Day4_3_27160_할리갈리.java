package boj.manage4.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/27160
 */
public class Day4_3_27160_할리갈리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 100,000 사이의 카드 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i=1; i<=n; i++) {
            System.out.print("과일을 입력하세요: ");
            String fruit = sc.next();
            System.out.print("개수를 입력하세요: ");
            int x = sc.nextInt();
            sc.nextLine();

            map.put(fruit, map.getOrDefault(fruit, 0) + x);
        }

        boolean answer = false;
        for (Integer value : map.values()) {
            if (value == 5) {
                answer = true;
                break;
            }
        }

        if (answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
