package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/2908
 */
public class Day4_4_2908_상수 {
    public static int reverseAndConvertToInt(String num) {
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세 자리 숫자 A를 입력하세요: ");
        String a = sc.next();
        System.out.print("세 자리 숫자 B를 입력하세요: ");
        String b = sc.next();

        int numA = reverseAndConvertToInt(a);
        int numb = reverseAndConvertToInt(b);

        System.out.println(Math.max(numA, numb));
    }
}
