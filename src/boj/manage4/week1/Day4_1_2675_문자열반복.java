package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2675
 */
public class Day4_1_2675_문자열반복 {
    public static void solution(int repeat, String str) {
        StringBuilder sb = new StringBuilder();
        if (repeat == 1) {
            sb.append(str);
        } else {
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                repeat(sb, c, repeat);
            }
        }

        System.out.println(sb);
    }

    public static void repeat(StringBuilder sb, char c, int repeat) {
        for (int i=1; i<=repeat; i++) {
            sb.append(c);
        }
    }

    /**
     * t(테스트 케이스 개수): 1 ~ 1,000
     * r(문자열 반복 횟수): 1 ~ 8
     * s(문자열 길이): 1 ~ 20
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 1,000 사이의 테스트 케이스 개수를 입력하세요: ");
        int t = sc.nextInt();

        for (int i=1; i<=t; i++) {
            System.out.print("1 ~ 8 사이의 반복 횟수를 입력하세요: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("1 ~ 20 사이 길이의 문자열을 입력하세요: ");
            String s = sc.nextLine();
            solution(r, s);
        }
    }
}
