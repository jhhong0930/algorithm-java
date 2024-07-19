package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/24417
 */
public class Day3_2_24417_피보나치수2 {

    private static final int MOD = 1_000_000_007;

    private static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5 ~ 200,000,000 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        long fibCount = fib(n);
        System.out.printf("%d %d", fibCount, n - 2);
    }
}
