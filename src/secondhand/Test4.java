package secondhand;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test4 {

    public static int solution(int K, String[] user_scores) {

        int answer = 0;
        int temp = 0;

        Map<String, Integer> map = new HashMap<>();

        for (String x : user_scores) {

            String[] info = x.split(" ");
            String name = info[0];
            int score = Integer.parseInt(info[1]);

            if (temp != K) {
                map.put(name, score);
                answer++;
                temp++;
            } else {
                int min = Collections.min(map.values());
                if (!map.containsValue(score) && score > min) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int k1 = 3;
        int k2 = 3;
        int k3 = 2;

        String[] user_scores1 = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        String[] user_scores2 = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};
        String[] user_scores3 = {"cheries2 200", "alex111 100", "coco 150", "puyo 120"};

        System.out.println(solution(k1, user_scores1));
        System.out.println(solution(k2, user_scores2));
        System.out.println(solution(k3, user_scores3));
    }
}
