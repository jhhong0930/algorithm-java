package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 설명
 * - 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * - (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 입력
 * - 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출력
 * - 첫 번째 줄에 YES, NO를 출력한다.
 */
public class P1_올바른_괄호 {

    public static String solution(String str) {

        char[] c = str.toCharArray();
        int len = c.length;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<len; i++) {
            // 첫 괄호가 닫는 괄호일 때
            if (i == 0 && c[i] == ')') return "NO";
            // 여는 괄호면 스택에 추가
            if (c[i] == '(') stack.add(c[i]);
            else { // 닫는 괄호일 때
                if (stack.isEmpty()) return "NO";
                // 쌍이 맞다면 쌓여있던 여는 괄호를 제거
                else stack.pop();
            }
        }

        if (stack.isEmpty()) return "YES";
        // 쌍이 맞지 않아서 여는 괄호가 남아있을 때
        else return "NO";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
