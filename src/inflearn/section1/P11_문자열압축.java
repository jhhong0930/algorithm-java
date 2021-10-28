package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_문자열압축 {

    public static String solution(String str) {

        StringBuilder sb = new StringBuilder();

        int length = str.length();

        int count = 1; // 압축 가능한 개수

        char temp = str.charAt(0); // 문자가 연속되는지 파악 용도

        sb.append(temp); // 첫 문자열 담기

        for (int i=1; i<length; i++) {

            if (str.charAt(i) == temp) { // 문자가 연속 될 때
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
                sb.append(str.charAt(i)); // 다음 문자 담기
                temp = str.charAt(i); // 비교를 위한 문자 바꾸기
            }

            if (i == length - 1 && count > 1) sb.append(count); // 마지막 문자
        }

        return sb.toString();

        // 강의 코드
//        String answer = "";
//
//        str = str + " ";
//
//        int cnt = 1;
//
//        for (int i=0; i< str.length()-1; i++) {
//
//            if (str.charAt(i) == str.charAt(i + 1)) {
//                cnt++;
//            } else {
//                answer += str.charAt(i);
//                if (cnt > 1) answer += String.valueOf(cnt);
//                cnt = 1;
//            }
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
