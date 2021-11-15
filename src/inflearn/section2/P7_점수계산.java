package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_점수계산 {

    public static int solution(int n, int[] arr) {

        int sum = 0;
        int max = 1;

        for (int i=0; i<n; i++) {

            if (arr[i] == 1) {
                sum += max;
                max++;
            } else {
                max = 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution(n, arr));
    }
}
