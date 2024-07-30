package boj.manage4.week3;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1388
 */
public class Day1_2_1388_바닥장식 {
    private static int r;
    private static int c;
    private static char[][] floor;
    private static boolean[][] visited;

    private static void dfs(int row, int col, char type) {
        visited[row][col] = true;

        if (type == '-') {
            if (col + 1 < c && floor[row][col+1] == '-' && !visited[row][col+1]) {
                dfs(row, col+1, '-');
            }
        } else {
            if (row + 1 < r && floor[row+1][col] == '|' && !visited[row+1][col]) {
                dfs(row+1, col, '|');
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();
        floor = new char[r][c];
        visited = new boolean[r][c];

        // 바닥 생성
        for (int i=0; i<r; i++) {
            String row = sc.nextLine();
            for (int j=0; j<c; j++) {
                floor[i][j] = row.charAt(j);
            }
        }

        int planks = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j]) {
                    dfs(i, j, floor[i][j]);
                    planks++;
                }
            }
        }

        System.out.println(planks);
    }
}
