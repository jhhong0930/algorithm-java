package woowa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

    public static int[] solution(String s) {

        List<Integer> list = new ArrayList<>();
        int len = s.length();
        int count = 0;
        char temp = s.charAt(0); // 문자가 연속되는지 파악

        for (int i=0; i<len; i++) {
            if (s.charAt(i) == temp) { // 같으면 증가
                count++;
            } else { // 다르면 리스트에 저장 후 count 1로 초기화
                list.add(count);
                temp = s.charAt(i);
                count = 1;
            }
        }

        // 첫 문자와 마지막 문자가 연결될 때
        if (s.charAt(0) == s.charAt(len - 1)) {
            int tempCount = list.get(0);
            list.set(0, tempCount + count);
        } else { // 다르면 마지막 구간의 길이 저장
            list.add(count);
        }

        int[] answer = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        String s1 = "aaabbaaa";

        System.out.println(solution(s1));
    }
}
