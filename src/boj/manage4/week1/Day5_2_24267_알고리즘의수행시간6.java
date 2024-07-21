package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/24267
 */
public class Day5_2_24267_알고리즘의수행시간6 {

    public int menOfPassion(int[] a, int n) {
        int sum = 0;
        for (int i=1; i<=n-2; i++) {
            for (int j=i+1; j<=n-1; j++) {
                for (int k=j+1; k<=n; k++) {
                    sum = sum + a[i] * a[j] * a[k];
                }
            }
        }
        return sum;
    }
    // n = 7
    // i = 1, j = 2, k = 3 ~ 7 [5] -> n-2
    // i = 1, j = 3, k = 4 ~ 7 [4] -> n-3
    // i = 1, j = 4, k = 5 ~ 7 [3] -> n-4
    // i = 1, j = 5, k = 6 ~ 7 [2] -> n-5
    // i = 1, j = 6, k =     7 [1] -> n-6
    // i = 2, j = 3, k = 4 ~ 7 [4] -> n-3
    // i = 2, j = 4, k = 5 ~ 7 [3] -> n-4
    // i = 2, j = 5, k = 6 ~ 7 [2] -> n-5
    // i = 2, j = 6, k =     7 [1] -> n-6
    // i = 3, j = 4, k = 5 ~ 7 [3] -> n-4
    // i = 3, j = 5, k = 6 ~ 7 [2] -> n-5
    // i = 3, j = 6, k =     7 [1] -> n-6
    // i = 4, j = 5, k = 6 ~ 7 [2] -> n-5
    // i = 4, j = 6, k =     7 [1] -> n-6
    // i = 5, j = 6, k =     7 [1] -> n-6

    public static long menOfPassion(int n) {
        return (long) n * (n - 1) * (n - 2) / 6;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 500,000 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        System.out.println(menOfPassion(n));
        System.out.println(3);
    }
}
