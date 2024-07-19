package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/24416
 */
public class Day3_1_24416_피보나치수1 {

    private static int fibCount = 0;
    private static int fibonacciCount = 0;

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount++;
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i=3; i<=n; i++) {
            fibonacciCount++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("5 ~ 40 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        fib(n);
        fibonacci(n);
        System.out.printf("%d %d", fibCount, fibonacciCount);
    }
}
