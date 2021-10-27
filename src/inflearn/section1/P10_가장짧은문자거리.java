package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10_가장짧은문자거리 {

    public static int[] solution(String str, char c) {

        int length = str.length();
        int[] answer = new int[length];
        int temp = 101;

        for (int i=0; i<length; i++) {

            if (str.charAt(i) == c) {
                temp = 0;
                answer[i] = temp;
            } else {
                temp++;
                answer[i] = temp;
            }
        }

        temp = 101;

        for (int i=length-1; i>=0; i--) {

            if (str.charAt(i) == c) {
                temp = 0;
                answer[i] = temp;
            } else {
                temp++;
                answer[i] = Math.min(answer[i], temp);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char c = (char)br.read();

        System.out.println(Arrays.toString(solution(str, c)));
    }
}
