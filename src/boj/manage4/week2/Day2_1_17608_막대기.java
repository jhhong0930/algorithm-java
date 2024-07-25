package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/17608
 */
public class Day2_1_17608_막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2 ~ 100,000 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("1 ~ 100,000 사이의 숫자를 입력하세요: ");
            arr[i] = sc.nextInt();
        }

        int top = 0;
        int count = 0;
        for (int i=n-1; i>=0; i--) {
            if (arr[i] > top) {
                top = arr[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
