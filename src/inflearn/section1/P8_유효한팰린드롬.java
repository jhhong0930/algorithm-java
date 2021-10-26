package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8_유효한팰린드롬 {

    public static String solution(String str) {

        str = str.toUpperCase();
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {

            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {

                if (s[lt] != s[rt]) {
                    return "NO";
                } else {
                    lt++;
                    rt--;
                }
            }
        }

        return "YES";

        // 강의 코드
//        String answer = "NO";
//
//        str = str.toUpperCase().replaceAll("[^A-Z]", "");
//
//        String temp = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(temp)) answer = "YES";
//
//        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

}
