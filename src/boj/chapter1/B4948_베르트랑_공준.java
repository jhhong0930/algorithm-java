package boj.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948_베르트랑_공준 {

    public static boolean[] prime = new boolean[246913];

    public static int solution(int n) {

        getPrime();
        int count = 0;

        for (int i=n+1; i<=2*n; i++) {
            if (!prime[i]) count++;
        }

        return count;
    }

    public static void getPrime() {

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            System.out.println(solution(n));
        }
    }
}
