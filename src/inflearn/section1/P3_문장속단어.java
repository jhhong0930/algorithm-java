package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_문장속단어 {

    public static String solution(String str) {

        String[] temp = str.split(" ");
        int maxLen = 0;
        int maxIdx = 0;

        for (int i=0; i<temp.length; i++) {

            if (temp[i].length() > maxLen) {
                maxLen = temp[i].length();
                maxIdx = i;
            }
        }

        return temp[maxIdx];
    }

        // 강의 코드 v1
//        String answer = "";
//        int m = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//
//        for (String x : s) {
//
//            int len = x.length();
//
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
//
//        return answer;

        // 강의 코드 v2
//        String answer = "";
//        int m = Integer.MIN_VALUE, pos;
//
//        while ((pos = str.indexOf(' ')) != -1) {
//
//            String temp = str.substring(0, pos);
//
//            int len = temp.length();
//
//            if (len > m) {
//                m = len;
//                answer = temp;
//            }
//
//            str = str.substring(pos + 1);
//        }
//
//        // 마지막 단어
//        if (str.length() > m) answer = str;
//
//        return answer;
//    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

}
