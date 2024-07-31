package boj.manage4.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/9372
 */
public class Day2_4_9372_상근이의여행 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=1; i<=t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<List<Integer>> graph = new ArrayList<>(); // 인접 리스트로 그래프 표현
            for (int j=0; j<=n; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j=1; j<=m; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            boolean[] visited = new boolean[n+1];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(1); // 첫 시작 국가 세팅
            visited[1] = true;
            int count = 0;

            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int neighbor : graph.get(current)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}



