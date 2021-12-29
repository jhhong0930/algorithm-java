package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 설명
 * - 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
 * - 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
 * 입력
 * - 한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의 개수는 최대 100,000이다.
 * 출력
 * - 잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
 */
public class P5_쇠막대기 {

    public static int solution(String str) {

        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        int len = str.length();
        int answer = 0;

        for (int i=0; i<len; i++) {
            if (arr[i] == '(') stack.push(arr[i]);
            else {
                stack.pop();
                // 직전 괄호가 여는 괄호일 때 (레이저일 때)
                if (arr[i-1] == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
