package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9_숫자만추출 {

    public static int solution(String str) {

        StringBuilder sb = new StringBuilder();

        char[] temp = str.toCharArray();

        for (char x : temp) {

            if (!Character.isAlphabetic(x)) {
                sb.append(x);
            }
        }

        return Integer.parseInt(sb.toString());

        // 강의코드 1
//        String answer = "";
//
//        for (char x : str.toCharArray()) {
//            if (Character.isDigit(x)) answer += x;
//        }
//
//        return Integer.parseInt(answer);

        // 강의코드 2
//        int answer = 0;
//
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//        }
//
//        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
