package boj.manage4.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/31562
 */
public class Day3_3_31562_전주듣고노래맞히기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 1,000 사이의 노래 개수를 입력하세요: ");
        int n = sc.nextInt();
        System.out.print("1 ~ 1,000 사이의 시도할 노래 개수를 입력하세요: ");
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, String> map = new HashMap<>();

        for (int i=1; i<=n; i++) {
            System.out.print("곡 명과 코드를 입력하세요: ");
            String[] input = sc.nextLine().split(" ");
            String title = input[1];
            String chord = input[2] + input[3] + input[4];
            map.put(title, chord);
        }

        for (int i=1; i<=m; i++) {
            System.out.print("코드를 입력하세요: ");
            String[] input = sc.nextLine().split(" ");
            String targetChord = input[0] + input[1] + input[2];

            int count = 0;
            String title = "";
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(targetChord)) {
                    title = entry.getKey();
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(title);
            } else if (count > 1) {
                System.out.println("?");
            } else {
                System.out.println("!");
            }
        }
    }
}
