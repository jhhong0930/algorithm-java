package programmers.kakao;

import java.util.Stack;

public class P64061_크레인_인형뽑기_게임 {

    public static int solution(int[][] board, int[] moves) {

        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {

                int doll = board[j][move - 1];

                if (doll != 0) {
                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(doll);

                    board[j][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }
}
