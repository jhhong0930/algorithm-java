package boj.manage4.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10816
 */
public class Day5_4_10816_숫자카드2 {

    public static void solution(int[] nArr, int[] mArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nArr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();

        for (int num : mArr) {
            answer.add(map.getOrDefault(num, 0));
        }

        StringBuilder sb = new StringBuilder();
        for (Integer num : answer) {
            sb.append(num);
            sb.append(" ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 500,000 사이의 숫자를 입력하세요: ");
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            System.out.print("카드의 숫자를 입력하세요: ");
            nArr[i] = sc.nextInt();
        }

        System.out.print("1 ~ 500,000 사이의 숫자를 입력하세요: ");
        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i=0; i<m; i++) {
            System.out.print("카드의 숫자를 입력하세요: ");
            mArr[i] = sc.nextInt();
        }

        solution(nArr, mArr);
    }
}
