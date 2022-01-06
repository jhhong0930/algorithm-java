package programmers.level1;

import java.util.Arrays;

public class P77484_로또의_최고_순위와_최저_순위 {

    public static int[] solution(int[] lottos, int[] win_nums) {

        int[] answer = new int[2];
        int match = 0; // 일치 번호 개수
        int zero = 0;  // 0 개수

        for (int i=0; i<lottos.length; i++) {
            if (lottos[i] == 0) zero++;

            for (int j=0; j<win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    match++;
                    break;
                }
            }
        }

        answer[0] = Math.min(7 - (zero + match), 6); // 최고 순위
        answer[1] = Math.min(7 - match, 6);          // 최저 순위

        return answer;
    }

    public static void main(String[] args) {

        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution(lottos1, win_nums1)));
    }
}
