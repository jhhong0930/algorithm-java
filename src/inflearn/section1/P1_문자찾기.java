package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_문자찾기 {

    public static int solution(String str, char c) {

        int count = 0;

        str = str.toUpperCase();

        c = Character.toUpperCase(c);

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        char c = (char)br.read();

        System.out.println(solution(str, c));
    }

}
