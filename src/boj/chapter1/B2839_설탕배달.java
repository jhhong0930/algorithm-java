package boj.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839_설탕배달 {

    public static int solution(int n) {

        int answer = 0;

        if (n == 4 || n == 7) answer =  -1;
        else if (n % 5 == 0) answer = n / 5;
        else if (n % 5 == 1 || n % 5 == 3) answer = n / 5 + 1;
        else if (n % 5 == 2 || n % 5 == 4) answer = n / 5 + 2;

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }
}
