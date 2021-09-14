package programmers.level1;

public class P68935_3진법_뒤집기 {

    static int solution(int n) {

        int answer;

        String str = "";

        while (n != 0) {
            str += Integer.toString(n % 3);
            n /= 3;
        }

        answer = Integer.parseInt(str, 3);

        return answer;
    }

    public static void main(String[] args) {

        int n1 = 45;
        int n2 = 125;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }

}
