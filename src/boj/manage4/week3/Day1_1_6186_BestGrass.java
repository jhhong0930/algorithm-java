package boj.manage4.week3;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/6186
 */
public class Day1_1_6186_BestGrass {
    private static int r;
    private static int c;
    private static char[][] pasture;
    private static boolean[][] visited;
    private static int[] moveRow = {-1, 1, 0, 0};
    private static int[] moveCol = {0, 0, -1, 1};

    private static void dfs(int row, int col) {
        visited[row][col] = true; // 재 방문하지 않도록 표시

        for (int i=0; i<4; i++) { // 상 하 좌 우로 이동하며 풀이 있는지 체크
            int movedRow = row + moveRow[i];
            int movedCol = col + moveCol[i];
            // 유효 범위 내이고 방문하지 않은 풀이면 다음 풀을 찾아서 이동
            if (isValid(movedRow, movedCol) && pasture[movedRow][movedCol] == '#' && !visited[movedRow][movedCol]) {
                dfs(movedRow, movedCol);
            }
        }
    }

    /**
     * 좌표가 목장 크기 이내인지 체크한다.
     *
     * @param row
     * @param col
     * @return
     */
    private static boolean isValid(int row, int col) {
        return row >= 0 && row < r && col >= 0 && col < c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();
        pasture = new char[r][c];
        visited = new boolean[r][c];

        // 목장 생성
        for (int i=0; i<r; i++) {
            String row = sc.nextLine();
            for (int j=0; j<c; j++) {
                pasture[i][j] = row.charAt(j);
            }
        }

        int clumps = 0;

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (pasture[i][j] == '#' && !visited[i][j]) {
                    dfs(i, j);
                    clumps++;
                }
            }
        }

        System.out.println(clumps);
    }
}
