package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 설명
 * - N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * - 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * - 첫 자리부터의 연속된 0은 무시한다.
 * 입력
 * - 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * - 각 자연수의 크기는 100,000를 넘지 않는다.
 * 출력
 * - 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 */
public class P6_뒤집은소수 {

    public static List<Integer> solution(int n, int[] arr) {

        List<Integer> list = new ArrayList<>();

//        for (int i=0; i<n; i++) {
//
//            StringBuilder sb = new StringBuilder(String.valueOf(arr[i]));
//
//            int temp = Integer.parseInt(sb.reverse().toString());
//
//            if (isPrise(temp)) list.add(temp);
//        }

        for (int i=0; i<n; i++) {

            int temp = arr[i];
            int res = 0;

            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp /= 10;
            }

            if (isPrise(res)) list.add(res);
        }

        return list;
    }

    public static boolean isPrise(int n) {

        boolean prime = true;

        if (n == 1) prime = false;

        for (int i=2; i<=(int)Math.sqrt(n); i++) {

            if (n % i == 0) {
                prime = false;
                break;
            }

        }

        return prime;
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
