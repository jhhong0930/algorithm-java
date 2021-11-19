package inflearn.section2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설명
 * - 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
 * - 김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
 * - 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * - 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
 * 입력
 * - 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
 * - 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
 * - 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
 * 출력
 * - 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 * - 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
 */
public class P11_임시반장정하기 {

    public static int solution(int n, int[][] arr) {

        int answer = 0;
        int max = Integer.MAX_VALUE;

        for (int i=1; i<=n; i++) {

            int cnt = 0;

            for (int j=1; j<=n; j++) {

                for (int k=1; k<=5; j++) {

                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][6];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=5; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println(solution(n, arr));
    }
}
