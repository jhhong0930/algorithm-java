package boj.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110_더하기사이클 {

    public static int solution(int n) {

        int count = 0;
        int copy = n;

        do {
            n = (n % 10) * 10 + (((n / 10) + (n % 10)) % 10);
            count++;
            if(n == copy) break;
        } while(copy != n);

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }
}
