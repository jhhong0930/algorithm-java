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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

}
