package boj.manage4.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9375
 */
public class Day4_4_9375_패션왕신해빈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 100 사이의 테스트 케이스 개수를 입력하세요: ");
        int t = sc.nextInt();

        for (int i=1; i<=t; i++) {
            Map<String, Integer> map = new HashMap<>();
            System.out.print("0 ~ 30 사이의 의상의 개수를 입력하세요: ");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 0) {
                System.out.println(0);
                continue;
            }

            for (int j=1; j<=n; j++) {
                System.out.print("의상의 이름과 타입을 입력하세요: ");
                String type = sc.nextLine().split(" ")[1];
                map.put(type, map.getOrDefault(type, 1) + 1); // 해당 타입을 입지 않는 경우도 포함
            }

            int count = 1;
            for (Integer value : map.values()) {
                count *= value;
            }

            System.out.println(count - 1); // 아무것도 입지 않는 경우는 제외
        }
    }
}
