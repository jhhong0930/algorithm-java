package boj.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798_블랙잭 {

    public static int solution(int n, int m, int[] arr) {

        int max = 0;

        for (int i=0; i<n; i++) {

            for (int j=i+1; j<n; j++) {

                for (int k=j+1; k<n; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum > max && sum <= m) max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }
}
