package programmers.level1;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class P12932_자연수_뒤집어_배열로_만들기 {

    public static int[] solution(long n) {
        String string = Long.toString(n);
        int len = string.length();
        int[] answer = new int[len];

        char[] charArray = string.toCharArray();
        for (int i=len-1, j=0; i>=0; j++, i--) {
            answer[j] = charArray[i] - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
