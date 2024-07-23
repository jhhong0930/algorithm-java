package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/12605
 */
public class Day1_2_12605_단어순서뒤집기 {
    private static void solution(int num, String str) {
        String[] strArr = str.split(" ");
        // 200ms
//        int left = 0;
//        int right = strArr.length-1;
//        while (left < right) {
//            String temp = strArr[left];
//            strArr[left] = strArr[right];
//            strArr[right] = temp;
//            left++;
//            right--;
//        }

        StringBuilder sb = new StringBuilder();
        sb.append("Case #").append(num).append(":");
        // 204ms
        for (int i= strArr.length-1; i>=0; i--) {
            sb.append(" ").append(strArr[i]);
        }

        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("케이스 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++) {
            System.out.print("1 ~ 25 사이의 길이 문자열을 입력하세요: ");
            solution(i, sc.nextLine());
        }
    }
}
