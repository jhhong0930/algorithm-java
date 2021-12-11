package secondhand;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static String solution(String vote) {

        String answer = "";

        Map<Character, Integer> map = new HashMap<>();

        Map.Entry<Character, Integer> maxEntry = null;

        for (char x : vote.toCharArray()) map.put(x, map.getOrDefault(x, 0) + 1);

//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) maxEntry = entry;
//        }
//
//        if (maxEntry.getKey() != 'C' && map.get('A') == map.get('B')) return "AB";
//
//        return maxEntry.getKey().toString();

        int max = Collections.max(map.values());
        for (Character key : map.keySet()) {
            if (map.get(key) == max) answer = key.toString();
        }

        return answer;
    }

    public static void main(String[] args) {

        String vote1 = "ABBCCCBBAB";
        String vote2 = "AAACABCBBB";
        String vote3 = "AAAABCCCCC";
        String vote4 = "AABBCC";

        System.out.println(solution(vote4));
    }
}
