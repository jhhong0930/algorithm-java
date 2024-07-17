package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2445
 */
public class Day2_Third_2445_별찍기 {
    /**
     * n = 5, length = 9
     * 1회 1       9  1XXXXXXX9
     * 2회 12     89  12XXXXX89
     * 3회 123   789  123XXX789
     * 4회 1234 6789  1234X6789
     * 5회 123456789  123456789
     * 6회 1234 6789  1234X6789
     * 7회 123   789  123XXX789
     * 8회 12     89  12XXXXX89
     * 9회 1       9  1XXXXXXX9
     * 상단과 하단 그리고 각 행의 별과 공백
     */
    public static void solution() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 100 사이의 숫자를 입력하세요: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                sb.append("*");
            }
            for (int j=1; j<=2*(num-i); j++) {
                sb.append(" ");
            }
            for (int j=1; j<=i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i=num-1; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                sb.append("*");
            }
            for (int j=1; j<=2*(num-i); j++) {
                sb.append(" ");
            }
            for (int j=1; j<=i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        solution();
    }
}
