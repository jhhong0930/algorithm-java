package boj.manage4.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9372
 */
public class Day1_4_9372_상근이의여행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j=1; j<=m; j++) {
                sc.nextInt();
                sc.nextInt();
            }

            System.out.println(n-1);
        }
    }
}



