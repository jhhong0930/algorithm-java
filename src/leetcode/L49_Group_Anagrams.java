package leetcode;

import java.util.*;

public class L49_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String str = String.valueOf(temp);
            if (!map.containsKey(str)) map.put(str, new ArrayList<>());
            map.get(str).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {""};

        System.out.println(groupAnagrams(strs));
    }
}
