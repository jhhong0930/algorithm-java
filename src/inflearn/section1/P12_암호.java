package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_암호 {

    public static String solution(int n, String str) {

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {

            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');

            int num = Integer.parseInt(temp, 2);

            sb.append((char)num);

            str = str.substring(7);
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        System.out.println(solution(n, str));
    }
}
