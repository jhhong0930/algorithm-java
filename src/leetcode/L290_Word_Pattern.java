package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L290_Word_Pattern {

    public static boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        char[] patternArr = pattern.toCharArray();
        String[] sArr = s.split(" ");

        if (patternArr.length != sArr.length) return false;

        for (int i=0; i<pattern.length(); i++) {
            if (map.get(patternArr[i]) == null) {
                if (map2.containsKey(sArr[i])) return false;
                else {
                    map.put(patternArr[i], sArr[i]);
                    map2.put(sArr[i], patternArr[i]);
                }
            }
            else {
                if (!map.get(patternArr[i]).equals(sArr[i])) return false;
            }

//            if (!map.containsKey(patternArr[i])) {
//                if (map2.get(sArr[i]) == null) {
//                    map.put(patternArr[i], sArr[i]);
//                    map2.put(sArr[i], patternArr[i]);
//                }
//            }
//            else {
//                if (!map.get(patternArr[i]).equals(sArr[i])) return false;
//            }
        }

        return true;
    }

    public static void main(String[] args) {

        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        String pattern3 = "aaaa";
        String s3 = "dog cat cat dog";
        String pattern4 = "abba";
        String s4 = "dog dog dog dog";

//        System.out.println(wordPattern(pattern1, s1));
//        System.out.println(wordPattern(pattern2, s2));
//        System.out.println(wordPattern(pattern3, s3));
        System.out.println(wordPattern(pattern4, s4));
    }
}
