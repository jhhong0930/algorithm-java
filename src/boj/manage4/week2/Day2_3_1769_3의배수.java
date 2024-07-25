package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1769
 */
public class Day2_3_1769_3의배수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        String x = sc.nextLine();

        int count = 0;
        while (x.length() != 1) {
            int sum = 0;
            for (char c : x.toCharArray()) {
                sum += Character.getNumericValue(c);
            }

            x = String.valueOf(sum);
            count++;
        }

        System.out.println(count);
        if (Integer.parseInt(x) % 3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
