package boj.manage4.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/11557
 */
public class Day5_2_11557_YangjojangOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스의 개수를 입력하세요: ");
        int t = sc.nextInt();
        for (int i=1; i<=t; i++) {
            System.out.print("1 ~ 100 사이의 학교 개수를 입력하세요: ");
            int n = sc.nextInt();
            sc.nextLine();
            Map<String, Integer> map = new HashMap<>();

            for (int j=1; j<=n; j++) {
                String name = sc.nextLine();
                int amount = sc.nextInt();
                sc.nextLine();
                map.put(name, amount);
            }

            int max = 0;
            String answer = "";
            for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
                if (entrySet.getValue() > max) {
                    max = entrySet.getValue();
                    answer = entrySet.getKey();
                }
            }

            System.out.println(answer);
        }
    }
}
