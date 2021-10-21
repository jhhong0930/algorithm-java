package inflearn.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4_단어뒤집기 {

    public static void solution(String[] strArr) {

        for (String s : strArr) {
            System.out.println(new StringBuilder(s).reverse());
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] strArr = new String[n];

        for (int i=0; i<n; i++) {
            strArr[i] = br.readLine();
        }

        solution(strArr);
    }
}
