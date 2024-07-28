package boj.manage4.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.acmicpc.net/problem/16466
 */
public class Day5_3_16466_콘서트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 1,000,000 사이의 티켓 개수를 입력하세요: ");
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            System.out.printf("%d 번째 티켓의 번호를 입력하세요: ", i+1);
            set.add(sc.nextInt());
        }

        int target = 1;
        for (int i=0; i<n; i++) {
            if (!set.contains(target)) {
                break;
            }
            target++;
        }

        System.out.println(target);
    }
}
