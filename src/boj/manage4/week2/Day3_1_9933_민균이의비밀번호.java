package boj.manage4.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9933
 */
public class Day3_1_9933_민균이의비밀번호 {
    private static final Map<String, Integer> passwordMap = new HashMap<>();

    private static boolean isExistPassword(String password) {
        StringBuilder sb = new StringBuilder(password);
        String reversedPassword = sb.reverse().toString();
        if (reversedPassword.equals(password)) {
            return true;
        }
        if (passwordMap.containsKey(password) || passwordMap.containsKey(reversedPassword)) {
            return true;
        } else {
            passwordMap.put(password, 0);
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("테스트 케이스 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=n; i++) {
            System.out.print("3 ~ 15 길이의 문자열을 입력하세요: ");
            String password = sc.nextLine();
            if (isExistPassword(password)) {
                System.out.println(password.length() + " " + password.charAt(password.length()/2));
            }
        }
    }
}
