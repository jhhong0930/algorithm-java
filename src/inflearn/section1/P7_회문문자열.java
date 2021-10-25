package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_회문문자열 {

    public static String solution(String str) {

        str = str.toUpperCase();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {

            if (str.charAt(lt) != str.charAt(rt)) {
                return "NO";
            } else {
                lt++;
                rt--;
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }
}
