package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399_ATM {

    public static int solution(int n, int[] arr) {

        Arrays.sort(arr);
        int answer = 0;
        int cnt = 0;

        while (cnt < n) {
            int sum = 0;
            for (int i=0; i<=cnt; i++) {
                sum += arr[i];
            }
            answer += sum;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arr));
    }
}