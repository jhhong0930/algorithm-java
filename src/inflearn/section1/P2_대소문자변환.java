package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_대소문자변환 {

    public static String solution(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {

            char temp = str.charAt(i);

            if (temp <= 90) {
                sb.append(Character.toLowerCase(temp));
            } else {
                sb.append(Character.toUpperCase(temp));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

}
