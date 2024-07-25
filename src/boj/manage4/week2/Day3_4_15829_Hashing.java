package boj.manage4.week2;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/15829
 */
public class Day3_4_15829_Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        int r = 31;
        int mod = 1234567891;
        long value = 0;
        long pow = 1;
        for (int i=0; i<l; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            value = (value + charValue * pow) % mod;
            pow = (pow * r) % mod;
        }

        System.out.println(value);
    }
}
