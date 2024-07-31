package boj.manage4.week3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/16173
 */
public class Day2_3_16173_점프왕쩰리 {
    private static int n;
    private static int[][] board;
    private static boolean[][] visited;
    private static int[] moveRow = {1, 0};
    private static int[] moveCol = {0, 1};

    private static boolean bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            // 현재 위치가 출구이면 true 반환
            if (board[row][col] == -1) {
                return true;
            }

            // 다음 이동할 위치를 계산하고 큐에 추가
            for (int i = 0; i < 2; i++) {
                int nextRow = row + moveRow[i] * board[row][col];
                int nextCol = col + moveCol[i] * board[row][col];

                if (isValid(nextRow, nextCol) && !visited[nextRow][nextCol]) {
                    queue.add(new int[]{nextRow, nextCol});
                    visited[nextRow][nextCol] = true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        if (bfs(0, 0)) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }
}