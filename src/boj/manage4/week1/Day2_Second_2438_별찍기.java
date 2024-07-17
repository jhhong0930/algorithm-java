package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2438
 */
public class Day2_Second_2438_별찍기 {
    /**
     * mem : 17676KB
     * time: 212ms
     */
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 100 사이의 숫자를 입력하세요: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=num; i++) {
            sb.append("*");
            System.out.println(sb);
        }
    }

    /**
     * mem : 18760KB
     * time: 332ms
     */
    public static void solution2() {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solution();
    }
}
