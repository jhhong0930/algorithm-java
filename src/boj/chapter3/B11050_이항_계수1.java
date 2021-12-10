package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050_이항_계수1 {

    public static int solution(int n, int k) {

        return factorial(n) / (factorial(n - k) * factorial(k));
    }

    static int factorial(int num) {

        if (num <= 1)	{
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(n, k));
    }
}
