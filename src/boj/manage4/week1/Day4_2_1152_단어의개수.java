package boj.manage4.week1;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1152
 */
public class Day4_2_1152_단어의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.trim().isEmpty()) {
            System.out.println(0);
        } else {
            String[] strArr = str.trim().split(" ");
            System.out.println(strArr.length);
        }
    }
}
