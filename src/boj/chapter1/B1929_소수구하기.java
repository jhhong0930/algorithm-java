package boj.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929_소수구하기 {

//    public static void solution(int m, int n) {
//
//        for (int i=m; i<=n; i++) {
//            if (isPrime(i)) System.out.println(i);
//        }
//    }
//
//    static boolean isPrime(int num) {
//
//        for (int i=2; i<=(int)Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//
//        return true;
//    }

    public static void solution(int m, int n) {

        boolean[] prime = new boolean[n + 1];

        isPrime(prime);

        for (int i=m; i<=n; i++) {
            if (!prime[i]) System.out.println(i);
        }
    }

    public static void isPrime(boolean[] prime) {

        prime[0] = prime[1] = true;

        for (int i=2; i<=(int)Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j=i*i; j< prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        solution(m, n);
    }
}
