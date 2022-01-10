package programmers.level1;

public class P86051_없는_숫자_더하기 {

    public static int solution(int[] numbers) {

        int answer = 45;

        for (int x : numbers) answer -= x;

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};

        System.out.println(solution(numbers1));
        System.out.println(solution(numbers2));
    }
}
