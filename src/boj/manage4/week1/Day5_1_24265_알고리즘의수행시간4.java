package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/24265
 */
public class Day5_1_24265_알고리즘의수행시간4 {

    public int menOfPassion(int[] a, int n) {
        int sum = 0;
        for (int i=1; i<=n-1; i++) {
            for (int j=i+1; j<=n; j++) {
                sum = sum + a[i] * a[j];
            }
        }
        return sum;
    }
    // n = 7
    // i = 1, j = 2 ~ 7 [6] -> n-1
    // i = 2, j = 3 ~ 7 [5] -> n-2
    // i = 3, j = 4 ~ 7 [4] -> n-3
    // i = 4, j = 5 ~ 7 [3] -> n-4
    // i = 5, j = 6 ~ 7 [2] -> n-5
    // i = 6, j =     7 [1] -> n-6

    public static long menOfPassion(int n) {
        return (long) n * (n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 500,000 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        System.out.println(menOfPassion(n));
        System.out.println(2);
    }
}
