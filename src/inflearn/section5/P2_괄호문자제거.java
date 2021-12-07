package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 설명
 * - 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * 입력
 * - 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * - 남은 문자만 출력한다.
 */
public class P2_괄호문자제거 {

    public static String solution(String str) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isAlphabetic(x) && stack.isEmpty()) sb.append(x);
            else {
                if (x == ')') while (stack.pop() != '(');
//                    while (true) {
//                        // 여는 괄호가 나올때까지 pop
//                        if (stack.peek() == '(') break;
//                        stack.pop();
//                    }
//                    // 여는괄호 제거
//                    stack.pop();
                else stack.push(x);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
