package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1541_잃어버린_괄호 {

    public static int solution(String str) {

        String[] temp = str.split("\\+|-");

        for (String s : temp) {
            System.out.println(s);
        }

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }
}
