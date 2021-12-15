package inflearn.section6;

import java.util.Scanner;

/**
 * 설명
 * - N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * - 정렬하는 방법은 삽입정렬입니다.
 * 입력
 * - 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * - 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * 출력
 * - 오름차순으로 정렬된 수열을 출력합니다.
 */
public class P3_삽입정렬 {

    private static int[] solution(int n, int[] arr) {

        for (int i=1; i<n; i++) {
            int temp = arr[i], j;
            for (j=i-1; j>=0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }

            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}
