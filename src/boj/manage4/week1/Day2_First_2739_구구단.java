package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2739
 */
public class Day2_First_2739_구구단 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 ~ 9 사이의 숫자를 입력하세요: ");
        int num = sc.nextInt();

        for (int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
