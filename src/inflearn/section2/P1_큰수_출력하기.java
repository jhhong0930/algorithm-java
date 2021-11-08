package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 */
public class P1_큰수_출력하기 {

    public static List<Integer> solution(int n, int[] arr) {

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i=1; i<n; i++) {
            if (arr[i - 1] < arr[i]) list.add(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (Integer i : solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
