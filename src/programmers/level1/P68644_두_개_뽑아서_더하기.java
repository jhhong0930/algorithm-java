package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P68644_두_개_뽑아서_더하기 {

    static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<numbers.length; i++) {

            for (int j=i+1; j<numbers.length; j++) {

                int temp = numbers[i] + numbers[j];

                if (!list.contains(temp)) list.add(temp);
            }

        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        System.out.println(Arrays.toString(solution((numbers1))));
        System.out.println(Arrays.toString(solution((numbers2))));
    }

}
