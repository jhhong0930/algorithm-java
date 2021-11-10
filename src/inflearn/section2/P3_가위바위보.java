package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설명
 * - A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * - 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * - 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 입력
 * - 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * - 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * - 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 출력
 * - 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 */
public class P3_가위바위보 {

    public static void solution(int n, int[] a, int[] b) {

//        for (int i=0; i<n; i++) {
//
//            switch (a[i]) {
//                case 1:
//                    if (b[i] == 1) {
//                        System.out.println("D");
//                    } else if (b[i] == 2) {
//                        System.out.println("B");
//                    } else {
//                        System.out.println("A");
//                    }
//                    break;
//                case 2:
//                    if (b[i] == 1) {
//                        System.out.println("A");
//                    } else if (b[i] == 2) {
//                        System.out.println("D");
//                    } else {
//                        System.out.println("B");
//                    }
//                    break;
//                case 3:
//                    if (b[i] == 1) {
//                        System.out.println("B");
//                    } else if (b[i] == 2) {
//                        System.out.println("A");
//                    } else {
//                        System.out.println("D");
//                    }
//                    break;
//            }
//        }

        for (int i=0; i<n; i++) {

            if (a[i] == b[i]) System.out.println("D");
            else if (a[i] == 1 && b[i] == 3) System.out.println("A");
            else if (a[i] == 2 && b[i] == 1) System.out.println("A");
            else if (a[i] == 3 && b[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<n; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }

        solution(n, a, b);
    }
}
