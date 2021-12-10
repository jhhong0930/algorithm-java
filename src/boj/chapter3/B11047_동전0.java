package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047_동전0 {

    public static int solution(int n, int k, int[] arr) {

        int count = 0;

        for (int i=n-1; i>=0; i--) {
            if (arr[i] <= k) {
                count += k / arr[i];
                k %= arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(n, k, arr));
    }
}
