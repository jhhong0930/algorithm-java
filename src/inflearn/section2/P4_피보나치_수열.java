package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 설명
 * - 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * - 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * 입력
 * - 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * 출력
 * - 첫 줄에 피보나치 수열을 출력합니다.
 */
public class P4_피보나치_수열 {

    // 배열을 사용하는 경우
//    public static int[] solution(int n) {
//
//        int[] answer = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//
//        for (int i=2; i<n; i++) {
//            answer[i] = answer[i - 2] + answer[i - 1];
//        }
//
//        return answer;
//    }

    public static void solution(int n) {

        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i=2; i<n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

//        System.out.println(Arrays.toString(solution(n)));
        solution(n);
    }
}
