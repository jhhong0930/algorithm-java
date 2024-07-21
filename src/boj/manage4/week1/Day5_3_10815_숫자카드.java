package boj.manage4.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10815
 */
public class Day5_3_10815_숫자카드 {

    public static void solution(int[] nArr, int[] mArr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nArr) {
            map.put(num, true);
        }

        List<Integer> answer = new ArrayList<>();
        // containsKey   -> O(1)
        // containsValue -> O(N)
        for (int num : mArr) {
            if (map.containsKey(num)) {
                answer.add(1);
            } else {
                answer.add(0);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer num : answer) {
            sb.append(num);
            sb.append(" ");
        }

        System.out.println(sb);
    }

    // 또는 배열을 만들어서 카드의 숫자를 인덱스로 접근하는 방법 이용
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
