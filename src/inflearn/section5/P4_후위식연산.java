package inflearn.section5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 설명
 * - 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * - 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * 입력
 * - 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * - 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 * 출력
 * - 연산한 결과를 출력합니다.
 */
public class P4_후위식연산 {

    public static int solution(String str) {

        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else stack.push(lt / rt);
            }
        }

        return stack.get(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
