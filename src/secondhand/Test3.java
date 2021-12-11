package secondhand;

public class Test3 {

    public static int solution(int n) {

        int answer = 0;

        if (n == 4 || n == 7) answer =  -1;
        else if (n % 5 == 0) answer = n / 5;
        else if (n % 5 == 1 || n % 5 == 3) answer = n / 5 + 1;
        else if (n % 5 == 2 || n % 5 == 4) answer = n / 5 + 2;

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(15));
        System.out.println(solution(7));
    }
}
