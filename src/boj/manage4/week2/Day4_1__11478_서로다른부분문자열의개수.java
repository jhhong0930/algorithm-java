package boj.manage4.week2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.acmicpc.net/problem/11478
 */
public class Day4_1__11478_서로다른부분문자열의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 1000 사이의 문자열을 입력하세요: ");
        String s = sc.nextLine();
        Set<String> set = new HashSet<>();

        for (int i=1; i<=s.length(); i++) {
            for (int j=0; j<=s.length()-i; j++) {
                set.add(s.substring(j, j + i));
            }
        }

        System.out.println(set.size());

//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(1, 2));
//        System.out.println(str.substring(2, 3));
//        System.out.println(str.substring(3, 4));
//        System.out.println(str.substring(4, 5));
//
//        System.out.println(str.substring(0, 2));
//        System.out.println(str.substring(1, 3));
//        System.out.println(str.substring(2, 4));
//        System.out.println(str.substring(3, 5));
//
//        System.out.println(str.substring(0, 3));
//        System.out.println(str.substring(1, 4));
//        System.out.println(str.substring(2, 5));
//
//        System.out.println(str.substring(0, 4));
//        System.out.println(str.substring(1, 5));
//
//        System.out.println(str.substring(0, 5));
    }
}
